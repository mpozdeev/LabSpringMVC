package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.UserLogin;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserRepositoryListImpl users;

    @GetMapping("/login")
    public ModelAndView main(HttpSession session) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());

        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("userLogin", new UserLogin());
        modelAndView.addObject("userList", users.getUsers());
        return modelAndView;
    }

    @PostMapping("/check-user")
    public ModelAndView checkUser(@ModelAttribute("userLogin") UserLogin userLogin) {
        if (userLogin != null) {
            User foundUser = users.getUserByName(userLogin.getUserName());
            if (foundUser != null) {
                if (userLogin.getPassword().equals(foundUser.getPassword())) {
                    return new ModelAndView("welcome", "userLogin", userLogin);
                }
            }
        }
        return new ModelAndView("wrong-login");
    }

    
}
