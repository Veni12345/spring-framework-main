package IoC_BeanFactory;

import lombok.Data;

/**
 * @author: Veni
 * @date: 2022/07/16 七月 星期六 17:32
 * @description:
 */
@Data
public class Library {

	private Long Id;
	private String name;

	@Override
	public String toString(){
		return "LIBRARY!";
	}

}
