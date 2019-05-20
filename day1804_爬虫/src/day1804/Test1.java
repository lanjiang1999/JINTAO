package day1804;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {
	@Test
	public void test1() throws Exception {
		String s = 
			Jsoup
			.connect("http://www.baidu.com")
			.execute()
			.body();
		
		System.out.println(s);
	}
	
	@Test
	public void test2() throws Exception {
		String s = 
		 Jsoup
		 .connect("https://item.jd.com/7437780.html")
		 .execute()
		 .body();
		
		System.out.println(s);
	}
	
	@Test
	public void test3() throws Exception {
		Document doc = 
			Jsoup
			.connect("https://item.jd.com/7437780.html")
			.get();
		
		Elements es = doc.select("div.sku-name");
		
		Element e = es.get(0);
		String title = e.text();
		System.out.println(title);
	}
	
	@Test
	public void test4() throws Exception {
		String s = 
			Jsoup
			.connect("https://p.3.cn/prices/mgets?skuIds=J_7437780")
			.ignoreContentType(true)
			.execute()
			.body();
		
		System.out.println(s);
		
		//解析 JSON 格式数据
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Map<String, String>> list = 
		 mapper.readValue(s, ArrayList.class);
		
		String price = list.get(0).get("p");
		System.out.println(price);
	}
}









