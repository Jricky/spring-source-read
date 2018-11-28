package ming.test;


import ming.AppConfig;
import ming.dao.UserDao;
import net.sf.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Enhancer enhancer = new Enhancer();
		//增强父类
		enhancer.setSuperclass(UserDao.class);
		enhancer.setCallback(new MyMethodCallBack());
		UserDao dao = (UserDao) enhancer.create();
		dao.query();
	}
}
