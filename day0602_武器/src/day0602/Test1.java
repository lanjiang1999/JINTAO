package day0602;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//�½�AK47����
		//���ڴ��ַ���浽����a
		 AK47 a = new AK47();
		 AK47 b = new AK47();
		 
		 System.out.println("���س�����");
		 System.out.println("����a��װ��aǹ");
		 System.out.println("����b��װ��bǹ");
		 
		 while(true){
			String s = new Scanner(System.in).nextLine();
			if(s.equals("a")) {
				a.load();
				continue;
				}else if(s.equals("b")) {
					b.load();
					continue;
				}
			System.out.println("aǹ����");
			a.fire();
			System.out.println("bǹ����");
			b.fire();
			System.out.println("-----------");
			
			
			
			 
		 }
	}

}
