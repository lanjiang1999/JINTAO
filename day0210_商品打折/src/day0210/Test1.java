package day0210;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*  ������Ʒ�۸����ۿۼ�

		  ��500��9��

		  ��1000,85��

		  ��2000,8��

		  ��5000��7��*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ʒ�۸�");
		int price = sc.nextInt();
		f(price);
	}
	
	
	static void f(int x){
		if(x < 500){
			System.out.println("������,��ԭ��֧��:"+x);
			return;
		}
		
		double dc = 0;			//�����ۿ���
		if(x >= 5000){
			dc = 0.7;	
		}else if(x >= 2000){
			dc = 0.8;										
		}else if(x >= 1000){								
			dc = 0.85;
		}else{
			dc = 0.9;
		} 
		
		double payPrice = x*dc;
		System.out.println("�ۺ���Ҫ֧��:"+payPrice);
	}
	

}
