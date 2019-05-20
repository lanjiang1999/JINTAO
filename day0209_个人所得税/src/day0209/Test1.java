package day0209;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("工资");
		double s = new Scanner(System.in).nextDouble();
		//把工资s的值，传递到f（）方法进行计算
		f(s);
	}
	
	static void f(double salary){
		//如果salary没有到起征点，不交税
		if(salary <= 3500){
			System.out.println("不需要交税");
			//返回到上面位置继续
			return;
		}
		//salary减去3500
		salary -= 3500;
		//定义税率和速算扣除数变量
		double r = 0;
		int k = 0;
		if(salary <= 1500){
			r = 0.03;
			k = 0;
		}else if(salary <= 4500){
			r = 0.1;
			k = 105;
		}else if(salary <= 9000){
			r = 0.2;
			k = 555;
		}else if(salary <= 35000){
			r = 0.25;
			k = 1005;
		}else if(salary <= 55000){
			r = 0.3;
			k = 2755;
		}else if(salary <= 80000 ){
			r = 0.35;
			k = 5505;
		}else{
			r = 0.45;
			k = 13505;
		}
		
		double tax = salary*r-k;
		System.out.println("个人所得税："+tax);
		
		
	}

}
