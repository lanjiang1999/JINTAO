package day1401;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("ԭ�ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("����Ĳ����ļ�");
			return;
		}
		System.out.println("Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println(
			 "���������ļ��У�����������ļ�");
			return;
		}
		
		System.out.println("KEY:");
		int key = new Scanner(System.in).nextInt();
		
		try {
			encryptCopy(from, to, key);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");			
			e.printStackTrace();//��ӡ�������쳣��Ϣ
		}
		
	}

	private static void encryptCopy(
			File from, File to, int key) throws Exception {
		/*
		 * BIS--FIS--from
		 * BOS--FOS--to
		 */
		BufferedInputStream in = 
			  new BufferedInputStream(
			  new FileInputStream(from));
		BufferedOutputStream out = 
			  new BufferedOutputStream(
			  new FileOutputStream(to));
		
		int b;
		while((b = in.read()) != -1) {
			b ^= key;
			out.write(b);
		}
		
		//out.flush();		
		
		in.close();
		/*
		 * �߼�����close()
		 *     1. flush()
		 *     2. ��ӵ���.close()
		 */
		out.close();
	}
	
	
}









