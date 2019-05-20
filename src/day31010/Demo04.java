package day31010;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 根据用户输入的年份和月份判断该月有多少天
		 * 1,3,5,7,8,10,12月31天
		 * 4,6,9,11月30天
		 * 闰年2月29，平年2月28
		 * 
		 * 
		 */
	 Scanner sc = new Scanner(System.in);
	 System.out.println("请输入年份");
	 long year = sc.nextLong();
	 
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("请输入月份");
	 int month = sc.nextInt();
	 
	 switch(month){
	 case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		 System.out.println("31天");
		 break;
	 case 4:case 6:case 9:case 11:
		 System.out.println("30天");
		 break;
	 case 2:
		 if((year%4==0&&year%100!=0)||year%400==0){
			 System.out.println("29天");
		 }else{
			 
			 System.out.println("28天");
		 }
		 break;
		 default:
			 System.out.println("月份输入错误");
		 
	 
	 }
		
		
	}

}
