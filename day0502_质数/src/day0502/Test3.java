package day0502;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("��������n����n������������");
		int n = new Scanner(System.in).nextInt();
		int count = f(n);
		System.out.println(count);
	}

	private static int f(int n) {
		if(n == 2){
			return 1;
		}
		if(n < 2){
			return 0;
		}
		//������������һ����֪������
		int count = 1;
		//��3��nѰ������
		outer:
		for(int i = 3;i <= n;i++){					//n = 7   count = 4
			//�ж�i�ǲ�������
			//i����+1
			double max = Math.sqrt(i)+1;
			//��2��max��Χ�����ܰ�i������ֵ
			for(int j = 2;j < max;j++){
				if(i % j == 0){ //i��������
					continue outer;
				}
			}
			count ++;
			
		}

		return count;
	}

}
