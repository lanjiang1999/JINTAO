package day0503;

import java.util.Arrays;
import java.util.Random;

public class Test1_rewrite {
	
	public static void main(String[] args) {
		
		int [] a = suiji();
		System.out.println("�������һ������\n"+Arrays.toString(a));
		
		
		sort(a);
		System.out.println("��������������\n"+Arrays.toString(a));
		
	}

	private static int[] suiji() {
		//�������һ��5+[0,6) �������浽����n
		int n = 5+new Random().nextInt(6);
		
		//��n��Ϊa����ĳ��� ����һ��������
		int [] a = new int [n];
		
		//����200[0,100)���ڵ����� �������������
		for (int i = 0; i < a.length; i++) {
			a[i] = 200+new Random().nextInt(100);
		}
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
		
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = a.length-1; j > i ; j--) {
				
				if(a[j] < a[j-1]) {
					int t  ;
					
					t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					flag = true;
				}
			}
			
			if(!flag) {
				break;
			}
			System.out.println("���������е�����\n"+Arrays.toString(a));
			
		}
		
		
	}

}
