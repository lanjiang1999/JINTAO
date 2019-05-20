package day1201;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Test1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(9527, "唐伯虎");
		map.put(9528, "秋香");
		map.put(9529, "马化腾");
		map.put(9530, "凤姐");
		map.put(9531, "Alan Waker");
		map.put(9532, "飞科");
		map.put(9532, "FAKER");
		map.put(9534, "大魔王");
		map.put(9535, "shit");
		map.put(9536, "null");
		map.put(null, "---");
		System.out.println("大小"+map.size());
		System.out.println("输出整个map"+map);
		System.out.println(map.remove(9527));
		System.out.println(map.get(9527));
		System.out.println(map.get(9600));
		System.out.println(map.remove(9530));
		
		
		System.out.println("\n--------------");
		Set<Integer> keys = map.keySet();
		for ( Iterator<Integer> it = keys.iterator(); it.hasNext(); ) {
			Integer k = it.next();
			String v = map.get(k);
			System.out.println(k+" : " + v);
			
		}
		
		
	}

}
