package day031010;

public class Demo08 {

	public static void main(String[] args) {
		/**
		 * for(���ʽ1�����ʽ2�����ʽ3){ ѭ����䣻 }
		 * 
		 * 1.���ʽ1Ϊѭ��������ʼֵ 2.���ʽ2Ϊѭ������ 3.���ʽ3Ϊѭ�������ĸ���
		 */
		for (int a = 1; a < 10; a++) {
			System.out.println(a);
			if (a == 5) {
				break;
			}
		}

		// 1 3 5 7 ....99
		System.out.println("000000000000000000000");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}

		// 100 98 96...4 2
		System.out.println("000000000000000000000");
		for (int i = 100; i >= 2; i = i - 2) {
			System.out.println(i);
		}
		//��ϰ��
		//����1+2+3+...100
		System.out.println("0000000000000000000000000000");
		
		int m=0;
		for(int i = 1;i<=100;i++){
			m +=i;
		}
		System.out.println(m);
		
		
		
		

	}
}
