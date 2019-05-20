package day1301;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import javax.management.RuntimeErrorException;


public class Test4 {

	public static void main(String[] args) {
		f();
	}

	private static void f() {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(
				list,
				"2018-11-16","2018-11-20","2018-11-16",
				"2018-11-1","2018-11-2","2018-11-10",
				"sadsadsadsa",
				"2018-11-30","2018-11-3");
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date d1 = sdf.parse(o1);
					Date d2 = sdf.parse(o2);
					return d1.compareTo(d2);
					
				} catch (ParseException e) {
					throw new RuntimeException(e);
				}
			}
		});
		System.out.println(list);
	}

}
