package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.User;

import java.util.List;

public class UserRepositoryListImpl implements UserRepository {

    private long sequence = 0;

    private List<User> usersList;

    public UserRepositoryListImpl() {
    }

    private Long incSequence() {
        return ++sequence;
    }

    @Override
    public Long addUser(User user) {
        Long id = incSequence();
        user.setId(id);
        usersList.add(user);
        return id;
    }

    @Override
    public User getUserByName(String userName) {
        for (User user : usersList) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void setUsers(List<User> usersList) {
        this.usersList = usersList;
        sequence = usersList.size();
    }

    @Override
    public List<User> getUsers() {
        return usersList;
    }

    @Override
    public Long updateUser(User user) {
        System.err.println("updateUser - не реализована");
        return -1L;
    }

    @Override
    public Long deleteUser(User deletedUser) {
        Long index = -1L;
        for (User user : usersList) {
            if (user.equals(deletedUser)) {
                index = user.getId();
                usersList.remove(deletedUser);
            }
        }
        return index;
    }

    public boolean isNameExists(String name){
        for (User user: usersList){
            if (user.getUserName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
