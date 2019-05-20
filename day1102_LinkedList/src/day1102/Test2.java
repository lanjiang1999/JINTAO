package day1102;

import java.util.Iterator;
import java.util.LinkedList;

import javax.naming.LinkLoopException;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction.LinkLogic;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 添加100万数据量
		 * 测试下标遍历和迭代器遍历的效率
		 */
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0;i < 100000;i++) {
			list.add(i);		//list.add(Integer.valueOf)
		}
		
		System.out.println("数据量："+list.size());
		
		System.out.println("\n----下标遍历----");
		long t = System.currentTimeMillis();
		f1(list);
		System.out.println(
				System.currentTimeMillis()-t);
		
		System.out.println("\n----迭代遍历----");
		t = System.currentTimeMillis();
		f2(list);
		System.out.println(
				System.currentTimeMillis()-t);
	}

	private static void f1(LinkedList<Integer> list) {
		for(int i = 0;i < list.size();i++) {
			list.get(i);
			
		}
		
	}

	private static void f2(LinkedList<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			it.next();
			
			
		}
	}

}
