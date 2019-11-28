package maksim.epam.mvcproject.config;

import maksim.epam.mvcproject.enums.UserRole;
import maksim.epam.mvcproject.model.User;
//import maksim.epam.mvcproject.repo.UserDao;
import maksim.epam.mvcproject.repo.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.ArrayList;
import java.util.List;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"maksim.epam.mvcproject"})
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Bean
    public UserDao userDao(){
        UserDao fakeUserDao = new UserDao();
        List<User> fakeUsers = new ArrayList<>();
        fakeUsers.add(new User(1, "Alex", "+7111", "passAl", UserRole.USER));
        fakeUsers.add(new User(2, "Clark", "+7222", "passCl", UserRole.USER));
        fakeUsers.add(new User(3, "Nix", "+7333", "passNi", UserRole.ADMIN));
        fakeUsers.add(new User(4, "Nolan", "+7444", "passNo", UserRole.USER));
        fakeUsers.add(new User(5, "Charley", "+7555", "passCh", UserRole.USER));
        fakeUserDao.setUserList(fakeUsers);
        return fakeUserDao;
    }

}
