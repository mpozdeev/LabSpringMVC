package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView main(HttpSession session) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
        return new ModelAndView("login", "userLogin", new UserLogin());
    }

    @RequestMapping(value = "check-user", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("userLogin") UserLogin userLogin){

        return new ModelAndView("index2", "userLogin", userLogin);
    }
}
