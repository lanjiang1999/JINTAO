package day1402;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 文件：d:/abc/a.mp4
		 * 拆分文件的大小(Kb)：1024
		 * 
		 * d:/abc/a.mp4
		 * [d:/abc/a.mp4_split]
		 *          a.mp4.1
		 *          a.mp4.2
		 *          a.mp4.3
		 *          ...
		 */
		System.out.println("文件：");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println("输入的不是文件");
			return;
		}
		System.out.print("拆分文件大小(Kb)：");
		long size = 
		   1024*new Scanner(System.in).nextLong();
		try {
			split(file, size);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void split(
			File file, long size) throws Exception {
		//d:/abc/a.mp4
		//[d:/abc/a.mp4_split]
		//准备文件夹
		File dir = zbwjj(file);
		//原文件文件名
		String name = file.getName();
		//两个计数变量
		long byteCount = 0;
		int fileCount = 0;
		
		BufferedInputStream in = 
		 new BufferedInputStream(
		 new FileInputStream(file));
		BufferedOutputStream out = null;		
		int b;
		while((b = in.read()) != -1) {
			//如果没有输出流，或前一个文件满了
			if(out == null || byteCount == size) {
				if(byteCount == size) {
					out.close();//关闭前一个输出流
				}
				out = new BufferedOutputStream(
					  new FileOutputStream(
					  new File(dir,  
						  name+"."+(++fileCount))));  
				byteCount = 0;
			}
			out.write(b);
			byteCount++;
		}		
		in.close();
		out.close();
	}
	
	

	private static File zbwjj(File file) {
		File dir = new File(
		 file.getAbsolutePath()+"_split");
		
		if(! dir.exists()) {//文件夹不存在
			dir.mkdirs();//创建
		} else {//文件夹已经存在
			clear(dir);//清空
		}
		return dir;
	}
	private static void clear(File dir) {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}
		for (File f : files) {
			if(f.isFile()) {//f是文件
				f.delete();
			} else {//f是文件夹
				clear(f);//清空f文件夹
				f.delete();//删除f文件夹
			}
		}
	}
}









