package day1602;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		//main线程，打断t1的暂停状态
		System.out.println("按回车");
		while(true) {
			new Scanner(System.in).nextLine();  
			t1.interrupt();
		}
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			SimpleDateFormat sdf =
			 new SimpleDateFormat(
			 "HH:mm:ss.SSS");
			long t = 0;//记录第一次的时间点
			
			while(true) {
				Date d = new Date();
				if(t == 0) {
					t = d.getTime();
				}
				String s = sdf.format(d);
				System.out.println(s);
				long y = (d.getTime() - t) % 1000;
				try {
					Thread.sleep(1000-y);
				} catch (InterruptedException e) {    
				}
			}
			
			
		}
	}
}



