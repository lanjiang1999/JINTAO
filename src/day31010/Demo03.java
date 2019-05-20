package day31010;

public class Demo03 {

	public static void main(String[] args) {
		//多重分支（switch-case）
		int a = 8;
		switch(a){
		case 1:
			System.out.println("1");
			break;//用于终止
		case 2:
			if(a>1){
				System.out.println("2");
			}
			break;
		case 3:case 4:case 5://多个case输出同一个值
			System.out.println("3");
			break;
			default:
			System.out.println("4");
		}
		
		
		
		
		
		
		
	

}
}