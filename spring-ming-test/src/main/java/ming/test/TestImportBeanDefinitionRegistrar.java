package ming.test;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class TestImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AbstractBeanDefinition beanDefinition =
				BeanDefinitionBuilder.rootBeanDefinition(TestFactoryBean.class).addConstructorArgValue("testDao1")
						.getBeanDefinition();
		registry.registerBeanDefinition("testDao1", beanDefinition);
	}
}
