package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.User;

import java.util.List;

public interface UserRepository {

    Long addUser(User user);

    User getUserByName(String userName);

    void setUsers(List<User> usersList);

    List<User> getUsers();

    Long updateUser(User user);

    Long deleteUser(User user);

}
