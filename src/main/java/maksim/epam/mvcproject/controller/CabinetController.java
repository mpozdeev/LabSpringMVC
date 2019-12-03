package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.dto.BookCreator;
import maksim.epam.mvcproject.repo.UserBooksRepositoryMapImpl;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class CabinetController {

    @Autowired
    private UserRepositoryListImpl users;

    @Autowired
    private UserBooksRepositoryMapImpl booksRepositoryMap;

    @PostMapping("/update-user")
    public ModelAndView updateUser(@ModelAttribute("foundUser") User updUser) {
        if (updUser != null) {
            long result = users.updateUser(updUser);
            if (result != -1L) {
                return new ModelAndView("personal-page")
                        .addObject("foundUser", updUser)
                        .addObject("userList", users.getUsers())
                        .addObject("booksList", booksRepositoryMap.getBooksList(updUser));
            }
        }
        return new ModelAndView("wrong-login");
    }

    @RequestMapping(value = "/add-new-book/{id}", method = RequestMethod.GET)
    public ModelAndView addBook(@PathVariable("id") String id) {
        User user = users.getUserById(Long.parseLong(id));
        return new ModelAndView("add-new-book")
                .addObject("user", user)
                .addObject("bookCreator", new BookCreator());
    }

}
