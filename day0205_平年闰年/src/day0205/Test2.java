package day0205;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("�������");
		int year =	new Scanner(System.in).nextInt();
		String a = "ƽ��";
		if(year%4 == 0){
			if(year%100 != 0){
				a = "����";
			}
		}
		if(year%400 == 0){
			a = "����";
		}
		System.out.println(year+"����"+a);
	}

}
