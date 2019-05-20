package day021009;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 网咖收银系统: 上网单价 上网时长 缴纳金额
		 * 
		 * 当用户消费超过100元时，打八折 当用户给的钱够时计算总价和找零 当用户给的钱不够时提示金额不足
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("上网单价:");
		double price = sc.nextDouble();
		System.out.println("上网时长:");
		double hour = sc.nextDouble();
		System.out.println("缴纳金额");
		double money = sc.nextDouble();
		double totalPrice = price * hour;// 总消费
		if (totalPrice >= 100) {// 打折
			totalPrice = totalPrice * 0.8;
		}
		if (money >= totalPrice) {
			double change = money - totalPrice;// 找零
			System.out.println("总消费为:" + totalPrice);
			System.out.println("找零为:" + change);
		} else {
			System.out.println("金额不足");
		}

	}
}
