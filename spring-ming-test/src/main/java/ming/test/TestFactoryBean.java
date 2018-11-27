package ming.test;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class TestFactoryBean  implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), TestDao1.class.getInterfaces(),
				(proxy, method, args) -> {

					return null;
				});
		return o;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
