package day1602;

public class Test3 {
	public static void main(String[] args) throws Exception {
		/*
		 * 1000万内有多少个质数
		 */
		System.out.println("\n\n--单线程---------");
		f1();
		
		System.out.println("\n\n--5个线程---------");
		f2();
		
	}
	
	private static void f2() throws Exception {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0, 2000000);
		T1 t2 = new T1(2000000,4000000);
		T1 t3 = new T1(4000000,6000000);
		T1 t4 = new T1(6000000,8000000);
		T1 t5 = new T1(8000000,10000000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		int n = t1.count+
				t2.count+
				t3.count+
				t4.count+
				t5.count;
		
		t = System.currentTimeMillis()-t;
		System.out.println(t);
		
		System.out.println(n);
	}

	private static void f1() throws Exception {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0, 10000000);
		t1.start();
		t1.join();//main暂停，等待t1结束
		
		t = System.currentTimeMillis()-t;
		System.out.println(t);
		
		System.out.println(t1.count);
		
	}

	static class T1 extends Thread {
		int start;
		int end;
		int count;
		public T1(int start, int end) {
			if(start<=2) {
				start = 3;
				count = 1;
			}
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			for(int i=start;i<end;i++) {
				if(isPrime(i)) {
					count++;
				}
			}
		}

		private boolean isPrime(int i) {
			double max = 1+Math.sqrt(i);
			for(int j=2;j<max;j++) {
				if(i%j == 0) return false;   
			}
			
			return true;
		}
	}
}






