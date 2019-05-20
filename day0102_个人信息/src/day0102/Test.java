package day0102;

import java.util.Scanner;

public class Test {
	public static void main (String [] args){
		
		System.out.println("输入姓名:");
		String name =new Scanner(System.in).nextLine();
		
		System.out.println("输入性别:");
		String gender =new Scanner(System.in).nextLine();

		System.out.println("输入年龄:");
		int age =new Scanner(System.in).nextInt();

		System.out.println("你的个人信息为： ");
		System.out.println("姓名:"+name);
		System.out.println("性别："+gender);
		System.out.println("年龄:"+age);
		
		
		
	}

}
