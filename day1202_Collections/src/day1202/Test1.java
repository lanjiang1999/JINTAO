package day1202;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * 
		 */
		List<String> list = new ArrayList<>();
		Collections.addAll(
			list,
			"1","21","30","10","20","2","11","3");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("------------------");
		
		Collections.sort(list,new Comparator<String>(){
			/**
			 * 对参数o1和o2比较大小
			 * o1大，正数
			 * o1小，负数
			 * 相同  	0
			 */
			@Override
			public int compare(String o1, String o2) {
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				//return a-b;
				if(a > b) {
					return 1;
				}else if(a < b) {
					return -1;
				}else{
					return 0;
				}
			}
			
		});
		System.out.println(list);
		
		System.out.println("------------------");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}

}
