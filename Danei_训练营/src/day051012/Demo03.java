package day051012;

import java.util.Arrays;

public class Demo03 {

	public static void main(String[] args) {
			/*
			 * ��ϰ��
			 * 1.������������a����5��Ԫ��
			 * Ϊa�������һ��Ԫ�ظ�ֵ100�����
			 * 2.�����ַ�����b��ֱ�Ӹ�ֵ���Ұ�JAVA��
			 * 3.������������c����10��Ԫ��
			 * Ϊc����ÿ��Ԫ�ض���ֵ100
			 * 4.int[] e =new int[]{10,20,30,40,50};
			 * ��˳�����e����Ԫ��
			 */
		int[] a = new int[5];
		a[4] = 100;
		System.out.println(a[4]);
		
		char[] b = new char[]{'��','��','j','a','v','a'} ;
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
