package day1302;

import java.io.File;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("�ļ���·��");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ����ļ���");
			return;
		}
		/**
		 * �ļ������������
		 * ���ļ���û��Ȩ�޽���
		 * ��õ�Nullֵ
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		if(null == names) {
			System.out.println("���ܻ�ȡ���ļ����б�");
			return;
		}
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("------------");
		for (File f : files) {
			System.out.println(
					f.getName()+" : "+f.length());
			
		}
	}

}
