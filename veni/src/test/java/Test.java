import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.UserService;

/**
 * @author: Veni
 * @date: 2022/07/03 七月 星期日 7:50
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.test();

		System.out.println(userService);
	}
}
