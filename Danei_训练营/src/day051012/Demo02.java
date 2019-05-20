package day051012;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		//数组的遍历
		int [] a =new int []{1,3,4,5,6}; 
		for(int i = 0;i<a.length;i++){
			a[i] = 10;		//将数组内的每一个元素改为...
			System.out.print(a[i]+" ");
		}
		
		
		//数组的复制
		int[] b = new int []{10,20,30,40,50};
		int[] c = new int[6];
		System.arraycopy(b,0,c,1,3);	//把b数组从下标0开始的3个元素复制给c数组，
										//放置在数组c下标1开始
		System.out.println(Arrays.toString(c));
		
		//数组的复制2
		int[] d = new int []{10,20,30,40,50};
		int[] e = Arrays.copyOf(d, 6);		//将d数组复制给e数组，数组e的长度为6
		System.out.println(Arrays.toString(e));
		
	}

}
