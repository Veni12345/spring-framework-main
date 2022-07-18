package IoC_BeanFactory;


import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author: Veni
 * @date: 2022/07/18 七月 星期一 13:31
 * @description:
 */
public class BeanFactoryDemo {
	public static void main(String[] args) {
		AbstractBeanFactory beanFactory=new DefaultListableBeanFactory();

		BeanPostProcessor beanPostProcessor=new AutowiredAnnotationBeanPostProcessor();

	}
}
