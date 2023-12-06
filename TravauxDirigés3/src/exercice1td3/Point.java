package exercice1td3;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public int getx() {
		return x;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public int gety() {
		return y;
	}
	
	public void sety(int y) {
		this.y = y;
	}
}
