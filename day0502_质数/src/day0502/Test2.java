package day0502;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//�ж�n�Ƿ�������
		//��2��n������1��Ѱ���ܱ�n�����������ҵ���n�����������Ҳ�����n������
		System.out.println("��������");
		int a = new Scanner(System.in).nextInt();
		
		if(isPrime(a)){
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
	}

	private static boolean isPrime(int a) {
		if(a == 2){
			return true;
		}
		if(a < 2){
			return false;
		}
		//����b �洢a����+1��ֵ
		double b = Math.sqrt(a)+1;
		//ѭ����2�� ��n������1��
		for(int  i = 2;i < b;i++ ){
			if(a % i ==0){
				return false;
			}
			
		}
		return true;
	}

}
