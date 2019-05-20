package day0203;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入降落时间(秒)");
		double t = sc.nextDouble();
		//double a = 0.5*9.8*t*t;
		
		BigDecimal bd1 = BigDecimal.valueOf(4.9);
		BigDecimal bd2 = BigDecimal.valueOf(t);
		
		double d = 
				bd1.multiply(bd2.pow(2))
				.setScale(3,BigDecimal.ROUND_HALF_UP)
				.doubleValue();
		System.out.println(t+"秒降落了"+d+"米");
		
	}

}
