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
		 * �ļ���d:/abc/a.mp4
		 * ����ļ��Ĵ�С(Kb)��1024
		 * 
		 * d:/abc/a.mp4
		 * [d:/abc/a.mp4_split]
		 *          a.mp4.1
		 *          a.mp4.2
		 *          a.mp4.3
		 *          ...
		 */
		System.out.println("�ļ���");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println("����Ĳ����ļ�");
			return;
		}
		System.out.print("����ļ���С(Kb)��");
		long size = 
		   1024*new Scanner(System.in).nextLong();
		try {
			split(file, size);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void split(
			File file, long size) throws Exception {
		//d:/abc/a.mp4
		//[d:/abc/a.mp4_split]
		//׼���ļ���
		File dir = zbwjj(file);
		//ԭ�ļ��ļ���
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
			//���û�����������ǰһ���ļ�����
			if(out == null || byteCount == size) {
				if(byteCount == size) {
					out.close();//�ر�ǰһ�������
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
		
		if(! dir.exists()) {//�ļ��в�����
			dir.mkdirs();//����
		} else {//�ļ����Ѿ�����
			clear(dir);//���
		}
		return dir;
	}
	private static void clear(File dir) {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}
		for (File f : files) {
			if(f.isFile()) {//f���ļ�
				f.delete();
			} else {//f���ļ���
				clear(f);//���f�ļ���
				f.delete();//ɾ��f�ļ���
			}
		}
	}
}









