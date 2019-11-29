//package maksim.epam.mvcproject.repo;
//
//import maksim.epam.mvcproject.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class UserRepositoryMapImpl implements UserRepository {
//
//    protected long sequence = 0;
//
//    @Autowired
//    private Map<Long, User> usersMap;
//
//    public UserRepositoryMapImpl() {
//    }
//
//    private Long incSequence(){
//        return ++sequence;
//    }
//
//    @Override
//    public Long addUser(User user) {
//        Long id = incSequence();
//        user.setId(id);
//        usersMap.put(id, user);
//        return id;
//    }
//
//    @Override
//    public User getUserByName(String userName) {
//        User user;
//        for (Map.Entry<Long, User> item: usersMap.entrySet()){
//            user = item.getValue();
//            if(user.getUserName().equals(userName)){
//                return user;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void setUsers(List<User> usersList) {
//        this.usersMap = usersMap;
//    }
//
//    @Override
//    public List<User> getUsers() {
//        return new ArrayList<>(usersMap.values());
//    }
//
//    @Override
//    public Long updateUser(User user) {
//        System.err.println("updateUser - не реализована");
//        return -1L;
//    }
//
//    @Override
//    public Long deleteUser(User user) {
//        System.err.println("deleteUser - не реализована");
//        return -1L;
//    }
//
//}
