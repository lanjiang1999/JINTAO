package day0104;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		System.out.println("请输入商品名");
//		String goodsNames = new Scanner(System.in).nextLine();
//		
//		System.out.println("价格");
//		double price = new Scanner(System.in).nextDouble();
//
//		System.out.println("数量");
//		int a = new Scanner(System.in).nextInt();
//		
//		double totalPrice = price*a;
//		
//		System.out.println("请确认你输入的信息");
//		System.out.println("商品名："+goodsNames);
//		System.out.println("价格："+price);
//		System.out.println("数量："+a);
//		
//		System.out.println("你需要支付："+(totalPrice));
	
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
		
		System.out.println("请输入第一个整数a");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个整数b");
		int b = sc.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("交换位置后 a="+a);
		System.out.println("交换位置后 b="+b);
		
		
		System.out.println("--------------------------------");
		
		int num1 = 10;
		
		
		
		

	}

}
