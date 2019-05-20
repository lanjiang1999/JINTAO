package day1;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		/**
		 * 关系运算符：
		 * （>）（>=）（<）（<=）
		 * (==)(!=)等于，不等于
		 */
		int max = 10;
		int num = 9;
		boolean a1 = max>=10;
		boolean a2 = max%2==1;
		boolean a3 = num/max!=0;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		/**
		 * 逻辑运算符：
		 * 逻辑运算符建立在关系运算基础之上，当多个条件
		 * 需要兼顾考虑可以使用，逻辑运算符包括
		 * 与(&&)或(||)非(！)
		 * 
		 */
		int score = 80;
		boolean b1 = score>10 && score<100;
		System.out.println("b1="+b1);
		
		boolean f = false;
		int n = 200;
		boolean m = f||(n>10&&n<=200);
		System.out.println("m="+m);
		
		int s = 4;
		boolean u = s<10;
		System.out.println(!u);
		 
		//逻辑短路：&& || 当第一个表达式就能决定最终结果时，后面不会执行
		// &,| 前后都会执行
		int  i = 100,j = 200;
		boolean c1 = (i>j)&&(++i>100);
		System.out.println(c1);
		System.out.println(i);
		boolean c2 = (j>0)||(++j>200);
		System.out.println(c2);
		System.out.println(j);
		
		/*
		 * 练习：
		 * 根据用户输入的年龄判断该年龄
		 * 是否在18到30之间
		 * 是则输出true 不是则输出false
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age =sc.nextInt() ;//获取数值
		boolean d = age>=18&&age<=30;
		System.out.println(d);
		 
		/**
		 * 
		 * 条件运算
		 * 结构如下
		boolean表达式？表达式1:表达式2;
		1.首先判断boolean表达式
		2.成立则执行表达式1
		3.不成立则执行表达式2
		 */
		int a = 30;
		int b = a>10?1:2;
//		System.out.println(b);
		
		int age1 = 10;
		String r = age1>=18?"成年了":"未成年";
		System.out.println(r);
		int c = 3;
		String c4 = c>0?"正数":(c==0?"0":"负数");
		System.out.println(c4);
		
		/**
		 * 闰年判断程序
		 * 用户输入一个年份，程序判断该年份是否为闰年
		 * 
		 * 1.能被4整除且不能被100整除
		 * 			或
		 * 2.能被400整除
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = sc .nextInt();
		boolean n1 = (year%4==0&&year%100!=0)||(year%400==0);
		
		String n2 = n1?"闰年":"不是闰年";
		System.out.println(n2);
		
		
		/**
		 * 网咖收银系统
		 * 上网单价
		 * 上网时长
		 * 缴纳金额
		 * 
		 * 总价和找零
		 */
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入所在区域单价:");
		double price =sc. nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("请输入上网时长:");
		double times =sc. nextDouble();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("请输入缴纳金额:");
		double money =sc. nextInt();
		
		 double total = price*times;
		 
		 
		
	}

}
