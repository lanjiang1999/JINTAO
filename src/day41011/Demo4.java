package day41011;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		/**
		 * �������ʽ�Ӳ�������
		 * 1+1/2+1/3+1/4+....1/n=��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ֵ");
		int a = sc.nextInt();
		double sum = 0;
		for(int i = 1;i<=a;i++){
			sum = sum + 1.0/i;// 1/i����Ϊ0����Ϊ���Ͳ�ͬ��int double��
			if(i==1){
				System.out.print(i);
			}else{
				System.out.print("+1/"+i);
			}
		}
		System.out.print("="+sum);

	}

}
