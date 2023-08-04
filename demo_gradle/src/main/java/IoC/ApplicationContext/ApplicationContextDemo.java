package IoC.ApplicationContext;


import IoC.Beans;
import IoC.Library;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author: Veni
 * @date: 2022/07/18 七月 星期一 16:10
 * @description:
 */
public class ApplicationContextDemo {
	public static void main(String[] args) {
//		ApplicationContext applicationContext1=new XmlWebApplicationContext();
//		ApplicationContext applicationContext2=new FileSystemXmlApplicationContext();

		//1. 通过XML文件 装载Bean配置
		ClassPathXmlApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("lib.xml");

		Library library = (Library) applicationContext3.getBean("library");
		System.out.println(library);

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lib.xml");
//		try {
//			Library library1 = (Library) applicationContext.getBean("library");
//		} catch (BeansException e) {
//
//		}

		//2. 通过一个带@Configuration的POJO装载Bean配置
//		ApplicationContext applicationContext4 = new AnnotationConfigApplicationContext(Beans.class);
//		Library library = applicationContext4.getBean("library", Library.class);
//		System.out.println(library.toString());

		BeanPostProcessor commonAnnotationBeanPostProcessor = new CommonAnnotationBeanPostProcessor();


	}
}
