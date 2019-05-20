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
			System.out.println("日期格式错误");
		} catch (IOException e) {
			System.out.println("不能创建文件");
		}
	}

	private static void f() throws ParseException, IOException {
		/*
		 * 1999-2-6
		 * -->Date-->2364868673
		 * 
		 * 在d盘根目录
		 * 
		 */
		System.out.println("生日(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		long t = d.getTime();
		String path = "d:\\"+t+".txt";
		File file = new File(path);
		file.createNewFile();
		System.out.println("文件已创建"+path);
		
	}

}
