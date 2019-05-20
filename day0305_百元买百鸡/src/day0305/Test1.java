package day0305;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * 		百元买百鸡
		 * 		公鸡5元一只
		 * 		母鸡3元一只
		 * 		小鸡1元三只
		 * 
		 */
		//公鸡数量g从0到20
		for(int g = 0;g <= 20;g++){
			//买g只公鸡后，剩余的钱
			int money = 100-g*5;
			//money最大可以买多少只母鸡
			int max = money/3;
			//母鸡数量从0到max
			for(int m = 0;m <= max;m++){
				//money又买m只母鸡后
				//剩下的钱全部买小鸡
				int x = (money-3*m)*3;
				if(g+m+x==100){
					System.out.println("公鸡"+g+"只"+"母鸡"+m+"只"+"小鸡"+x+"只");
				}
			}
			
		}
	}

}
