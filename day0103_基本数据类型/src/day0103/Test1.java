package day0103;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 定义八个变量abcdefgh
		 * 分别保存四种整数的最小指，最大值
		 */
		byte a = -128;
		byte b = 127;
		/**
		 * jdk类库中的Short 类
		 * Short类中，定义了常量MIN_VALUE
		 * 保存着short类型的最小值
		 */
		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;
		
		int e =Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;

		Long g = Long.MIN_VALUE;
		Long h = Long.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);


	}
}


