package ming;

import ming.test.TestImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("ming.dao")
@Import(TestImportBeanDefinitionRegistrar.class)
public class AppConfig {
}
