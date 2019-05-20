package day1302;

import java.io.File;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("�ļ���·��");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ����ļ���");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		/**
		 * �Բ���dir�ļ����б��浽files
		 * ���files��nullֵ������0
		 * �����ۼӱ��� sum = 0L
		 * ����files���飬ȡ���ļ��浽f
		 * 	���f���ļ�
		 * 		��sum�ۼ�f �ļ��Ĵ�С
		 * 	����
		 * 		��sum�ۼ�f�ļ��еĴ�С���ݹ������
		 * 
		 * ѭ������������sum��ֵ
		 */
		File[] files = dir.listFiles();
		if(files == null) {
			return 0;
		}
		long sum = 0L;
		for (File f : files ) {
			if(f.isFile()) {		//f���ļ�
				sum += f.length();
			}else{					//���ļ���
				sum += dirLength(f); //�ݹ�
			}
		}
		
		return sum;
	}

}
