package day1302;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		String path;
		//path = "D:\\BIJI.txt";//存在的文件
		path = "D:\\software";//存在的文件夹
		path = "x:\\ee\\gg";//不存在的路径
		
		File f = new File(path);
		System.out.println(f.length());//文件字节量，文件夹无效
		System.out.println(f.isFile());//是否为文件
		System.out.println(f.isDirectory());//是否为文件夹
		System.out.println(f.lastModified());//最后修改时间毫秒值
		System.out.println(f.exists());//是否存在
		System.out.println(f.getName());//获得文件名
		System.out.println(f.getParent());//获得父文件夹
		System.out.println(f.getAbsolutePath());//获得完整路径
		
	}

}
