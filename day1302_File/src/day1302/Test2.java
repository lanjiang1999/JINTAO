package day1302;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		/**
		 * d:\abc\aa
		 * d:\abc\aa\f1
		 * 删除f1
		 * 删除aa文件夹
		 */
		
		File dir = new File("d:/abc/aa");
		File file = new File("d:/abc/aa/f1");
		System.out.println("按回车继续");
		
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
