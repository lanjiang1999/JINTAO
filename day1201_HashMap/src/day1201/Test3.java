 package day1201;

import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		Point a = new Point(1,3);
		Point b = new Point(1,3);
		//���������ϣֵ��ͬ
		//���ܱ�֤�������ͬ��λ��
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//��ʹ�������ͬλ�á�
		//equals()������ȣ����ܸ���
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		HashMap<Point, String> map = new HashMap<>();
		/*map.put(a, "2.9e");
		map.put(b, "3.1e");*/
		map.put(a, "aaa");
		map.put(b, "ccc");
		System.out.println(map);
	}

}