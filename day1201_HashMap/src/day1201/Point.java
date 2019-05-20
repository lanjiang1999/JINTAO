package day1201;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "("+x+","+y+")";
		
	}
	
	public int hashCode() {
		
		/**
		 * 用属性数据，计算产生哈希值
		 * 相同属性，哈希值必须相同
		 * 不同属性，哈希值尽量不同
		 * 
		 * 数学家发明了一种算法
		 * 是一种惯用的，有效算法
		 */
		int p = 31;
		int r = 1;
		r = r*p + x;
		r = r*p + y;
		return r;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(! (obj instanceof Point)) return false;
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}
	
}
