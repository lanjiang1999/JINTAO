package day0401;

import java.util.Scanner;

public class Test1 {
		static String[] names = {"��xs","��ΪMate20","��ҫMagic2","С��Mix3","Vivo NEX"};
		static double[] price = {7777,6666,5555,4444,3333};
		static int [] numbers = {10,20,30,40,50};
		
	public static void main(String[] args) {
		/**
		 * -------------
		 * 1.��Ʒ�б�
		 * 2.��Ʒ¼��
		 * 3.��Ʒ��ѯ
		 * 4.ͳ����Ϣ
		 * 5.�˳�
		 */	
		outer:		//ѭ������
		while(true){
			menu();
			int c = new Scanner(System.in).nextInt();
			
			switch(c){
			case 1: f1();break;
			case 2: f2();break;
			case 3: f3();break;
			case 4: f4();break;
			case 5: break outer;  //�ж����ֽ�outer��ѭ��
				
			
			}
			
		}
	}

	private static void menu() {
		System.out.println("-------------");
		System.out.println("1.��Ʒ�б�");
		System.out.println("2.��Ʒ¼��");
		System.out.println("3.��Ʒ��ѯ");
		System.out.println("4.ͳ����Ϣ");
		System.out.println("5.�˳�");
		System.out.println("-------------");
		System.out.println("ѡ��");
	}
	//1.��Ʒ�б�
	private static void f1() {
		/**
		 * 
		 */
		for(int i = 0;i <names.length;i ++){
			String n = names[i];
			double p = price[i];
			int  b = numbers[i];
			System.out.println(
			(i+1)+".����: "+n+",�۸�"+p+", ����: "+b);
		}
	}
	//2.��Ʒ¼��
	private static void f2() {
		 for(int i = 0;i < names.length;i++){
			 System.out.println("¼���"+(i+1)+"����Ʒ");
			 System.out.print("����:");
			 String n = new Scanner(System.in).nextLine();
			 System.out.print("�۸�:");
			 double p = new Scanner(System.in).nextDouble();
			 System.out.print("����:");
			 int b = new Scanner(System.in).nextInt();
			 names[i] = n;
			 price[i] = p;
			 numbers[i] = b;
		 }
		 //������ʾ�б�
		 f1();
	}
	//3.��Ʒ��ѯ
	private static void f3() {
		System.out.println("�����ѯ����Ʒ����");
		String t = new Scanner(System.in).nextLine();
		for(int i = 0;i < names.length;i++){
			//t��names[i]�Ƿ����
			//�Ƚ��ַ����Ƿ���ȣ���equals()����
			if(t.equals(names[i])){
				String n = names[i];
				double p = price[i];
				int b = numbers[i];
				System.out.println(
				(i+1)+".����: "+n+",�۸�"+p+", ����: "+b	);
				return;
			}
		}
		System.out.println("�Ҳ�������Ʒ");

	}
	//4.ͳ����Ϣ
	private static void f4() {
		/**
		 * 	��Ʒ�ܼ�
		 * 	���۾���
		 * 	����ܼ�
		 * 	��ߵ���
		 */
		double spzj = 0;//��Ʒ�ܼ�
		double djzj = 0;//�����ܼ�
		double zgzj = 0;//����ܼ�
		double zgdj = 0;//��ߵ���
		
		for(int i = 0;i < names.length;i++) {
			spzj += price[i]*numbers[i];
			djzj += price[i];
			if(price[i]*numbers[i] > zgzj){
				zgzj = price[i]*numbers[i];
			}
			if(price[i] > zgdj){
				zgdj = price[i];
			}	
		}
		System.out.println("��Ʒ�ܼ�"+spzj);
		System.out.println("���۾���"+(djzj/names.length));
		System.out.println("����ܼ�"+zgzj);
		System.out.println("��ߵ���"+zgdj);
		
		
	}

}
