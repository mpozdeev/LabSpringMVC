package maksim.epam.mvcproject.controller;

import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShowUsers {

    @Autowired
    private UserRepositoryListImpl users;

    @RequestMapping(value="allusers", method= RequestMethod.GET)
    public ModelAndView registerPage(ModelMap map) {
        //this method should retrieve the data for all users
        List<User> userList = users.getUsers();
        map.addAttribute("userList", userList);
        return new ModelAndView("allusers", map);
    }

}
