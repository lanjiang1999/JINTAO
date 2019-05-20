package day0504;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2_rewrite {
	public static void main(String[] args) {
		int [] a = suiji();
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("����Ҫ���ҵ���ֵ");
		int t  = new Scanner(System.in).nextInt();
		
		int index = binarySearch(a, t);
		System.out.println("���ҵ���ֵ"+t+"�������е��±�Ϊ��"+index);
	}


	private static int[] suiji() {
		
		int n  = 8 + new Random().nextInt(8);
		int [] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new  Random().nextInt(1000);
		}
		return a;
	}
	
	
	private static int binarySearch(int[] a, int t) {
		//�����±����
				//lo = 0
				//hi = a.length-1
				//mid
				
				//��lo<=hi
					//�����м�λ�ã�����mid
					//���midλ�õ�ֵ��Ŀ��ֵt��
						//hi��λ��mid-1
				    //�������С
							//lo��λmid+1
					//����
							//����mid �±�ֵ
				//ѭ��������û�����ݣ����ظ���������ֵ -1
		int lo = 0;
		int hi = a.length-1;
		int mid;
		while(lo <= hi) {
			mid = (lo+hi)/2;
			if(a[mid] < t) {
				lo = mid+1;
			}else if(a[mid] > t) {
				hi = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}
}
