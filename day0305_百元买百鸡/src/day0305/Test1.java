package day0305;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * 		��Ԫ��ټ�
		 * 		����5Ԫһֻ
		 * 		ĸ��3Ԫһֻ
		 * 		С��1Ԫ��ֻ
		 * 
		 */
		//��������g��0��20
		for(int g = 0;g <= 20;g++){
			//��gֻ������ʣ���Ǯ
			int money = 100-g*5;
			//money�����������ֻĸ��
			int max = money/3;
			//ĸ��������0��max
			for(int m = 0;m <= max;m++){
				//money����mֻĸ����
				//ʣ�µ�Ǯȫ����С��
				int x = (money-3*m)*3;
				if(g+m+x==100){
					System.out.println("����"+g+"ֻ"+"ĸ��"+m+"ֻ"+"С��"+x+"ֻ");
				}
			}
			
		}
	}

}
