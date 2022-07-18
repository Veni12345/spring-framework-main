package IoC_BeanFactory;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author: Veni
 * @date: 2022/07/17 七月 星期日 8:27
 * @description:
 */
public class BeanDefinitionReaderDemo {
	BeanDefinitionRegistry registry=new DefaultListableBeanFactory();

	//properties文件
	BeanDefinitionReader properties=new PropertiesBeanDefinitionReader(registry);
	//xml文件
	BeanDefinitionReader xml=new XmlBeanDefinitionReader(registry);

}
