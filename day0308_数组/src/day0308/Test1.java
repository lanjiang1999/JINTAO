package day0308;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		//新建int[]数组，长度5
		//再把它的地址存到变量a
		int [] a = new int [5];
		/**
		 * Arrays.toString(a)
		 * 把数组中的值，连接成字符串
		 * "[0, 0, 0, 0, 0]"
		 */
		System.out.println(Arrays.toString(a));
		char [] b = {'a','b','c','d'};
		System.out.println(Arrays.toString(b));
		
		a = new int []{1,2,3,4,9,};
		System.out.println(Arrays.toString(a));
		
		a[2] = 9;
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
		System.out.println(a[2]*2);
		System.out.println(a[2]++);
		System.out.println(Arrays.toString(a));
		
		//遍历a数组
		for(int i = 0;i < a.length;i++){
			System.out.println(a[i]);
		}



		

	}

}
