package day031010;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		//���ط�֧ �������һ������ �����򲻻�ִ��
		int a = 1;
		if(a<5){
			System.out.println("1");
		}else if(a==1){
			System.out.println("2");
		}else if(a>100){
			System.out.println("3");
		}else{
			System.out.println("6");
		}
		/**
		 * ctrl+z    ����
		 * shift+�س� ����
		 * alt+�����
		 */
		
		
		/**
		 * ��ϰ��
		 * �û����������
		 * ������0-59֮����ʾ��������
		 * ������60-79֮����ʾ�����á�
		 * ������80-100֮����ʾ�����㡱
		 * ��������0-100֮����ʾ���������
		 * 
		 * 
		 * 
		 */
			Scanner sc = new Scanner(System.in);
			System.out.println("���������");
			int score = sc.nextInt();
			
			String grade;
			if(score>=0&&score<=59){
				grade = "������";	
			}else if(score>=60&&score<=79){
				grade = "����";
			}else if(score>=80&&score<=100){
				grade = "����";
			}else {
				grade = "�������";
			}
			System.out.println(grade);
			
			
			
		//	Scanner sc1 = new Scanner(System.in);
			System.out.println("���������");
			int score1 = sc.nextInt();
			
			if(score<0||score>100){
				System.out.println("�������");	
			}else if(score>=80){
				grade = "����";
			}else if(score>=60){
				grade = "����";
			}else {
				System.out.println("������");
			}
				
			
			
			
			
			
			
			
			
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


