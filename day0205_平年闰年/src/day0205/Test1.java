package day0205;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������");
			int year = sc.nextInt();
			
			if((year%4 == 0 && year%100 != 0)|| year%400 == 0){
				System.out.println(year+"��������");
			}else{
				System.out.println(year+"����ƽ��");
			}					//ctrl shift / \
	}

}
