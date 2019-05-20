package day1107;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("输入春节日期(yyyy-MM-dd)");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		long t = d.getTime()-System.currentTimeMillis();
		
		t = t/1000/60/60/24;
		System.out.println("距离春节还有"+t+"天");
		
		
	}

}
