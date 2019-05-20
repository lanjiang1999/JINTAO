package day0305;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 		百元买百鸡
		 * 		公鸡5元一只
		 * 		母鸡3元一只
		 * 		小鸡1元三只
		 * 
		 */
		//公鸡数量从0到20
		for(int g = 0;g <= 20;g++){
			//定义一个变量money存储 买完g只公鸡剩的钱  
			int money = 100-g*5;
			//定义一个变量max存储 money最多可以买多少只母鸡
			int max = money/3;
			for(int m = 0;m <= max;m++){
				//剩下所有的钱买小鸡
////				int x = (money-m*3)*3;
////				for(int x = 0;){
//					
//				}
			}
		}
	}
}
