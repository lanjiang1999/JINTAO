package day0502;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//�ж�n�Ƿ�������
		//��2��n������1��Ѱ���ܱ�n�����������ҵ���n�����������Ҳ�����n������
		System.out.println("��������");
		int n = new Scanner(System.in).nextInt();
		
		if(isPrime(n)) {
			System.out.println("������");
			
		}else {
			System.out.println("��������");
		}
	}

	private static boolean isPrime(int n) {
		if(n == 2){
			return true;
		}
		if(n < 2){
			return false;
			
		}
		//��n����+1
		double max = Math.sqrt(n)+1;
		//��2��max��Χ���ҵ���n������ֵ
		for(int i = 2;i < max;i++) {
			if(n % i == 0){
				//��������
				return false;
			}
			
		}
		return true;//n������
	}

}
