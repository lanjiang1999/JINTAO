package day041011;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 * 1.����1000�������в��ܱ�7����������֮��
		 * 
		 * 2.һ��ֽ�ĺ����0.08mm���������ٴεĶ���
		 * �ܳ������������ĸ߶ȣ�8848.13m��
		 * 
		 */
		int sum = 0;
		for(int i = 0;i <= 1000;i++){
			if(i%7!=0){
				sum = sum + i;
			}
		}
		System.out.println("sum="+sum);
		
		
		
		//�ڶ���
		double a = 0.08;
		double b = 8848.13*1000;//ת��Ϊ��ͬ��λ
		for(int i = 1;i>0;i++){
			a = a*2;
			if(a>b){
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
