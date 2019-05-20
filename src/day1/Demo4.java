package day1;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		//分支结构
		int a = 80;
		if(a%2==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
		/**
		 * 铁路行李托运规定
		 * 1.行李不超过50kg，托运费按照每公斤0.15元计费
		 * 超过50公斤的超出部分每公斤加收0.10元
		 * 
		 * 获取用户输入的行李重量，编写程序完成自动计费
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你托运行李的重量");
		double weight = sc.nextDouble();
		
		double b = 0.15*weight;
		double c = 0.15*50+0.25*(weight-50);
		if(weight<=50){
			System.out.println("你需要支付的费用为"+b);
		}else{
			System.out.println("你需要支付的费用为"+c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
