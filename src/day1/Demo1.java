package day1;

public class Demo1 {

	public static void main(String[] args) {

		/*
		 * ����������� ��+����-����*����/�� ȡģ���㣨%�� ������++���Լ���--���Բ��������мӻ��1
		 * 
		 */
		System.out.println(8 % 3);// ȡ��
		// ǰ�������������ȸı��ʹ��
		// ����������������ʹ���ٸı�
		int a = 2;
		a--;// ����ʹ��д��ǰ��û������
		System.out.println("a=" + a);

		int c1 = 4, c2 = 6;
		int d1 = c1--;
		int d2 = ++c2;
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);

		int x = 10, y = 20;
		int x1 = x++;// x1 = 10,x=11
		int y1 = --y;// y1 = 19,y=19
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("x1=" + x1);
		System.out.println("y1=" + y1);

		int i = 5;
		System.out.println("i=" + i++);// �����i=5��i����Ϊ6
		System.out.println("i=" + i);// ��ʱ���iΪ6

		System.out.println("i=" + i++);// �����

			for(int u = 1;u<=9;u++) {
				for(int k = 1;k<=u;k++) {
					
					System.out.print(" "+k+"*"+u+"="+u*k);
				}
				System.out.println();
			}
			
	}

}
