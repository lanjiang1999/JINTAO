package day0302;

import java.math.MathContext;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("\n\n---break----");
		f1();
		System.out.println("\n\n---continue----");
		f2();
		
		
		
	}
	
	static void f1(){
		//������������� [0,1)
		//double d = Math.random();
		//System.out.println(d);
		// >0.999
		for(int i = 1; ;i++){
			double d = Math.random();
			if(d>0.999){
				System.out.println(i+"��: "+d);
				break;
				
			}
		}
		
	}
	
	
	
	static void f2(){
		//��ӡ1��100
		//����β��3,5,7��
		for(int i = 1;i <= 100;i++){
			int y = i%10;
			if(y == 3 || y == 5 || y == 7){
				//����ѭ����һ�ּ���ִ��
				//����i++
				continue;
			}
			System.out.println(i);
		}
		
	}
}
