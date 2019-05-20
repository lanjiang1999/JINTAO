package day0210;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*  输入商品价格，求折扣价

		  满500，9折

		  满1000,85折

		  满2000,8折

		  满5000，7折*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入商品价格");
		int price = sc.nextInt();
		f(price);
	}
	
	
	static void f(int x){
		if(x < 500){
			System.out.println("不打折,按原价支付:"+x);
			return;
		}
		
		double dc = 0;			//定义折扣数
		if(x >= 5000){
			dc = 0.7;	
		}else if(x >= 2000){
			dc = 0.8;										
		}else if(x >= 1000){								
			dc = 0.85;
		}else{
			dc = 0.9;
		} 
		
		double payPrice = x*dc;
		System.out.println("折后需要支付:"+payPrice);
	}
	

}
