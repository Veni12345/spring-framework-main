package AOP;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJMethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * @author: Veni
 * @date: 2022/07/22 七月 星期五 10:34
 * @description:
 */
public class AOPDemo {
	public static void main(String[] args) {
		//AOP框架中的顶层抽象。代表的Joinpoint的表达式，根据pointcut的表达式可知道往系统哪些地方织入逻辑切面。
		Pointcut pointcut = new NameMatchMethodPointcut();

		MethodBeforeAdvice methodBeforeAdvice = (MethodBeforeAdvice) new DefaultPointcutAdvisor();
		//Advice：代表将会织入到Joinpoint的逻辑（Aspect之于OOP中的Class，Advice之于AOP中的Method）
		Advice advice = new MethodBeforeAdviceInterceptor(methodBeforeAdvice);

		//Aspect：Pointcut和Advice装箱
		//DefaultPointcutAdvisor：最通用的PointcutAdvisor实现，
		// 除了不能为其指定的Introduction类型的advisor之外，剩下的任何类型的Pointcut、Advice都可以借此实现。
		Advisor advisor=new DefaultPointcutAdvisor();


		AspectMethodTest target=new AspectMethodTest();
		//织入方式
		ProxyFactory proxyFactory=new ProxyFactory();
		proxyFactory.setTarget(target.method1()); 		//1.设置目标
		proxyFactory.addAdvisor(advisor);  				//2.添加advisor(Aspect)


		Object proxy = proxyFactory.getProxy();

	}
}
