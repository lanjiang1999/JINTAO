package day1602;

public class Consumer extends Thread {
	private Stack stack;
	Object obj = new Object();
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (stack) {
				while(stack.isEmpty()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				char c = stack.pop();
				System.out.println("µ¯³ö --> "+ c ); 
				stack.notifyAll();
			}
		}
	}
	
}
