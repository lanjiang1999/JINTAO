package day031010;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		//多重分支 若满足第一个条件 其余则不会执行
		int a = 1;
		if(a<5){
			System.out.println("1");
		}else if(a==1){
			System.out.println("2");
		}else if(a>100){
			System.out.println("3");
		}else{
			System.out.println("6");
		}
		/**
		 * ctrl+z    撤销
		 * shift+回车 换行
		 * alt+方向键
		 */
		
		
		/**
		 * 练习：
		 * 用户输入分数：
		 * 分数在0-59之间提示“不及格”
		 * 分数在60-79之间提示“良好”
		 * 分数在80-100之间提示“优秀”
		 * 分数不在0-100之间提示“输入错误”
		 * 
		 * 
		 * 
		 */
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入分数");
			int score = sc.nextInt();
			
			String grade;
			if(score>=0&&score<=59){
				grade = "不及格";	
			}else if(score>=60&&score<=79){
				grade = "良好";
			}else if(score>=80&&score<=100){
				grade = "优秀";
			}else {
				grade = "输入错误";
			}
			System.out.println(grade);
			
			
			
		//	Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入分数");
			int score1 = sc.nextInt();
			
			if(score<0||score>100){
				System.out.println("输入错误");	
			}else if(score>=80){
				grade = "优秀";
			}else if(score>=60){
				grade = "良好";
			}else {
				System.out.println("不及格");
			}
				
			
			
			
			
			
			
			
			
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


