package day0303;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����������׳�");
		int n = new Scanner(System.in).nextInt();
		//��n��ֵ�����ݵ�f()���������Ľ׳�
		f(n);
	}
	
	static void f(int n){
		/**
		 * r = 5
		 * i
		 * 4,r = r*i
		 * 3,r = r*i
		 * 2,r = r*i
		 * 1,r = r*i
		 */
		long r = n;
		for (int i = n-1;i >= 1 ; i--) {
			r = r*i;
		}
		System.out.println(r);
	}
}
