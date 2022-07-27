package IoC_BeanFactory;

import org.springframework.beans.factory.config.*;

/**
 * @author: Veni
 * @date: 2022/07/18 七月 星期一 9:45
 * @description: BeanFactoryPostProcessor容器扩展机制
 * 前置处理器
 */
public class BeanFactoryPostProcessorDemo {

	public static void main(String[] args) {
		/** 存放类似系统管理相关的信息，避免与系统业务相关的配置的混杂
		 * 如数据库连接、邮件服务器地址 **/
		//文件配置 EL表达式
		BeanFactoryPostProcessor beanFactoryPostProcessor1=new PropertyPlaceholderConfigurer();
		//文件配置覆盖
		BeanFactoryPostProcessor beanFactoryPostProcessor2=new PropertyOverrideConfigurer();
		//转换
		BeanFactoryPostProcessor beanFactoryPostProcessor3=new CustomEditorConfigurer();

		//自定义BeanFactoryPostProcessor

	}
}
