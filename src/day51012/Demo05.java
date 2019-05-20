package day51012;

import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 练习：
		 * 创建一个长度为10的数组a
		 * 为a数组每个元素赋值0-99之间的随机数
		 * 输出一次a数组
		 * 查询数组内的最大值并输出（不能改变数组的值和顺序）
		 */
//		int[] a = new int[10];
//		for(int i = 0;i<a.length;i++){
//			int num = (int) (Math.random() * 100 );
//			a[i] = num;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		int max = a[0];
//		for(int i = 1;i<a.length;i++){
//			if(a[i]>max){
//				max = a[i];
//			}
//			
//		}
//		System.out.println("最大值为"+max);
		/**
		 * 作业：
		 * 1.随机生成5个英文字母
		 * 
		 * 2. 
		 *       *
		 *      * * 
		 *     * * *
		 *    * * * *
		 *   * * * * * 
		 */
		char[] a = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				                         'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char n = 0;
		int num ;	
		for(int i = 0;i <5;i++) {					//输出次数
			 num = (int) (Math.random() *26);	
			   	n =	 a[num];	
			System.out.print(n);
		}
		
		
		

}
}
