package AOP;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;

/**
 * @author: Veni
 * @date: 2022/07/24 七月 星期日 9:05
 * @description:
 */
public class AspcetJDemo {
	public static void main(String[] args) {
		AspectJExpressionPointcut aspectJExpressionPointcut=new AspectJExpressionPointcut();
		aspectJExpressionPointcut.setExpression("execution(* *(*))");
	}
}
