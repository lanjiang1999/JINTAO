package di2��_�ݹ�;

public class Digui_��ϰ1 {
	public static void main(String[] args) {
		System.out.println(method(3));
	}
	public static int method(int n) {
		if(n == 1)
			return 1;
		else 
			return n*method(n-1);
	}
}

