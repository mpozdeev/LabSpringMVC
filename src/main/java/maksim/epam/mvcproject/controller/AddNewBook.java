package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.model.dto.BookCreator;
import maksim.epam.mvcproject.repo.UserBooksRepositoryMapImpl;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNewBook {

    @Autowired
    private UserRepositoryListImpl users;

    @Autowired
    private UserBooksRepositoryMapImpl booksRepositoryMap;

    @GetMapping("/personal-page/{id}")
    public ModelAndView personalPage(@PathVariable("id") String id) {
        User user = users.getUserById(Long.parseLong(id));
        return new ModelAndView("personal-page")
                .addObject("foundUser", user)
                .addObject("userList", users.getUsers())
                .addObject("booksList", booksRepositoryMap.getBooksList(user));
    }


    @PostMapping("/create-book")
    public ModelAndView createBook(@ModelAttribute("bookCreator") BookCreator newBook) {
        if (newBook != null) {
            System.out.println("Create newBook: " + newBook.toString());
//            long result = users.updateUser(updUser);
//            if (result != -1L) {
//                return new ModelAndView("personal-page")
//                        .addObject("foundUser", updUser)
//                        .addObject("userList", users.getUsers())
//                        .addObject("booksList", booksRepositoryMap.getBooksList(updUser));
//            return new ModelAndView("personal-page")
//                    .addObject();
//            }
        }
        return new ModelAndView("wrong-login");
    }

}
