package day0509;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		int [] a =suiJi();
		System.out.println("-------------");
		System.out.println(Arrays.toString(a));
		
		sort(a);
		System.out.println("-------------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		//随机产生一个整数值，存到n
		//范围5+[0,6)
		int n = 5 + new Random().nextInt(6);
		//新建int[]数组，存到变量a
		//长度n
		int [] a = new int [n];
		//遍历a数组，1~100内随机数
		for(int i = 0;i < a.length;i++){
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}

}
