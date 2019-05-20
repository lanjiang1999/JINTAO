package day1102;

import java.util.Iterator;
import java.util.LinkedList;

import javax.naming.LinkLoopException;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction.LinkLogic;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * ���100��������
		 * �����±�����͵�����������Ч��
		 */
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0;i < 100000;i++) {
			list.add(i);		//list.add(Integer.valueOf)
		}
		
		System.out.println("��������"+list.size());
		
		System.out.println("\n----�±����----");
		long t = System.currentTimeMillis();
		f1(list);
		System.out.println(
				System.currentTimeMillis()-t);
		
		System.out.println("\n----��������----");
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
