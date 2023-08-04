package IoC;

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

	private Book book;
	private Management management;

	public Library() {
	}

	public Library(Book book, Management management) {
		this.book = book;
		this.management = management;
	}

	@Override
	public String toString() {
		return "LIBRARY!";
	}

}
