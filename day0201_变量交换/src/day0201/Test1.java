package day0201;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������a");
		//�Ȼ�������ֵ
		//�ٴ��뵽����a
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("��������b");
		int b  = sc.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
