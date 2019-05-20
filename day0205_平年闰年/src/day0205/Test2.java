package day0205;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("输入年份");
		int year =	new Scanner(System.in).nextInt();
		String a = "平年";
		if(year%4 == 0){
			if(year%100 != 0){
				a = "润年";
			}
		}
		if(year%400 == 0){
			a = "润年";
		}
		System.out.println(year+"年是"+a);
	}

}
