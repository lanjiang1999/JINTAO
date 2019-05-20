package day0503;

import java.util.Arrays;
import java.util.Random;

public class Test1_rewrite {
	
	public static void main(String[] args) {
		
		int [] a = suiji();
		System.out.println("随机生成一个数组\n"+Arrays.toString(a));
		
		
		sort(a);
		System.out.println("排序后的有序数组\n"+Arrays.toString(a));
		
	}

	private static int[] suiji() {
		//随机产生一个5+[0,6) 的整数存到变量n
		int n = 5+new Random().nextInt(6);
		
		//将n作为a数组的长度 产生一个新数组
		int [] a = new int [n];
		
		//遍历200[0,100)以内的数字 随机放入数组中
		for (int i = 0; i < a.length; i++) {
			a[i] = 200+new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/**
		 * 冒泡排序
		 * 								j
		 * [18, 28, 79, 12, 99, 11, 39, 30]
		 *     i 
		 * j循环，把较小值向前交换
		 * 最终，把最小值，交换到i位置
		 */
		//i循环从头到尾遍历
		   //j循环从a.length-1到j>i 递减
				//如果j位置值，比j-1位置的值小
						//则两者的值交换
		
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = a.length-1; j > i ; j--) {
				
				if(a[j] < a[j-1]) {
					int t  ;
					
					t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					flag = true;
				}
			}
			
			if(!flag) {
				break;
			}
			System.out.println("正在排序中的数组\n"+Arrays.toString(a));
			
		}
		
		
	}

}
