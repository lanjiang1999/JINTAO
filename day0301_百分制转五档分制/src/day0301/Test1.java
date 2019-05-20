package day0301;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("输入百分制分数");
		int s = new Scanner(System.in).nextInt();
		/**
		 * 调用f()方法，把s的值传递到f()方法进行运算
		 */
		f(s);
		
		
	}
	static void f(int a){
		if (a< 0 || a>100) {
			System.out.println("分数输入错误");
			return;//返回到调用位置继续执行
		}
		char r = 0;
		switch (a/10) {
		case 10:
		case 9:	
			r = 'A';
			break;
		case 8:
		case 7:	
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:		
		case 4:
		case 3:	
		case 2:
			r = 'D';
			break;
		case 1:	
		case 0:
			r = 'E';
			break;
	
		}
		System.out.println(r);
		
	}

}
