package day1301;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("�û���:");
		String n = new Scanner(System.in).nextLine();
		System.out.println("����:");
		String p = new Scanner(System.in).nextLine();
		try {
			login(n,p);
			System.out.println("��ӭ��½");
		} catch (UsernameNotFoundException e) {
			System.out.println("�û�������");
		}catch (WrongPasswordException e) {
			System.out.println("�������");
		}
	}

	private static void login(String n, String p) throws UsernameNotFoundException, WrongPasswordException {
		//abc 123
		if(! "abc".equals(n)) {
			throw new UsernameNotFoundException();
		}
		if(! "123".equals(p)) {
			throw new WrongPasswordException();
			
		}
	}

}
