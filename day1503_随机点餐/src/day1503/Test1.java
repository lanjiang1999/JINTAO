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
		//录入食物列表
		ArrayList<String> list = luRu();
		//列表中的食物，保存到文件
		baoCun(list);
	}

	private static ArrayList<String> luRu() {
		System.out.println("录入经常点的餐:");
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			System.out.println("名称(exit结束): ");
			String s = new Scanner(System.in).nextLine();
			if("exit".equals(s)) {
				break;
			}
			list.add(s);
		}
		return list;
	}

	private static void baoCun(ArrayList<String> list) {
		//获得文件的路径
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
			System.out.println("文件已保存");
		} catch (Exception e) {
			System.out.println("保存文件失败");
			e.printStackTrace();
		}
	}

	private static String getPath() throws Exception {
		//D:\lesson\1810\ws1810\day1503_随机点餐\src\foods.txt
		/*
		 * *)用相对路径的方式，来获取绝对路径
		 * *) "/" 表示程序的运行目录，bin目录
		 * *) "/foods.txt" 表示 bin/foods.txt
		 */
		
		//文件必须存在，不存在会得到null
		String path =
		 Test1.class
		 .getResource("/foods.txt")
		 .getPath();
		
		//%e9%9a%8f url解码回成正确的中文：随
		path = URLDecoder.decode(path, "UTF-8");
		
		return path;
	}
}








