package day1301;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("��������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a,b);
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("���ܳ�0");
			e.printStackTrace();	//��������Ա�鿴������ʾ
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
