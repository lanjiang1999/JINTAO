package day0504;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2_rewrite {
	public static void main(String[] args) {
		int [] a = suiji();
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("输入要查找的数值");
		int t  = new Scanner(System.in).nextInt();
		
		int index = binarySearch(a, t);
		System.out.println("查找的数值"+t+"在数组中的下标为："+index);
	}


	private static int[] suiji() {
		
		int n  = 8 + new Random().nextInt(8);
		int [] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new  Random().nextInt(1000);
		}
		return a;
	}
	
	
	private static int binarySearch(int[] a, int t) {
		//定义下标变量
				//lo = 0
				//hi = a.length-1
				//mid
				
				//当lo<=hi
					//计算中间位置，赋给mid
					//如果mid位置的值比目标值t大
						//hi定位到mid-1
				    //否则如果小
							//lo定位mid+1
					//否则
							//返回mid 下标值
				//循环结束，没有数据，返回负数无意义值 -1
		int lo = 0;
		int hi = a.length-1;
		int mid;
		while(lo <= hi) {
			mid = (lo+hi)/2;
			if(a[mid] < t) {
				lo = mid+1;
			}else if(a[mid] > t) {
				hi = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}
}
