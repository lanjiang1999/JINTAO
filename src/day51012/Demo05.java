package day51012;

import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * ��ϰ��
		 * ����һ������Ϊ10������a
		 * Ϊa����ÿ��Ԫ�ظ�ֵ0-99֮��������
		 * ���һ��a����
		 * ��ѯ�����ڵ����ֵ����������ܸı������ֵ��˳��
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
//		System.out.println("���ֵΪ"+max);
		/**
		 * ��ҵ��
		 * 1.�������5��Ӣ����ĸ
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
		for(int i = 0;i <5;i++) {					//�������
			 num = (int) (Math.random() *26);	
			   	n =	 a[num];	
			System.out.print(n);
		}
		
		
		

}
}
