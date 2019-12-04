package maksim.epam.mvcproject.initializer;

import maksim.epam.mvcproject.config.RootConfig;
import maksim.epam.mvcproject.config.WebConfig;
import maksim.epam.mvcproject.config.WebSecurityConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{
//                RootConfig.class
        return new Class[0];
//        return new Class[] {WebSecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{
//                WebConfig.class
        return new Class<?>[0];
    }

    @Override
    protected String[] getServletMappings() {
//        return new String[]{"/"};
        return new String[0];
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(RootConfig.class, WebConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        FilterRegistration.Dynamic filterRegistration = servletContext
                .addFilter("characterEncodingFilter", characterEncodingFilter);
        filterRegistration.addMappingForUrlPatterns(null, false, "/*");
    }

}
