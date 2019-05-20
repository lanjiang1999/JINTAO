package Practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		//输出1-100内能被三整除的前五个数   输出101-200内的质数
		int num = 0;						//控制输出数字的条件
		for(int a = 1;a <= 100;a ++) {
			if(a%3==0) {
				num ++;
				System.out.println(a);
				if(num==9) {
					break;
				}
			}
		}
		
		
		for(int b = 101;b <= 200;b+=2) {
			
	
		}
	}

}