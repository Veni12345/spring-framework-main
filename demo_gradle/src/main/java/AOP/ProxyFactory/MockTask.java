package AOP.ProxyFactory;

import org.gradle.api.internal.tasks.TaskExecutionContext;

/**
 * @author: Veni
 * @date: 2022/07/24 七月 星期日 11:24
 * @description:
 */
public class MockTask implements ITask{
	@Override
	public void execute(TaskExecutionContext ctx) {
		System.out.println("task executed!");
	}
}
