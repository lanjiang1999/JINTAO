package day1;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		/**
		 * ��������ϵͳ��
		 * ��������
		 * ����ʱ��
		 * ���ɽ��
		 * 
		 * ���û����ѳ���100Ԫʱ�������
		 * ���û�����Ǯ��ʱ�����ܼۺ�����
		 * ���û���Ǯ����ʱ��ʾ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ϊ");
		int price = sc.nextInt();
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("����ʱ��Ϊ");
		double time = sc.nextDouble();
		
		Scanner sc2 =new Scanner(System.in);
		System.out.println("���ɽ��");
		double money = sc.nextDouble();
		
		double total = price*time;
		double total1 = total*0.8;
		if(total>=100){
			System.out.println("�ۺ�������"+total1+"����"+(money-total1));
			
		}else if(money>=total){
			System.out.println("������"+total+"����"+(money-total));
			
		}else{
			System.out.println("����");
		}
			
		
		
	}

}
