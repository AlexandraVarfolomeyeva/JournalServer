package group.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration //до спринга
@EnableWebMvc //использовать рест и контроллеры
@ComponentScan("group") //где искать классы, компоненты и сервисы
public class WebConfig extends WebMvcConfigurerAdapter {

}
