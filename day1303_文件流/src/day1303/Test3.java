package day1303;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = 
		 new FileInputStream("d:/abc/f1");
		
		//����ѭ����ȡ��׼��ʽ
		byte[] buff = new byte[5];
		int n;//����ÿһ��������
		while((n = in.read(buff)) != -1) {
			System.out.println(
			 n+"���� "+Arrays.toString(buff));
		}
		
		in.close();
	}
}





