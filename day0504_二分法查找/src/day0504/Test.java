package day0504;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] a = suiJi();
		//��a��������
		//�Ż��Ŀ��������㷨
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("���ҵ�Ŀ��ֵ");
		int t = new Scanner(System.in).nextInt();
		
		//���ַ�����
		//���Ŀ��ֵ�����ڣ����ظ�������ֵ
		int index = binanrySearch(a,t);
		System.out.println(index);
		
	}

	private static int[] suiJi() {
		/**
		 * 1.�����������n��5+[0,6)
		 * 2.�½�int[]���飬����n
		 * 3.��������100�����ֵ
		 * 4.��������
		 */
		int n = 5+new Random().nextInt(6);
		int [] a = new int [n];
		for(int i = 0;i <a.length;i++){
			a[i] = new Random().nextInt(100);                        
		}
		
		return a;
		
	}

	private static int binanrySearch(int[] a, int t) {
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
		while(lo <= hi){
			mid = (lo+hi)/2;
			if(a[mid] > t){
				hi = mid - 1;
			}else if(a[mid] < t){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}
