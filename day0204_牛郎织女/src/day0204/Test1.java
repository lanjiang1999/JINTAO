package day0204;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("牛郎织女星相距16.4光年");
		System.out.println("光速 299792458米/秒");
		System.out.println("喜鹊身长0.46米");
		System.out.println("牛郎织女相会需要多少只喜鹊");
		
		//一光年十多少米
		long ly =  299792458L*60*60*24*365;
		
		//16.4光年是多少米
		double d = 16.4*ly;
		
		//求喜鹊数量
		double r = d/0.46;
		
		//向上取整
		//Math.ceil(r);
		//返回的取整结果是double类型
		//再转换成long类型
		long n = (long)Math.ceil(r);
		System.out.println(n);
		
	}

}
