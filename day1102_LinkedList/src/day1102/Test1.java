package day1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * <>����
		 * ���Ƽ����д�ŵ���������
		 * ���ͺͼ��ϣ���֧�ֻ�������
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
		
		System.out.println("��ȡ���ϵĴ�С"+list.size());			//���ݵ�������Ԫ������
		System.out.println("�����������"+list);
		System.out.println("�����±�0λ�õ�����"+list.get(0));			//����0λ������aaa
		System.out.println("��ȡ���һ��Ԫ��"+list.get(list.size()-1));	//����ĩβλ������
		System.out.println("�Ƴ��±�Ϊ5�ĵ��������"+list.remove(5));			//ɾ���±�5λ�õ�fff������fff
		System.out.println("�����������"+list);
		System.out.println("ɾ����һ����aaa��ȵ�����"+list.remove("qqq"));	//ɾ����һ����ȵ����� 
																	//�����ݴ����򷵻�true�������ڷ���false
		System.out.println("�����������"+list);
		
		//˫���������±����Ч�ʵ�
		for(int i = 0;i < list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("\n---------------------");
		
		
		
		//˫������������������Ч�ʸ�
		//�½�����������
		Iterator<String> it = list.iterator();
		//��������һ��
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
		}
		
		
		
		
		
	}

}