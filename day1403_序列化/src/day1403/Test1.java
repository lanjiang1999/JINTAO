package day1403;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s = 
		 new Student(9527,"�Ʋ���","��",19);
		
		/*
		 * OOS--FOS--f2
		 */
		ObjectOutputStream out = 
		 new ObjectOutputStream(
		 new FileOutputStream("d:/abc/f2"));
		//���л����ѧ������
		out.writeObject(s);
		
		out.close();
		
	}
}



