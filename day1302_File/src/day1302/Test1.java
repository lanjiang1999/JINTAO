package day1302;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		String path;
		//path = "D:\\BIJI.txt";//���ڵ��ļ�
		path = "D:\\software";//���ڵ��ļ���
		path = "x:\\ee\\gg";//�����ڵ�·��
		
		File f = new File(path);
		System.out.println(f.length());//�ļ��ֽ������ļ�����Ч
		System.out.println(f.isFile());//�Ƿ�Ϊ�ļ�
		System.out.println(f.isDirectory());//�Ƿ�Ϊ�ļ���
		System.out.println(f.lastModified());//����޸�ʱ�����ֵ
		System.out.println(f.exists());//�Ƿ����
		System.out.println(f.getName());//����ļ���
		System.out.println(f.getParent());//��ø��ļ���
		System.out.println(f.getAbsolutePath());//�������·��
		
	}

}
