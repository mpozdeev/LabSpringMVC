package maksim.epam.mvcproject.config;

import maksim.epam.mvcproject.enums.UserRole;
import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RepositoryConfig {

    @Bean
    public UserRepositoryListImpl userDao() {
        UserRepositoryListImpl fakeUserRepositoryMapImpl = new UserRepositoryListImpl();
        List<User> fakeUsers = new ArrayList<>();
        fakeUsers.add(new User(1L, "Alex", "+7111", "passAl", UserRole.USER));
        fakeUsers.add(new User(2L, "Clark", "+7222", "passCl", UserRole.USER));
        fakeUsers.add(new User(3L, "Nix", "+7333", "passNi", UserRole.ADMIN));
        fakeUsers.add(new User(4L, "Nolan", "+7444", "passNo", UserRole.USER));
        fakeUsers.add(new User(5L, "Charley", "+7555", "passCh", UserRole.USER));
        fakeUserRepositoryMapImpl.setUsers(fakeUsers);
        return fakeUserRepositoryMapImpl;
    }

}
