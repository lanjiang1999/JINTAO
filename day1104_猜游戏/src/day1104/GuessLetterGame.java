package day1104;

import java.util.Arrays;
import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiJi() {
		StringBuilder sb = new StringBuilder("ABCDEFGHJKLMNOPQRSTUVWXYZ");
		for(int i = 0;i < 5;i++) {
		int j = new Random().nextInt(26);
		char t = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, t);
		}
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();
	}

	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5�����ظ��Ĵ�д��ĸ");
		System.out.println("�����5����ĸ");
	}

	@Override
	public String biJiao(String c, String r) {
		//������������
		int a = 0;
		int b = 0;
		for(int i = 0;i < 5;i++) {			//����c�ַ���
			for(int j = 0;j < 5;j++) {		//����r�ַ���
				//�Ƚ�iλ���ַ���jλ���ַ�
				if(c.charAt(i) == r.charAt(j)) {
					if(i == j) {		//�Ƚ�i��j�±�
						a++;
					}else {
						b++;
					}
					break;
				}
				
				
			}
			
		}
		return a+"A"+b+"B";
	}

	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
	

}
