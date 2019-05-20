package day021009;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 条件运算:
		 * 结构如下:
		 * boolean表达式?表达式1:表达式2;
		 * 1.首先判断boolean表达式
		 * 2.成立则执行表达式1
		 * 3.不成立则执行表达式2
		 */
		int a = 30;
		int b = a>10?1:2;
		System.out.println(b);
		
		int age = 10;
		String r = age>=18?"成年了":"未成年";
		System.out.println(r);
		
		int c = -3;
		String c1 = c>0?"正数":(c==0?"0":"负数");
		System.out.println(c1);
		
		/**
		 * 闰年判断程序:
		 * 用户输入一个年份，程序判断该年份是否为闰年
		 * 
		 * 1.能被4整除不能被100整除
		 * 2.能被400整除
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入一个年份:");
//		int year = sc.nextInt();
//		boolean n =(year%4==0&&year%100!=0)||
//										(year%400==0);
//		String s = n?"是闰年":"不是闰年";
//		System.out.println(s);
		/**
		 * 网咖收银系统:
		 * 上网单价 
		 * 上网时长 
		 * 缴纳金额 
		 * 
		 * 总价和找零 
		 */
		System.out.println("上网单价:");
		double price = sc.nextDouble();
		System.out.println("上网时长:");
		double hour = sc.nextDouble();
		System.out.println("缴纳金额:");
		double money = sc.nextDouble();
		
		double totalPrice = price * hour;//总消费
		double change = money-totalPrice;//找零
		
		System.out.println("总消费为:"+totalPrice);
		System.out.println("找零为:"+change);
		
		
		
	}
}





