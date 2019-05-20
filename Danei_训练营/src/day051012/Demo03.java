package day051012;

import java.util.Arrays;

public class Demo03 {

	public static void main(String[] args) {
			/*
			 * 练习：
			 * 1.创建整型数组a包含5个元素
			 * 为a数组最后一个元素赋值100并输出
			 * 2.创建字符数组b并直接赋值（我爱JAVA）
			 * 3.创建整型数组c包含10个元素
			 * 为c数组每个元素都赋值100
			 * 4.int[] e =new int[]{10,20,30,40,50};
			 * 逆顺序输出e数组元素
			 */
		int[] a = new int[5];
		a[4] = 100;
		System.out.println(a[4]);
		
		char[] b = new char[]{'我','爱','j','a','v','a'} ;
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[10];
		for(int i = 0;i<c.length;i++){
			c[i] = 100;
		}
		System.out.println(Arrays.toString(c));
		
		
		int[] e =new int[]{10,20,30,40,50};
		int[] f = new int[5];
		for(int x=e.length-1;x>=0;x--){
			System.out.print(e[x]+" ");
		}
//		System.arraycopy(e,4,f,0,5);
//		System.out.println(Arrays.toString(f));
		
		
	}

}
