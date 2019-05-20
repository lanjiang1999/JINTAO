package day0201;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数a");
		//先获得输入的值
		//再存入到变量a
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("输入整数b");
		int b  = sc.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
