package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Veni
 * @date: 2022/07/03 七月 星期日 9:14
 * @description:
 */
@Component
public class UserService {

	@Autowired
	private OrderService orderService;

	public void test(){
		System.out.println(orderService);
	}
}
