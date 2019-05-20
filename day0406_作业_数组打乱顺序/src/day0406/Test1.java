package day0406;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		/**
		 *  数组随机打乱顺序
			创建10个长度的int[]数组
			顺序放入1到10
			j在所有位置中随机定位
			i，j位置的值交换
        		j
         	[5,9,4,3,1,6,7,8,2,10]
        	i	
		 */
		int [] a = f1(10);
		int [] c = f2(a);
	}

	

	private static int[] f1(int b) {
		//创建长度为10的数组，默认值为0
		int [] a = new int [10];
		System.out.println(Arrays.toString(a));
		//给数组顺序赋值1~10
		for(int i = 0;i < a.length;i++){
			a[i] = i+1;
			System.out.println(a[i]);
			
		}
		return a;
	}
	
	
	private static int[] f2(int[] c) {
		for(int i = 0;i < 10;i++){
			int j =new Random().nextInt(10);
			int t =c[i];
			c[i] = c[j];
			c[j] = t;
			
		}
		System.out.print(Arrays.toString(c));
		return null;
	}
	
}
