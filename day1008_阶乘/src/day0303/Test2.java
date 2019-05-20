package day0303;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/**
		 * 阶乘
		 *  输入5
		 *  5
		 *  5*4
		 *  5*4*3
		 *  5*4*3*2
		 *  5*4*3*2*1
		 */
		
		System.out.println("输入整数进行阶乘");					
		int a = new Scanner(System.in).nextInt();			
		f(a);											   
	}													   
	static void f(int b){
		long r = b;
		for(int i = b-1;i >= 1;i-- ){				//r 5  20 60  120
			r *= i;								//i 4  3  2   1
		}										//r=r*i 20 60 120 120
		System.out.println(r);
	}
}
