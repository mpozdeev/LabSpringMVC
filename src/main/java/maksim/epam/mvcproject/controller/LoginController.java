package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.dao.UserLogin;
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

        return new ModelAndView("login")
                .addObject("userLogin", new UserLogin())
                .addObject("userList", users.getUsers());
    }

    @PostMapping("/check-user")
    public ModelAndView checkUser(@ModelAttribute("userLogin") UserLogin userLogin) {
        if (userLogin != null) {
            User foundUser = users.getUserByName(userLogin.getUserName());
            if (foundUser != null) {
                if (userLogin.getPassword().equals(foundUser.getPassword())) {
                    return new ModelAndView("personal-page")
                            .addObject("foundUser", foundUser)
                            .addObject("userList", users.getUsers());
                }
            }
        }
        return new ModelAndView("wrong-login");
    }

    @PostMapping("/update-user")
    public ModelAndView updateUser(@ModelAttribute("foundUser") User updUser){
        if (updUser != null) {
            long result = users.updateUser(updUser);
            if(result != -1L){
                return new ModelAndView("personal-page")
                        .addObject("foundUser", updUser)
                        .addObject("userList", users.getUsers());
            }
        }
        return new ModelAndView("wrong-login");
    }


}
