package day1401;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
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
		try {
			copy(from, to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");			
			e.printStackTrace();//打印完整的异常信息
		}
		
	}

	private static void copy(
			File from, File to) throws Exception {
		/*
		 * *) 新建流
		 *    FIS--from 存到变量in
		 *    FOS--to 存到变量out
		 * *) 单字节循环读取标准格式
		 *     *) 读取的字节值，想输出流输出
		 * 
		 * *) 关闭输入流和输出流
		 */
		FileInputStream in = 
		 new FileInputStream(from);
		FileOutputStream out =
		 new FileOutputStream(to);
		
		/*int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}*/
		
		byte[] buff = new byte[8192];
		int n;//每一批的数量
		while((n = in.read(buff)) != -1) {
			out.write(buff, 0, n);
		}
		
		in.close();
		out.close();
	}
}










