package ming.test;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class TestImportBeanDefinitionResistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AbstractBeanDefinition beanDefinition =
				BeanDefinitionBuilder.rootBeanDefinition(TestDao1.class).addConstructorArgValue("testDao1")
						.getBeanDefinition();
		registry.registerBeanDefinition("testDao1",beanDefinition);
	}
}
