package day1602;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		T1 t1 = new T1();
		System.out.println(
				"10秒挑战，准备好，按回车开始");
		new Scanner(System.in).nextLine();
		t1.start();
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("数10秒按回车");
				new Scanner(System.in).nextLine();  
				t1.interrupt();
			}
		}; 		
		
		t2.setDaemon(true);
		t2.start();
		
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
				//String s = sdf.format(d);
				//System.out.println(s);
				if(d.getTime() - t > 15000) {
					System.out.println(
					 "已经超过15秒，挑战失败");
					return;
				}
				
				
				long y = (d.getTime() - t) % 1000;
				try {
					Thread.sleep(1000-y);
				} catch (InterruptedException e) { 
					d = new Date();
					t = d.getTime()-t;
					// 10000, 10012, 9982
					y = (t%1000) / 10;
					t = t/1000;
					String s = y<10 ? "0"+y : ""+y;
					System.out.println(t+"."+s+" 秒"); 
					break;
				}
			}
			
			
		}
	}
}



