
package day021009;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		//��֧�ṹ
//		int a = 5;
//		
//		if(a%2==0){
//			System.out.println("ż��");
//		}else{
//			System.out.println("����");
//		}
		/**
		 * ��·�������˹涨:
		 * �������50����ģ����˷Ѱ���ÿ����0.15Ԫ
		 * �Ʒѣ�����50����ĳ�������ÿ�������0.10Ԫ��
		 * 
		 * ��ȡ�û��������������,��д��������Զ��Ʒ�.
		 */
		Scanner sc  = new Scanner(System.in);
		System.out.println("��������������:");
		int weight = sc.nextInt();//��������
		double price ;
		if(weight<=50){
			price = weight * 0.15;
		}else{
			price = (50*0.15)+(weight-50)*0.25;
		}
		System.out.println("�ܼ�ǮΪ:"+price);
		
		
		
		
		
		
	}
}

