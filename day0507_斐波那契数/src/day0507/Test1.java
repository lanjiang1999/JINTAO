package day0507;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//1 1 2 3 5 8 13 21 ....
		System.out.println("输入整数");
		int n = new Scanner(System.in).nextInt();
		long r = g(n);
		System.out.println(r);
	}

	private static long g(int n) {
		long a = 1;
		long b = 1;
		//从第三个求到第n个
		for(int i = 3; i <= n;i++){
			b = a + b;
			a = b -a;
			
		}
		return b;
	}

	private static long f(int n) {
		if(n == 1 || n == 2){
			return 1;
			
		}
		return f(n-1)+f(n-2);
	}

}
