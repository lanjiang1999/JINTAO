package day1301;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try {
			f();
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ����");
		} catch (IOException e) {
			System.out.println("���ܴ����ļ�");
		}
	}

	private static void f() throws ParseException, IOException {
		/*
		 * 1999-2-6
		 * -->Date-->2364868673
		 * 
		 * ��d�̸�Ŀ¼
		 * 
		 */
		System.out.println("����(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		long t = d.getTime();
		String path = "d:\\"+t+".txt";
		File file = new File(path);
		file.createNewFile();
		System.out.println("�ļ��Ѵ���"+path);
		
	}

}
