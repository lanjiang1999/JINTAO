package day1009_��ҵ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1_���� {
	//���������ִ����ֵ�λ��
	//��ArrayList����ҵ����±�λ��

	public static void main(String[] args) {
		System.out.println("�����ַ���");
		String s = new Scanner(System.in).nextLine();
		System.out.println("������ҵ��ִ�");
		String t = new Scanner(System.in).nextLine();
		
		ArrayList<Integer> a = find(s,t);
		if(a.size() == 0) {
			System.out.println("�Ҳ����ִ�");
		}else {
			System.out.println(a);
		}
	}

	private static ArrayList<Integer> find(String s, String t) {
		//�½��㹻��������
		ArrayList<Integer> list = new ArrayList<>();
	//	int [] a = new int [s.length()];
		int index = 0;
	//	int i = 0;
		while(true) {
			//����
			index = s.indexOf(t,index);
			if(index == -1) {
				break;
			}
//			a[i] = index;
//			i++;
			list.add(index);
			index++;
		}
		return list;
	}
	
	

}
