package day31010;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		//����λ�ý���
		
	/*	//��һ��
		int a = 4;
		int b = 6;
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		//�ڶ���
		int x = 4;
		int y = 6;
		x = x*y;// + ͬ��
		y = x/y;
		x = x/y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		*/
		
		
		/**
		 *�����û�����������������Զ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();
		System.out.println("d="+d+" e="+e+" f="+f);
		
		int g;
		if(d>e){
			g = d;
			d = e;
			f = g;
		}
		if(d>f){
			g = d;
			d = f;
			f = g;
		}
		if(e>f){
			g = e;
			e = f;
			f = g;
		}
		System.out.println("d="+d+" e="+e+" f="+f);
	}

}
