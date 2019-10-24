package ming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("ming.service")
@ImportResource(value = "classpath:spring.xml")
public class AppConfig {

}
