package di2��_�ݹ�;

public class Digui_��ϰ2 {
	//		�ݹ����ָ�ڷ���ִ�й����г��ָ÷�������ĵ�������
	//		��Fibonaci���У�1��1��2��3��5��8��13...��40������ֵ��
	//		����������ƹ�ʽ��
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