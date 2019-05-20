package day1804;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class Test2 {
	@Test
	public void test1() throws Exception {
		Document doc =
			Jsoup
			.connect("https://list.jd.com/list.html?cat=9987,653,655")
			.get();
		
		Elements es = 
		 doc.select("#plist li.gl-item");
		
		for (Element e : es) {
			String title = 
			 e.select("div.p-name em").get(0).text();
			
			String url = 
			 e.select("div.p-name a")
			  .get(0)
			  .attr("href");
			
			System.out.println(title);
			System.out.println(url);
			System.out.println("\n");
		}
	}
}








