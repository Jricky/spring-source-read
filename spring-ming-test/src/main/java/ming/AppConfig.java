package ming;

import ming.test.TestImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("ming.dao")
@Import(TestImportSelector.class)
public class AppConfig {
}
