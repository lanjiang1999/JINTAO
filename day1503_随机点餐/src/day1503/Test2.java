package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			//����foods.txt�ļ������ʳ���б�
			ArrayList<Food> list = load();
			if(list.size() == 0) {
				System.out.println(
				 "��������Test1��¼��ʳ��");
				return;
			}
			System.out.print("�����ѡ����ʳ�");
			int n = new Scanner(System.in).nextInt();
			//���ѡ��ʳ��
			Food[] foods = suiJi(list, n);
			//��ʾ��ѡ�Ľ��
			show(foods);
			//���±���ʳ���б�
			baoCun(list);
		} catch (Exception e) {
			System.out.println("���ִ���");
			e.printStackTrace();
		}
	}

	private static ArrayList<Food> load() throws Exception {
		String path = getPath();
		//BR--ISR--FIS--path
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 new FileInputStream(path), "GBK"));		
		ArrayList<Food> list = new ArrayList<>();		
		String line;
		while((line = in.readLine()) != null) {
			//"aaaa;0" --> ["aaaa", "0"]
			String[] a = line.split(";");
			Food f = new Food();
			f.setName(a[0]);
			f.setCount(Integer.parseInt(a[1]));
			list.add(f);
		}
		Collections.sort(list, new Comparator<Food>() {
			@Override
			public int compare(Food o1, Food o2) {
				return o1.getCount()-o2.getCount();
			}
		});
		
		in.close();
		return list;
	}

	private static String getPath() throws Exception {
		String path =
		 Test1.class
		 .getResource("/foods.txt")
		 .getPath();
		return URLDecoder.decode(path, "UTF-8");
	}

	private static Food[] suiJi(
			ArrayList<Food> list, int n) {
		if(n>list.size()) {
			return list.toArray(new Food[list.size()]);
		}
		if(n<1) {
			n = 1;
		}
		
		Food[] a = new Food[n];
		for (int i = 0; i < a.length;  ) {			
			int mid = list.size()/2;//�м��±�
			Food f;
			if(Math.random()<0.7) {
				// [0, mid) ��Χ���ѡȡ1��
				f = list.get(
				 new Random().nextInt(mid));
			} else {
				// mid+[0, list.size()-mid) ��Χ���ѡȡ1��
				f = list.get(
				 mid+new Random().nextInt(list.size()-mid));
			}
			//��a���飬ת��List����
			//���жϼ������Ƿ����ָ���Ķ���
			if(Arrays.asList(a).contains(f)) {
				continue;
			}
			a[i] = f;
			//��ѡ����+1
			a[i].setCount(a[i].getCount()+1);
			i++;
		}
		return a;
	}

	private static void show(Food[] foods) {
		System.out.println("Ϊ�������ͣ�");
		for (Food f : foods) {
			System.out.println(f.getName());
		}
	}

	private static void baoCun(ArrayList<Food> list) throws Exception {
		String path = getPath();
		//PW--OSW--FOS--path
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream(path), "GBK"));
		
		for (Food f : list) {
			out.println(f);
		}
		
		out.close();
		//System.out.println("�ļ��ѱ���");
	}
}




