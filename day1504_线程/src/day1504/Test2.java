package day1504;

public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}
	
	static class R1 implements Runnable {
		@Override
		public void run() {
			//�������ִ�е��̶߳���
			Thread t = Thread.currentThread();
			//����߳���
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+" - "+i);   
			}
		}
	}
}




