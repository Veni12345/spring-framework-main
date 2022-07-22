package IoC_ApplicationContext;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author: Veni
 * @date: 2022/07/18 七月 星期一 16:10
 * @description:
 */
public class ApplicationContextDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext1=new XmlWebApplicationContext();
		ApplicationContext applicationContext2=new FileSystemXmlApplicationContext();
		ApplicationContext applicationContext3=new ClassPathXmlApplicationContext();

		applicationContext3.getBean("");

		BeanPostProcessor commonAnnotationBeanPostProcessor = new CommonAnnotationBeanPostProcessor();


		

	}
}
