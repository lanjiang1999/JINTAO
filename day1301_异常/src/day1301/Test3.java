package day1301;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("输入两个浮点数");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a,b);
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("不能除0");
			e.printStackTrace();	//供开发人员查看错误提示
		}
		
		
		
	}

	private static double divide(double a, double b) {
		if(b == 0) {
			ArithmeticException e =
					new ArithmeticException("/ by zero");
			throw e;
		}
		return a/b;
	}

}
