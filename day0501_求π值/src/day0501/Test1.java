package day0501;

import java.util.Scanner;

public class Test1 {
	//��/4 = 1/1+1/3-1/5+1/7....
	public static void main(String[] args) {
		System.out.println("����������");
		int n = new Scanner(System.in).nextInt();
		
		double pi = f(n);
		System.out.println(pi);
	}

	private static double f(int n) {
		//�ۼӱ���sum
		double sum = 0;
		for(int  a = 1,b = 1,i = 1;i <= n;a*=-1,b+=2,i++){
			sum += a/(double)b;
		}
		return sum*4;
	}
}
