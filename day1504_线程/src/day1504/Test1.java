package day1504;

public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		//�����߳�
		//�߳��������Զ�ִ��run()����
		t1.start();
		t2.start();
		
		//����������󣬻��Զ�����һ��main�߳�
		//ִ��main()�����еĴ���
		System.out.println("main");
	}
	
	
	
	
	
	
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//��ȡ�߳���
			String n = getName();
			//��ӡ1��1000
			for(int i=1;i<=1000;i++) {
				System.out.println(n+" - "+i);   
			}
		}
	}
	
}






