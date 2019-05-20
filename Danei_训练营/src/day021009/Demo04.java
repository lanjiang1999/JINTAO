
package day021009;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		//分支结构
//		int a = 5;
//		
//		if(a%2==0){
//			System.out.println("偶数");
//		}else{
//			System.out.println("奇数");
//		}
		/**
		 * 铁路行李托运规定:
		 * 行李不超过50公斤的，托运费按照每公斤0.15元
		 * 计费，超过50公斤的超出部分每公斤加收0.10元。
		 * 
		 * 获取用户输入的行李重量,编写程序完成自动计费.
		 */
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输入行李重量:");
		int weight = sc.nextInt();//行李重量
		double price ;
		if(weight<=50){
			price = weight * 0.15;
		}else{
			price = (50*0.15)+(weight-50)*0.25;
		}
		System.out.println("总价钱为:"+price);
		
		
		
		
		
		
	}
}

