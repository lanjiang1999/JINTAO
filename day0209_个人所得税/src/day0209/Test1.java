package day0209;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("����");
		double s = new Scanner(System.in).nextDouble();
		//�ѹ���s��ֵ�����ݵ�f�����������м���
		f(s);
	}
	
	static void f(double salary){
		//���salaryû�е������㣬����˰
		if(salary <= 3500){
			System.out.println("����Ҫ��˰");
			//���ص�����λ�ü���
			return;
		}
		//salary��ȥ3500
		salary -= 3500;
		//����˰�ʺ�����۳�������
		double r = 0;
		int k = 0;
		if(salary <= 1500){
			r = 0.03;
			k = 0;
		}else if(salary <= 4500){
			r = 0.1;
			k = 105;
		}else if(salary <= 9000){
			r = 0.2;
			k = 555;
		}else if(salary <= 35000){
			r = 0.25;
			k = 1005;
		}else if(salary <= 55000){
			r = 0.3;
			k = 2755;
		}else if(salary <= 80000 ){
			r = 0.35;
			k = 5505;
		}else{
			r = 0.45;
			k = 13505;
		}
		
		double tax = salary*r-k;
		System.out.println("��������˰��"+tax);
		
		
	}

}
