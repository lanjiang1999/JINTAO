package day31010;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * �����û��������ݺ��·��жϸ����ж�����
		 * 1,3,5,7,8,10,12��31��
		 * 4,6,9,11��30��
		 * ����2��29��ƽ��2��28
		 * 
		 * 
		 */
	 Scanner sc = new Scanner(System.in);
	 System.out.println("���������");
	 long year = sc.nextLong();
	 
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("�������·�");
	 int month = sc.nextInt();
	 
	 switch(month){
	 case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		 System.out.println("31��");
		 break;
	 case 4:case 6:case 9:case 11:
		 System.out.println("30��");
		 break;
	 case 2:
		 if((year%4==0&&year%100!=0)||year%400==0){
			 System.out.println("29��");
		 }else{
			 
			 System.out.println("28��");
		 }
		 break;
		 default:
			 System.out.println("�·��������");
		 
	 
	 }
		
		
	}

}
