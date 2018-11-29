package ming.test;


import ming.AppConfig;

import ming.dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserMapper mapper = context.getBean(UserMapper.class);
		System.out.println(mapper.query());
	}
}
