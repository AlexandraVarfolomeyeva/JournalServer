package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration //до спринга
@EnableWebMvc //использовать рест и контроллеры
@ComponentScan("") //где искать классы, компоненты и сервисы
public class WebConfig {
}
