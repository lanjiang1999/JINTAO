package day1502;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * Unicodeת������������浽�ļ�
		 * OSW--FOS--f3��GBK
		 * OSW--FOS--f4��UTF-8
		 * 
		 * Unicode����������е������ַ���
		 * \u4e00��\u9fa5��20902������
		 */
		OutputStreamWriter out1 = 
		 new OutputStreamWriter(
	     new FileOutputStream("d:/abc/f3"), "GBK");
		OutputStreamWriter out2 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f4"), "UTF-8");
		
		out1.write("Unicode����������е������ַ���\n");
		out2.write("Unicode����������е������ַ���\n");
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







