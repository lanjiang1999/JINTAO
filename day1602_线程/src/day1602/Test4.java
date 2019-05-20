package day1602;

import java.util.Arrays;

public class Test4 {
	static char[] a = {
			'-','-','-','-','-'
	};

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				char c = '*';
				while(true) {
					synchronized (a) {
						for (int i = 0; i < a.length; i++) {
							a[i] = c;
						}
					}
					c = (c=='*'?'-':'*');
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				while(true) {
					synchronized (a) {
						System.out.println(
								Arrays.toString(a));
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}








