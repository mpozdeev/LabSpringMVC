package maksim.epam.mvcproject.config;

import maksim.epam.mvcproject.enums.UserRole;
import maksim.epam.mvcproject.model.Book;
import maksim.epam.mvcproject.model.User;
import maksim.epam.mvcproject.repo.UserBooksRepositoryMapImpl;
import maksim.epam.mvcproject.repo.UserRepositoryListImpl;
import maksim.epam.mvcproject.temporary.Generator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class RepositoryConfig {

    @Bean
    public UserRepositoryListImpl userRepositoryListImpl() {
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

    @Bean
    public UserBooksRepositoryMapImpl userBooksRepositoryMap(){
        UserBooksRepositoryMapImpl fakeUserBooksRepositoryMapImpl = new UserBooksRepositoryMapImpl();
        Map<Long, List<Book>> map = new HashMap<>();
        map.put(1L, Generator.generateBooks(8));
        map.put(2L, Generator.generateBooks(5));
        map.put(3L, Generator.generateBooks(10));
        map.put(4L, Generator.generateBooks(7));
        map.put(5L, Generator.generateBooks(15));
        fakeUserBooksRepositoryMapImpl.setArchive(map); //in: Map<Long, List<Book>>
        return fakeUserBooksRepositoryMapImpl;
    }


}
