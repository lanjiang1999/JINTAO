package day0203;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入降落时间(秒)");
		double t = sc.nextDouble();
		
		double a = 0.5*9.8*t*t;
		System.out.println(t+"秒降落了"+a+"米");
		
	}

}
