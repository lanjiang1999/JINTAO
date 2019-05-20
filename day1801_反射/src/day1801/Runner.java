package day1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;

/*
 * 执行器，根据config.txt的配置来执行
 */
public class Runner {
	static ArrayList<String> list = 
			new ArrayList<>();
	static {
		try {
			//用相对路径得到文件完整路径
			String path = 
				Runner.class
				.getResource("/config.txt")
				.getPath();
			path = URLDecoder.decode(path, "UTF-8");
			
			// BR--ISR--FIS--path
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
			 new FileInputStream(path),"GBK"));
			String line;
			while((line = in.readLine()) != null) {
				//"   		sdfsdf ; sdfs "
				//"sdfsdf;sdfs"
				line = line.replaceAll("\\s+", "");
				if(line.length() == 0) {
					continue;
				}
				list.add(line);
			}
			in.close();
		} catch (Exception e) {
			System.out.println("无法加载配置文件");
			e.printStackTrace();
		}
	}
	
	
	public static void launch() {
		try {
			for (String s : list) {
				// "day1801.B;b" --> ["day1801.B", "b"]
				String[] a = s.split(";");
				Class<?> c = Class.forName(a[0]);
				Object obj = c.newInstance();
				Method m = c.getMethod(a[1]);
				m.invoke(obj);
			}
		} catch (Exception e) {
			System.out.println("执行失败");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Runner.launch();
	}
}










