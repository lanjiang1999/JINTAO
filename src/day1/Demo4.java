package day1;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		//��֧�ṹ
		int a = 80;
		if(a%2==0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}
		/**
		 * ��·�������˹涨
		 * 1.�������50kg�����˷Ѱ���ÿ����0.15Ԫ�Ʒ�
		 * ����50����ĳ�������ÿ�������0.10Ԫ
		 * 
		 * ��ȡ�û������������������д��������Զ��Ʒ�
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������������");
		double weight = sc.nextDouble();
		
		double b = 0.15*weight;
		double c = 0.15*50+0.25*(weight-50);
		if(weight<=50){
			System.out.println("����Ҫ֧���ķ���Ϊ"+b);
		}else{
			System.out.println("����Ҫ֧���ķ���Ϊ"+c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
