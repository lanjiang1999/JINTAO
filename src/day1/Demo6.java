package day1;

import java.util.Scanner;

public class Demo6 {

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
		
		double totalPrice = price*time;
		
		
		if(totalPrice>=100) {
			totalPrice=totalPrice*0.8;
		}
		if(money>=totalPrice) {
			System.out.println("�ܹ�����"+totalPrice+"����"+(money-totalPrice));
			
		}else {
//			System.out.println("����");
		}
		
		
		
		
		
			}
		}
		
		
		

