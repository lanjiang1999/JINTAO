package day1403;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * OIS--FIS--f2
		 */
		ObjectInputStream in = 
		 new ObjectInputStream(
	     new FileInputStream("d:/abc/f2"));
		//�����л�����ȡ�ָ�ѧ������
		Student s = (Student) in.readObject();
		
		in.close();
		System.out.println(s);
	}
}



