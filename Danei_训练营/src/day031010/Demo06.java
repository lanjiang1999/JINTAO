package day031010;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		//ѭ��:��ͬ�����ƵĴ��뱻�����ظ�ִ��
		int a = 1;
		while(a<10){
			System.out.println("������Ϊν");
			a++;//��û�д˲��裬��������ѭ��
		}
		
		
		int b = 1;
		while(b<10){
			if(b==4){
				break;
			}
			System.out.println(b);
			b++;
		}
		
		
		
		Scanner sc = new Scanner(System.in);//��ִ�У����ж�
		int pw;
		do{
			System.out.println("����������");
			pw = sc.nextInt();
		}while(pw!=123);//�����pw��������123��������������ѭ������
						//pw����123ʱ��������������ѭ��ֹͣ
		
		
		
		
		
		
		
		
		
	}

}
