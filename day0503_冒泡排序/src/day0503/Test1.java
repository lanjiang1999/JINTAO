package day0503;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		//ð�������������������
		int [] a = suiJi();
		System.out.println("�������һ������:\n"+Arrays.toString(a));
		System.out.println("-------------");
		
		
		sort(a);//������a����
		System.out.println("----��������������Ϊ---------");
		System.out.println(Arrays.toString(a));
		
	}

	private static int[] suiJi() {
		//�������һ������ֵ���浽n
		//��Χ5+[0,6)
		int  n =5+new Random().nextInt(6);
		//System.out.println("n="+n);
		
		
		//�½�int[]���飬�浽����a
		//����n
		int [] a = new int [n];
		
		//�������飬����100�����ֵ
		for(int i = 0;i < a.length;i++){
			int j = new Random().nextInt(100);
			a[i] = j;
			
		}
		
		//��������a
		
		return a;
	}

	private static void sort(int[] a) {
		/**
		 * ð������
		 * 								j
		 * [18, 28, 79, 12, 99, 11, 39, 30]
		 *     i 
		 * jѭ�����ѽ�Сֵ��ǰ����
		 * ���գ�����Сֵ��������iλ��
		 */
		//iѭ����ͷ��β����
		   //jѭ����a.length-1��j>i �ݼ�
				//���jλ��ֵ����j-1λ�õ�ֵС
						//�����ߵ�ֵ����
		
		for(int i = 0;i < a.length;i++){
			boolean flag = false;
			//Jѭ����Сֵ��ǰ��������Сֵ������iλ��
			for(int j = a.length-1;j > i;j--){
				if(a[j] < a[j-1]){
					int t;
					t = a[j];
					a[j]  = a[j-1];
					a[j-1] = t;
					flag = true;
				}
			}
			//flag��false��û�н�������
			//����λ�ö�����ȷ��
			if(!flag){
				break;
				
			}
			System.out.println(Arrays.toString(a)); 
		}
		
	}

}
