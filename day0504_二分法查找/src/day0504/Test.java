package day0504;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] a = suiJi();
		//对a数组排序
		//优化的快速排序算法
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("查找的目标值");
		int t = new Scanner(System.in).nextInt();
		
		//二分法查找
		//如果目标值不存在，返回负数特殊值
		int index = binanrySearch(a,t);
		System.out.println(index);
		
	}

	private static int[] suiJi() {
		/**
		 * 1.随机产生整数n，5+[0,6)
		 * 2.新建int[]数组，长度n
		 * 3.遍历填入100内随机值
		 * 4.返回数组
		 */
		int n = 5+new Random().nextInt(6);
		int [] a = new int [n];
		for(int i = 0;i <a.length;i++){
			a[i] = new Random().nextInt(100);                        
		}
		
		return a;
		
	}

	private static int binanrySearch(int[] a, int t) {
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
		while(lo <= hi){
			mid = (lo+hi)/2;
			if(a[mid] > t){
				hi = mid - 1;
			}else if(a[mid] < t){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}
