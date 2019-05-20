package di2章_递归;

public class Digui_练习2 {
	//		递归调用指在方法执行过程中出现该方法本身的调用例如
	//		求Fibonaci数列：1，1，2，3，5，8，13...第40个数的值。
	//		数列满足递推公式：
	//		F1 = 1,F2 = 1   Fn=Fn-1+Fn-2(n>2)
	public static void main(String[] args) {
		System.out.println(f(10));		
	}
	
	public static int f(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
	} 

}