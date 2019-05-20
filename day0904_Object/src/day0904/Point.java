package day0904;

/**
 * @author 23648
 *
 */
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
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}

	public boolean equal(Object obj) {
		//参数的三种特殊情况
		if(obj == null) return false; 
		if(obj == this) return true;
		if(! (obj instanceof Point)) return false; 
		
		//把obj向下转回成point类型
		Point p = (Point) obj;
		return x == p.x &&
			   y == p.y;
	}
	
	
	}
	
	
	
	  


