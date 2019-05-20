package day1402;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1_reWrite {

	public static void main(String[] args) {
		/**
		 * 文件拆分
		 * 1.提示用户输入文件，判断是否为文件类型
		 * 2.提示用户输入将原文件拆分成多大kb的拆分文件
		 * 3.拆分spilt方法
		 */
		System.out.println("文件");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println("只能输入文件");
			return;
		}
		System.out.println("拆分文件大小(kb)");
		Long size  = 
				1024* new Scanner(System.in).nextLong();
		try {
			split(file,size);
			System.out.println("完成");
		}catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
			
	}

	private static void split(File file, Long size) throws Exception {
		//准备文件夹
		File dir = zbwjj(file);
		//原文件名
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
			if(out == null || byteCount == size) {
				out.close();
			}
			out = new BufferedOutputStream(
				  new FileOutputStream(
				  new File(dir,
						  name+"."+(++fileCount))));
			byteCount = 0;
		}
		out.write(b);
		byteCount++;
		
		in.close();
		out.close();
	}

	private static File zbwjj(File file) {
		File dir = new File(
			file.getAbsolutePath()+"_spilt");
		
		if(! dir.exists()) {
			dir.mkdirs();	
		}else {
			clear(dir);	
		}
		
		return dir;
	}

	private static void clear(File dir) {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}
		for (File f : files) {
			if(f.isFile()) {
				f.delete();
			}else {
				clear(f);
				f.delete();
			}
			
		}
	}
		
}


