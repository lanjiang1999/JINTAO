package day1502;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * Unicode转换成其他编码存到文件
		 * OSW--FOS--f3，GBK
		 * OSW--FOS--f4，UTF-8
		 * 
		 * Unicode编码表中所有的中文字符：
		 * \u4e00到\u9fa5，20902个中文
		 */
		OutputStreamWriter out1 = 
		 new OutputStreamWriter(
	     new FileOutputStream("d:/abc/f3"), "GBK");
		OutputStreamWriter out2 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f4"), "UTF-8");
		
		out1.write("Unicode编码表中所有的中文字符：\n");
		out2.write("Unicode编码表中所有的中文字符：\n");
		int count = 0;
		for(char c='\u4e00';c<='\u9fa5';c++) {
			out1.write(c);
			out2.write(c);
			count++;
			if(count == 30) {
				out1.write('\n');
				out2.write('\n');
				count = 0;
			}
		}
		out1.close();
		out2.close();
	}

}







