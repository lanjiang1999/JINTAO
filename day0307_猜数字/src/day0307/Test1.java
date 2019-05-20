package day0307;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//[1,1001)
		//1+[0,4)--->[1,5)
		int r = 1+ new Random().nextInt(1000);
		System.out.println(r);
		System.out.println("已经随即产生了一个[1,1001)范围的整数");
		System.out.println("猜这个数是几");

		while(true){
			//System.out.println("猜猜看吧");
			int c = new Scanner(System.in).nextInt();
			if(c >r){
				System.out.println("猜大了");
			}else if (c < r){
				System.out.println("猜小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
		
	}

}
