package ming.test;


import ming.AppConfig;
import ming.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = (TestService) context.getBean("testService");
		System.out.println(testService);
	}
}





