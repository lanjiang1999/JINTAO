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
		 * �ļ����
		 * 1.��ʾ�û������ļ����ж��Ƿ�Ϊ�ļ�����
		 * 2.��ʾ�û����뽫ԭ�ļ���ֳɶ��kb�Ĳ���ļ�
		 * 3.���spilt����
		 */
		System.out.println("�ļ�");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println("ֻ�������ļ�");
			return;
		}
		System.out.println("����ļ���С(kb)");
		Long size  = 
				1024* new Scanner(System.in).nextLong();
		try {
			split(file,size);
			System.out.println("���");
		}catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
			
	}

	private static void split(File file, Long size) throws Exception {
		//׼���ļ���
		File dir = zbwjj(file);
		//ԭ�ļ���
		String name = file.getName();
		//������������
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


