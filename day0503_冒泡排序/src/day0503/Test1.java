package day0503;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		//冒泡排序，随机的乱序数组
		int [] a = suiJi();
		System.out.println("随机生成一个数组:\n"+Arrays.toString(a));
		System.out.println("-------------");
		
		
		sort(a);//对数组a排序
		System.out.println("----排序后有序的数组为---------");
		System.out.println(Arrays.toString(a));
		
	}

	private static int[] suiJi() {
		//随机产生一个整数值，存到n
		//范围5+[0,6)
		int  n =5+new Random().nextInt(6);
		//System.out.println("n="+n);
		
		
		//新建int[]数组，存到变量a
		//长度n
		int [] a = new int [n];
		
		//遍历数组，填入100内随机值
		for(int i = 0;i < a.length;i++){
			int j = new Random().nextInt(100);
			a[i] = j;
			
		}
		
		//返回数组a
		
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
		
		for(int i = 0;i < a.length;i++){
			boolean flag = false;
			//J循环较小值向前交换，最小值交换到i位置
			for(int j = a.length-1;j > i;j--){
				if(a[j] < a[j-1]){
					int t;
					t = a[j];
					a[j]  = a[j-1];
					a[j-1] = t;
					flag = true;
				}
			}
			//flag是false，没有交换数据
			//数据位置都是正确的
			if(!flag){
				break;
				
			}
			System.out.println(Arrays.toString(a)); 
		}
		
	}

}
