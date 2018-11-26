package ming;

import ming.test.TestImportBeanDefinitionResistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("ming.dao")
@Import(TestImportBeanDefinitionResistrar.class)
public class AppConfig {
}
