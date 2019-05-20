package day0207;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入整数a：");
		int a = sc.nextInt();
		
		System.out.println("输入整数b：");
		int b = sc.nextInt();
		
		System.out.println("输入整数c：");
		int c = sc.nextInt();
		
	/*	int max = a>b?a:b;			//获取a，b中的最大值存到
		max = max>c?max:c;			//重新获取max与c的最大值存到max
		System.out.println("最大值是"+max);*/
		
		int max = a>b?(a>c?a:c):(b>c?b:c);		//嵌套
		System.out.println("最大值为"+max);
	}

}
