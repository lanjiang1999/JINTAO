package day1602;

public class Stack {
	private char[] a = new char[5];
	private int index;
	
	public void push(char c) {
		if(isFull()) {
			return;
		}
		a[index] = c;
		index++;
	}
	public char pop() {
		if(isEmpty()) {
			return ' ';//用空格表示没有数据
		}
		index--;
		char c = a[index];
		return c;
	}
	public boolean isEmpty() {
		return index==0;
	}
	public boolean isFull() {
		return index==5;
	}
}




