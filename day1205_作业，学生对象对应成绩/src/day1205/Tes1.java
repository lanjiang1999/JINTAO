package day1205;

import java.util.HashMap;

public class Tes1 {
	public static void main(String[] args) {
		Student a = new Student(1,18,"张三","男");
		Student b = new Student(1,18,"张三","男");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.equals(b));
		HashMap<Student, String> map = new HashMap<>();
		map.put(a, "100分");
		map.put(a, "200分");
		System.out.println(map);
		
		
	}

}
