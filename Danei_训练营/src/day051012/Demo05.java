package day051012;

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
		int[] a = new int[10];
		for(int i = 0;i<a.length;i++){
			int num = (int) (Math.random() * 100 );
			a[i] = num;
		}
		System.out.println(Arrays.toString(a));
		
		int max = a[0];
		for(int i = 1;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
			
		}
		System.out.println("���ֵΪ"+max);
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
		
	}

}
