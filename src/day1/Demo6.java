package day1;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		/**
		 * 网咖收银系统：
		 * 上网单价
		 * 上网时长
		 * 缴纳金额
		 * 
		 * 当用户消费超过100元时，打八折
		 * 当用户给的钱够时计算总价和找零
		 * 当用户的钱不够时提示余额不足
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("上网单价为");
		int price = sc.nextInt();
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("上网时长为");
		double time = sc.nextDouble();
		
		Scanner sc2 =new Scanner(System.in);
		System.out.println("缴纳金额");
		double money = sc.nextDouble();
		
		double totalPrice = price*time;
		
		
		if(totalPrice>=100) {
			totalPrice=totalPrice*0.8;
		}
		if(money>=totalPrice) {
			System.out.println("总共消费"+totalPrice+"找零"+(money-totalPrice));
			
		}else {
//			System.out.println("余额不足");
		}
		
		
		
		
		
			}
		}
		
		
		

