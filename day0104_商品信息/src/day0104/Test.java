package day0104;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		System.out.println("��������Ʒ��");
//		String goodsNames = new Scanner(System.in).nextLine();
//		
//		System.out.println("�۸�");
//		double price = new Scanner(System.in).nextDouble();
//
//		System.out.println("����");
//		int a = new Scanner(System.in).nextInt();
//		
//		double totalPrice = price*a;
//		
//		System.out.println("��ȷ�����������Ϣ");
//		System.out.println("��Ʒ����"+goodsNames);
//		System.out.println("�۸�"+price);
//		System.out.println("������"+a);
//		
//		System.out.println("����Ҫ֧����"+(totalPrice));
	
//		for(int i = 1;i <=9;i++){
//			for(int j = 1;j <= i;j++){
//				System.out.print(" "+j+"*"+i+"="+i*j);
//			}
//			System.out.println();
//		}
		
		/**
		 * 			*						4*1
		 * 		   * *						3*2
		 *        * * *						2*3
		 *       * * * *					1*4
		 *      * * * * *					0*5
		 */
		
//		for(int a = 1;a <= 5;a++){
//			for(int b = 1;b <= 5-a;b++){
//				System.out.print(" ");
//			}
//			for(int c = 1;c <= a;c ++){
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������a");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������b");
		int b = sc.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("����λ�ú� a="+a);
		System.out.println("����λ�ú� b="+b);
		
		
		System.out.println("--------------------------------");
		
		int num1 = 10;
		
		
		
		

	}

}
