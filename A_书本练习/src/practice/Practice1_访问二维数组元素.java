package practice;

import java.util.Arrays;

public class Practice1_访问二维数组元素 {

	public static void main(String[] args) {
//		int [] [] num;
//		num = new int [2] [2];
//		System.out.println(num[1][1]);
//		System.out.println(Arrays.toString(num));
		
		
		int [] [] a = {{1,2,3,4,6,8,},{89,78,45,45,62,120,305,56}};
		for(int i = 0;i < a.length;i++) {
			System.out.println("第"+(i+1)+"个人的成绩为:");
			for(int j = 0;j <a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			
			
		}
		
		
		
	}

}
