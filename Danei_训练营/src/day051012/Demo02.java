package day051012;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		//����ı���
		int [] a =new int []{1,3,4,5,6}; 
		for(int i = 0;i<a.length;i++){
			a[i] = 10;		//�������ڵ�ÿһ��Ԫ�ظ�Ϊ...
			System.out.print(a[i]+" ");
		}
		
		
		//����ĸ���
		int[] b = new int []{10,20,30,40,50};
		int[] c = new int[6];
		System.arraycopy(b,0,c,1,3);	//��b������±�0��ʼ��3��Ԫ�ظ��Ƹ�c���飬
										//����������c�±�1��ʼ
		System.out.println(Arrays.toString(c));
		
		//����ĸ���2
		int[] d = new int []{10,20,30,40,50};
		int[] e = Arrays.copyOf(d, 6);		//��d���鸴�Ƹ�e���飬����e�ĳ���Ϊ6
		System.out.println(Arrays.toString(e));
		
	}

}
