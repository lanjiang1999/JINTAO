package day1602;

public class Test5 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		t1.start();
		
		//main�߳�
		while(true) {
			int i = r1.get();
			if(i%2 == 1) {
				System.out.println(i);
				System.exit(0);//�˳������    
			}
		}
	}
	
	static class R1 implements Runnable {
		static int i;
		//���ᵱǰ����this������
		public synchronized void add() {
			i++;
			i++;
		}
		public synchronized int get() {
			return i;
		}
		@Override
		public void run() {
			while(true) {
				add();
			}
		}
	}
}






