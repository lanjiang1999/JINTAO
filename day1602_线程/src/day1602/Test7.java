package day1602;

public class Test7 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		
		p.start();
		c.start();
		
		while(true) {
			synchronized (stack) {
				stack.notifyAll();
			}
		}
	}
}




