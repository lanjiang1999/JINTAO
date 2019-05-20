package day1302;

import java.io.File;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("文件夹路径");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		/**
		 * 对参数dir文件夹列表，存到files
		 * 如果files是null值，返回0
		 * 定义累加变量 sum = 0L
		 * 遍历files数组，取出文件存到f
		 * 	如果f是文件
		 * 		向sum累加f 文件的大小
		 * 	否则
		 * 		向sum累加f文件夹的大小（递归求出）
		 * 
		 * 循环结束，返回sum的值
		 */
		File[] files = dir.listFiles();
		if(files == null) {
			return 0;
		}
		long sum = 0L;
		for (File f : files ) {
			if(f.isFile()) {		//f是文件
				sum += f.length();
			}else{					//是文件夹
				sum += dirLength(f); //递归
			}
		}
		
		return sum;
	}

}
