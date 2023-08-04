package IoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Veni
 * @date: 2022/08/01 八月 星期一 10:38
 * @description:
 */
@Configuration
public class Beans {
	@Bean(name = "library")
	public Library getLibrary(){
		Library library=new Library();
		library.setId(9527L);
		library.setName("WL");

		return library;
	}
}
