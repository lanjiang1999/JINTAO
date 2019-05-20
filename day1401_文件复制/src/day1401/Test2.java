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
		System.out.println("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("输入的不是文件");
			return;
		}
		System.out.println("目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println(
			 "不能输入文件夹，请输入具体文件");
			return;
		}
		
		System.out.println("KEY:");
		int key = new Scanner(System.in).nextInt();
		
		try {
			encryptCopy(from, to, key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");			
			e.printStackTrace();//打印完整的异常信息
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
		 * 高级流的close()
		 *     1. flush()
		 *     2. 相接的流.close()
		 */
		out.close();
	}
	
	
}









