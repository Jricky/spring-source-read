package ming.test;


import ming.AppConfig;
import ming.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestDao1 testDao1 = context.getBean(TestDao1.class);
		System.out.println(testDao1);

	}
}
