package day51012;

import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * ð������ (91,22,15,86,57,36,11) һ������6�ֱȽ� 
		 * 			1�ֱȽ�6��(7-1)
		 *  		2�ֱȽ�5��(7-2)
		 * 			...
		 * 			6�ֱȽ�1��(7-6)
		 */
		int[] a = new int[] { 91, 22, 15, 86, 57, 36, 11 };
		int c = a.length;
		for (int i = 1; i < c; i++) { // ������
			for (int j = 0; j < c - i; j++) { // ÿһ�ֱȽϴ���
				if (a[j] > a[j + 1]) {
					int t;
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}

			}
		}
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[]{2,5,6,1,4};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
