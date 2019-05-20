package day1303;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		/**
		 * d:/abc/f1
		 * FOS--f1
		 */
		FileOutputStream out = new FileOutputStream("d:/abc/f1");
		out.write(97);// 00 00 00 61-->61    16进制
		out.write(98);// 00 00 00 62-->62
		out.write(99);// 00 00 00 63-->63
		out.write(356);// 00 00 01 64-->64
		
		byte[] a = {
			101,102,103,104,105,
			106,107,108,109,110
		};
		out.write(a);		//全部 10个
		out.write(a,3,4);	//下标3开始的4个
		
		out.close();		//释放系统资源
	}

}
