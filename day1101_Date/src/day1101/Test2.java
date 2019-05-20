package day1101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		/**
		 * 输入生日
		 * 显示：您已经生存了xxx天
		 */
		
		System.out.println("输入生日(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//ctrl+1,选择add throws
		Date d = sdf.parse(s);
		long t = System.currentTimeMillis()-d.getTime();
		
		t = t/1000/60/60/24/365;
		System.out.println("你已经生存了"+t+"天");
		
	}

}
