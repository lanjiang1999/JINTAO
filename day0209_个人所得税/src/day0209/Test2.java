package day0209;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入工资");
		int s = sc.nextInt();
		f(s);
		
	}
	static void f(int salary){
		if(salary <= 3500){
			System.out.println("不需要交税");
		}
		salary = salary -3500;	//超过3500部分的需要纳税
		double a;				//税率
		int b;					//速算扣除数
		if(salary <= 1500){
			a = 0.03;
			b = 0;
		}else if(salary <= 4500){
			a = 0.1;
			b = 105;
		}else if(salary <= 9000){
			a = 0.2;
			b = 555;
		}else if(salary <= 35000){
			a = 0.25;
			b = 1005;
		}else if(salary <= 55000){
			a = 0.3;
			b = 2755;
		}else if(salary <= 80000){
			a = 0.35;
			b = 5505;
		}else{
			a = 0.45;
			b = 13505;
		}
		double tax = salary*a-b;
		System.out.println("需要纳税："+tax);
	}

}
