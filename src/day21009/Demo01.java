package day21009;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * ������С��Ϸ
		 * �������һ��1��1000��Χ�������
		 * 
		 * ��ʾ�û�ȥ��
		 * ��ȡ�û��µ�ֵ
		 * �Ƚ�
		 * �´��ˣ���С�ˣ������ˣ���0������Ϸ
		 */
		//0��1֮����������ȡ��0ȡ����1
		int num = (int)(Math.random()*1000+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����");
		int guess;
		
		do {
			 guess = sc.nextInt();
			if(guess==0) {
				System.out.println("��Ϸ����");
				break;
			}
			
			if(guess>num) {
				System.out.println("�´���");
			}else if(guess<num) {
				System.out.println("��С��");
			}else if(guess==num) {
				System.out.println("�¶���");
				break;
			}
			
		}while(guess!=num);
		sc.close();
		System.out.println();
		
		
		
	}
	
}
