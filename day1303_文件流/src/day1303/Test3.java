package day1303;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = 
		 new FileInputStream("d:/abc/f1");
		
		//批量循环读取标准格式
		byte[] buff = new byte[5];
		int n;//保存每一批的数量
		while((n = in.read(buff)) != -1) {
			System.out.println(
			 n+"个： "+Arrays.toString(buff));
		}
		
		in.close();
	}
}





