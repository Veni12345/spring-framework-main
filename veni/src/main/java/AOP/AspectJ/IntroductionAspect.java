package AOP.AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author: Veni
 * @date: 2022/07/24 七月 星期日 11:05
 * @description:
 * Introduction的实现是通过将需要添加的新的行为逻辑，以新的接口定义添加到目标对象上
 */
@Aspect
public class IntroductionAspect {
	@DeclareParents(
			value = "AOP.ProxyFactory.ITask",      //目标对象（可指定路径下的多个）
			defaultImpl = CounterImpl.class  //接口实现类
	)
	public ICounter counter;   //将为目标对象新增加的对象类型
}
