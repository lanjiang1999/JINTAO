package day0406;

import java.util.Arrays;
import java.util.Random;

public class Test1_rewrite {

	public static void main(String[] args) {

		/**
		 *  �����������˳��
			����10�����ȵ�int[]����
			˳�����1��10
			j������λ���������λ
			i��jλ�õ�ֵ����
        		j
         	[5,9,4,3,1,6,7,8,2,10]
        	i	
		 */

		//f1���� �½�����Ϊ10���������� a
		int [] a = f1(10);
		
		//���������� a ����˳��
		int [] c = f2(a);

	}


	

	private static int[] f1(int b) {	//	int b	�������Ĳ����������������
		
		int [] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
	
	
	private static int[] f2(int[] c) {
		for (int i = 0; i < 10; i++) {
			 	int j = new Random().nextInt(10);
			 	int t = c[i];
			 	c[i] = c[j];
			 	c[j] = t;
		}
		System.out.println(Arrays.toString(c));
		
		return null;
	}



}