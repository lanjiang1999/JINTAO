package day1101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		/**
		 * ��������
		 * ��ʾ�����Ѿ�������xxx��
		 */
		
		System.out.println("��������(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//ctrl+1,ѡ��add throws
		Date d = sdf.parse(s);
		long t = System.currentTimeMillis()-d.getTime();
		
		t = t/1000/60/60/24/365;
		System.out.println("���Ѿ�������"+t+"��");
		
	}

}
