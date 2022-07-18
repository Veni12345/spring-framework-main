package IoC_BeanFactory;

import lombok.Data;

import java.util.Date;

/**
 * @author: Veni
 * @date: 2022/07/16 七月 星期六 17:34
 * @description:
 */
@Data
public class Book {

	private Long Id;
	private String bookName;
	private Date publishTime;
}
