package day051012;

import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
			/**
			 * ���飺Ϊ��ͬ��������Ԫ����ɵļ���
			 * �������͡��� ������ = new �������͡���С��
			 *
			 */
				int[] arr = new int[5]; // 
				int[] arr1 = new int[]{1,2,3,4,5};//ֱ�Ӹ����鸳ֵ
				
				
				
				//��ȡ���鳤��
				int [] a = new int []{1,2,3,4,5,6};
				int h = a.length;
				System.out.println(h);
				//��������
				System.out.println(a);//�����ֵַ
				System.out.println(Arrays.toString(a));//��ȷ��������
				//������±꣺���ʵ���Ԫ��
				System.out.println(a[4]);
				System.out.println("000000000000000000");
				//��ϰ������b����ڶ���Ԫ�غ͵�����Ԫ�ص�λ��
				int [] b = new int []{1,3,5,7,9};
				int c;
				c = b[2];
				b[2] = b[1];
				b[1] = c;
				System.out.println(Arrays.toString(b));
				
	}

}
