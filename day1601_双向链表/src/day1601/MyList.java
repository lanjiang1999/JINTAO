package day1601;

public class MyList {
	private Node head;
	private Node tail;
	private int size;
	
	public void add(Object value) {
		if(head == null) {
			head = new Node();
			tail = head;
			head.value = value;
			head.prev = head;
			head.next = head;
		} else {
			Node n = new Node();
			n.value = value;
			n.prev = tail;
			tail.next = n;
			n.next = head;
			head.prev = n;
			tail = n;
		}
		size++;
	}
	
	public Object get(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException(   
				  String.valueOf(i));
		}
		if(i == 0) return head.value;
		if(i == size-1) return tail.value;
		
		Node n;
		if(i<size/2) {
			n = head;
			for(int j=1;j<=i;j++) {
				n = n.next;
			}
		} else {
			n = tail;
			for(int j=size-2;j>=i;j--) {
				n = n.prev;
			}
		}
		return n.value;
	}
	
	
	public int size() {
		return size;
	}
	
	private class Node {
		Object value;
		Node prev;
		Node next;
	}
	
}
