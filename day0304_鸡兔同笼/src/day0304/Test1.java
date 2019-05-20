package day0304;

public class Test1 {
	public static void main(String[] args) {
			//鸡			兔
			//1			34
			//2			33
			//...		...
			//35		0
		
		System.out.println("鸡兔共35只");
		System.out.println("共94只脚");
		System.out.println("鸡兔各多少只");

		for(int j = 0,t = 35;j <= 35;j++,t--){
			if(j*2+t*4==94){
				System.out.println("鸡"+j+"只,"+"兔"+t+"只");
			}
		}
		
	}

}
