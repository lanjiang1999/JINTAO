package day1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * <>泛型
		 * 限制集合中存放的数据类型
		 * 泛型和集合，不支持基本类型
		 */
		LinkedList<String> list = new LinkedList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("aaa");
		
		System.out.println("获取集合的大小"+list.size());			//数据的数量，元素数量
		System.out.println("输出整个集合"+list);
		System.out.println("访问下标0位置的数据"+list.get(0));			//访问0位置数据aaa
		System.out.println("获取最后一个元素"+list.get(list.size()-1));	//访问末尾位置数据
		System.out.println("移除下标为5的第五个数据"+list.remove(5));			//删除下标5位置的fff并返回fff
		System.out.println("输出整个集合"+list);
		System.out.println("删除第一个与aaa相等的数据"+list.remove("qqq"));	//删除第一个相等的数据 
																	//若数据存在则返回true，不存在返回false
		System.out.println("输出整个集合"+list);
		
		//双向链表，下标遍历效率低
		for(int i = 0;i < list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("\n---------------------");
		
		
		
		//双向链表，迭代器遍历效率高
		//新建迭代器对象
		Iterator<String> it = list.iterator();
		//当还有下一个
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
		}
		
		
		
		
		
	}

}
