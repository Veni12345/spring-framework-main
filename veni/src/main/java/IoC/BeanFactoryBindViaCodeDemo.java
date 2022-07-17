package IoC;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.*;

/**
 * @author: Veni
 * @date: 2022/07/16 七月 星期六 17:22
 * @description: 通过直接编码的方式实现Bean的注册与依赖绑定
 */
public class BeanFactoryBindViaCodeDemo {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
		BeanFactory container = bindViaCode(beanRegistry);
		Library library = (Library) container.getBean("library");
		System.out.println(library);
	}

	public static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {
		/** BeanDefinition
		 * 保存对象的所有必要信息，包括对象的class类型、是否是抽象类、构造方法参数以及其他属性
		 * 主要实现类：RootBeanDefinition、ChildBeanDefinition
		 * **/
		AbstractBeanDefinition library = new RootBeanDefinition(Library.class);
		AbstractBeanDefinition management = new RootBeanDefinition(Management.class);
		AbstractBeanDefinition book = new RootBeanDefinition(Book.class);
//		AbstractBeanDefinition book=new ChildBeanDefinition(Book.class);

		//将bean定义注册到容器中
		registry.registerBeanDefinition("library", library);
		registry.registerBeanDefinition("management", management);
		registry.registerBeanDefinition("book", book);

		/** 指定依赖关系 **/
		//1.通过构造方法注入方式
//		ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
//		argumentValues.addIndexedArgumentValue(0, management);
//		argumentValues.addIndexedArgumentValue(1, book);
//		library.setConstructorArgumentValues(argumentValues);

		//2.通过setter方法注入方式
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("management", management));
		propertyValues.addPropertyValue(new PropertyValue("book", book));
		library.setPropertyValues(propertyValues);

		//绑定完成
		return (BeanFactory) registry;
	}
}
