package Practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		//���1-100���ܱ���������ǰ�����   ���101-200�ڵ�����
		int num = 0;						//����������ֵ�����
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