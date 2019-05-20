package day51012;

import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 冒泡排序 (91,22,15,86,57,36,11) 一共经过6轮比较 
		 * 			1轮比较6次(7-1)
		 *  		2轮比较5次(7-2)
		 * 			...
		 * 			6轮比较1次(7-6)
		 */
		int[] a = new int[] { 91, 22, 15, 86, 57, 36, 11 };
		int c = a.length;
		for (int i = 1; i < c; i++) { // 总轮数
			for (int j = 0; j < c - i; j++) { // 每一轮比较次数
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
