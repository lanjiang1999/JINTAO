package day011008;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * ������������:(����)
		 * byte:-128~127
		 * short:-32768~32767
		 * int:-2147483648~2147483647
		 * long:
		 */
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
//		int a1 = 3.14;���Ͳ���
//		int a2 = 10000000000;����Χ
		int a3 = 5;
		int a4 = 2;
		//��������������
		System.out.println(a3/a4);
		System.out.println(a4/a3*100);//0
		System.out.println(100*a4/a3);//40
		
		//���
		int a = 2147483647;
		int b = -2147483648;
		a = a+1;
		b = b-1;
		System.out.println(a);
		System.out.println(b);
		
		
		//����ֱ����:ֱ�ӳ��ֵ�����������int
		long n = 10000000000L;
		System.out.println(n);
		
		
		
		
	}
}
