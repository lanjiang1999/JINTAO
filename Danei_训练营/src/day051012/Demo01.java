package day051012;

import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
			/**
			 * 数组：为相同数据类型元素组成的集合
			 * 数据类型【】 数组名 = new 数据类型【大小】
			 *
			 */
				int[] arr = new int[5]; // 
				int[] arr1 = new int[]{1,2,3,4,5};//直接给数组赋值
				
				
				
				//获取数组长度
				int [] a = new int []{1,2,3,4,5,6};
				int h = a.length;
				System.out.println(h);
				//访问数组
				System.out.println(a);//输出地址值
				System.out.println(Arrays.toString(a));//正确访问数组
				//数组的下标：访问单个元素
				System.out.println(a[4]);
				System.out.println("000000000000000000");
				//练习：交换b数组第二个元素和第三个元素的位置
				int [] b = new int []{1,3,5,7,9};
				int c;
				c = b[2];
				b[2] = b[1];
				b[1] = c;
				System.out.println(Arrays.toString(b));
				
	}

}
