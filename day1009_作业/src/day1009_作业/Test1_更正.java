package day1009_作业;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1_更正 {
	//查找所有字串出现的位置
	//用ArrayList存放找到的下标位置

	public static void main(String[] args) {
		System.out.println("输入字符串");
		String s = new Scanner(System.in).nextLine();
		System.out.println("输入查找的字串");
		String t = new Scanner(System.in).nextLine();
		
		ArrayList<Integer> a = find(s,t);
		if(a.size() == 0) {
			System.out.println("找不到字串");
		}else {
			System.out.println(a);
		}
	}

	private static ArrayList<Integer> find(String s, String t) {
		//新建足够长的数组
		ArrayList<Integer> list = new ArrayList<>();
	//	int [] a = new int [s.length()];
		int index = 0;
	//	int i = 0;
		while(true) {
			//查找
			index = s.indexOf(t,index);
			if(index == -1) {
				break;
			}
//			a[i] = index;
//			i++;
			list.add(index);
			index++;
		}
		return list;
	}
	
	

}
