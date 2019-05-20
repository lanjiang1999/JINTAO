package day031010;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		//循环:相同或相似的代码被反复重复执行
		int a = 1;
		while(a<10){
			System.out.println("吾问无为谓");
			a++;//若没有此步骤，将陷入死循环
		}
		
		
		int b = 1;
		while(b<10){
			if(b==4){
				break;
			}
			System.out.println(b);
			b++;
		}
		
		
		
		Scanner sc = new Scanner(System.in);//先执行，后判断
		int pw;
		do{
			System.out.println("请输入密码");
			pw = sc.nextInt();
		}while(pw!=123);//输入的pw若不等于123，则满足条件，循环继续
						//pw等于123时，条件不成立，循环停止
		
		
		
		
		
		
		
		
		
	}

}
