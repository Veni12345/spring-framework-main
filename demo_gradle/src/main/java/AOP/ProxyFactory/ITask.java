package AOP.ProxyFactory;

import org.gradle.api.internal.tasks.TaskExecutionContext;

/**
 * @author: Veni
 * @date: 2022/07/24 七月 星期日 11:22
 * @description:
 */
public interface ITask {
	void execute(TaskExecutionContext ctx);
}
