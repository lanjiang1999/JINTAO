package day1;

import java.util.Scanner;

public class Demo5 {

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
		
		double total = price*time;
		double total1 = total*0.8;
		if(total>=100){
			System.out.println("折后共消费了"+total1+"找零"+(money-total1));
			
		}else if(money>=total){
			System.out.println("共消费"+total+"找零"+(money-total));
			
		}else{
			System.out.println("余额不足");
		}
			
		
		
	}

}
