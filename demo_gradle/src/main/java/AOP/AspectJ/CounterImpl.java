package AOP.AspectJ;

/**
 * @author: Veni
 * @date: 2022/07/24 七月 星期日 11:10
 * @description:
 */
public class CounterImpl implements ICounter {
	private int counter;

	@Override
	public void resetCount() {
		counter=0;
	}

	@Override
	public int getCounter() {
		counter++;
		return counter;
	}
}
