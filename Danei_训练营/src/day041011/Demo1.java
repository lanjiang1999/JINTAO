package day041011;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 * 1.计算1000以内所有不能被7整除的整数之和
		 * 
		 * 2.一张纸的厚度是0.08mm，经过多少次的对折
		 * 能超过珠穆朗玛峰的高度（8848.13m）
		 * 
		 */
		int sum = 0;
		for(int i = 0;i <= 1000;i++){
			if(i%7!=0){
				sum = sum + i;
			}
		}
		System.out.println("sum="+sum);
		
		
		
		//第二题
		double a = 0.08;
		double b = 8848.13*1000;//转换为相同单位
		for(int i = 1;i>0;i++){
			a = a*2;
			if(a>b){
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
