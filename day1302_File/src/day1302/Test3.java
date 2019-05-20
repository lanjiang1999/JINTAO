package day1302;

import java.io.File;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("文件夹路径");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		/**
		 * 文件夹如果不存在
		 * 或文件夹没有权限进入
		 * 会得到Null值
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		if(null == names) {
			System.out.println("不能获取该文件夹列表");
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
