package day1302;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		/**
		 * d:\abc\aa
		 * d:\abc\aa\f1
		 * ɾ��f1
		 * ɾ��aa�ļ���
		 */
		
		File dir = new File("d:/abc/aa");
		File file = new File("d:/abc/aa/f1");
		System.out.println("���س�����");
		
		new Scanner(System.in).nextLine();
		dir.mkdirs();
		
		new Scanner(System.in).nextLine();
		file.createNewFile();
		
		new Scanner(System.in).nextLine();
		file.delete();
		
		new Scanner(System.in).nextLine();
		dir.delete();
		

		
		
		
	}

}
