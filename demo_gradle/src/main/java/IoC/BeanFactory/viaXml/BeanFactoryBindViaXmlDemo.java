package IoC.BeanFactory.viaXml;

import IoC.Book;
import IoC.Library;
import IoC.Management;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: Veni
 * @date: 2022/07/25 七月 星期一 13:03
 * @description:
 */
public class BeanFactoryBindViaXmlDemo {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
		BeanFactory container = bingViaXml(beanRegistry);
		Library library = (Library) container.getBean("library");
		Book book = (Book) container.getBean("book");
		Management management = (Management) container.getBean("management");
		System.out.println(library + " " + book + " " + management);
	}

	public static BeanFactory bingViaXml(BeanDefinitionRegistry registry) {
		XmlBeanDefinitionReader xml = new XmlBeanDefinitionReader(registry);
		ClassPathResource pathResource = new ClassPathResource("lib.xml");
		xml.loadBeanDefinitions(pathResource);
		return (BeanFactory) registry;
	}
}
