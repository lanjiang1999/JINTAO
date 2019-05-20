package day031010;
public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 变量作用域：从申明开始到包含它最近的大括号
		 * 
		 * 
		 */
		int a = 1;
		if(a<10){
			int b = 2;
			System.out.println(a);
			System.out.println(b);
			
		}
		System.out.println(a);
//		System.out.println(b);
	
	//同名：当作用域重叠时不能同名
	
		int x = 1;
		if(x<10){
//			int x = 2;
			int y = 3;
		}else{
			int y = 4;
		}
		
		
	
	
	}
}
