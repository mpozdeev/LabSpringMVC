package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.dao.UserLogin;
import maksim.epam.mvcproject.repo.UserBooksRepositoryMapImpl;
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
public class LoginController {

    @Autowired
    private UserRepositoryListImpl users;

    @Autowired
    private UserBooksRepositoryMapImpl booksRepositoryMap;

    @GetMapping("/login")
    public String main(HttpSession session) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
        return "login";
    }


//    @PostMapping("/check-user")
//    public ModelAndView checkUser(@ModelAttribute("userLogin") UserLogin userLogin) {
//        if (userLogin != null) {
//            User foundUser = users.getUserByName(userLogin.getUserName());
//            if (foundUser != null) {
//                if (userLogin.getPassword().equals(foundUser.getPassword())) {
//                    return new ModelAndView("personal-page")
//                            .addObject("foundUser", foundUser)
//                            .addObject("userList", users.getUsers())
//                            .addObject("booksList", booksRepositoryMap.getBooksList(foundUser));
//                }
//            }
//        }
//        return new ModelAndView("wrong-login");
//    }

}
