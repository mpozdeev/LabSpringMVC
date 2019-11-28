package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private List<User> userList;
//    getUserById/Phone(int id/ string phone)    deleteUser(...)    UpdateUser(...)

    public UserDao() {
    }

    public void addUser(User user){
        userList.add(user);
    }

    public User getUserByName(String userName){
        for (User user: userList){
            if(user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
