package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiJi() {
		String[] a = new String []{"A","B","C","D","E","F","G","H","I",
							"J","K","L","M","N","O","P","Q","R",
							"S","T","U","V","W","X","Y","Z"};
		String  b = null;
		for(int i = 0;i < 5;i++) {
			int j = new Random().nextInt(26);
			b = b+a[i];
			
		}
		// TODO:�Ժ������
		return b;
	}

	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5�����ظ��Ĵ�д��ĸ");
		System.out.println("�����5����ĸ");
	}

	@Override
	public String biJiao(String c, String r) {
		// TODO:�Ժ������
		return "2A2B";
	}

	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
	

}
