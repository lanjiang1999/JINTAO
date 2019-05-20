package day1503;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//¼��ʳ���б�
		ArrayList<String> list = luRu();
		//�б��е�ʳ����浽�ļ�
		baoCun(list);
	}

	private static ArrayList<String> luRu() {
		System.out.println("¼�뾭����Ĳ�:");
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			System.out.println("����(exit����): ");
			String s = new Scanner(System.in).nextLine();
			if("exit".equals(s)) {
				break;
			}
			list.add(s);
		}
		return list;
	}

	private static void baoCun(ArrayList<String> list) {
		//����ļ���·��
		try {
			String path = getPath();
			//PW--OSW--FOS--path
			PrintWriter out = 
			 new PrintWriter(
			 new OutputStreamWriter(
			 new FileOutputStream(path), "GBK"));
			
			for (String s : list) {
				out.println(s+";0");
			}
			
			out.close();
			System.out.println("�ļ��ѱ���");
		} catch (Exception e) {
			System.out.println("�����ļ�ʧ��");
			e.printStackTrace();
		}
	}

	private static String getPath() throws Exception {
		//D:\lesson\1810\ws1810\day1503_������\src\foods.txt
		/*
		 * *)�����·���ķ�ʽ������ȡ����·��
		 * *) "/" ��ʾ���������Ŀ¼��binĿ¼
		 * *) "/foods.txt" ��ʾ bin/foods.txt
		 */
		
		//�ļ�������ڣ������ڻ�õ�null
		String path =
		 Test1.class
		 .getResource("/foods.txt")
		 .getPath();
		
		//%e9%9a%8f url����س���ȷ�����ģ���
		path = URLDecoder.decode(path, "UTF-8");
		
		return path;
	}
}








