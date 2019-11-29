package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.enums.UserRole;
import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.dao.UserRegistration;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepositoryListImpl users;

    @GetMapping("/registration")
    public ModelAndView main(HttpSession session) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
        ModelAndView modelAndView = new ModelAndView("registration");
        modelAndView.addObject("userRegistration", new UserRegistration());
        return modelAndView;
    }

    @PostMapping("/register-user")
    public ModelAndView registerUser(@ModelAttribute("userRegistration") UserRegistration userRegistration) {
        if (userRegistration != null) {
            System.out.println("New: " + userRegistration);
            UserRole role = (userRegistration.isUserRole()) ? UserRole.ADMIN : UserRole.USER;
            User newUser = new User(
                    userRegistration.getUserName(),
                    userRegistration.getTelNumber(),
                    userRegistration.getPassword(),
                    role
            );
            users.addUser(newUser);

            for (User user : users.getUsers()){
                System.out.println(user);
            }
            return new ModelAndView("welcome-new-user", "userRegistration", userRegistration);
        }
        return new ModelAndView("wrong-login");
    }
}
