package exercice3td3;

public class Point {
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void affCoord() {
		System.out.println("Coordonnées: "+x+","+y);
	}
	
	public void affiche() {
		System.out.println("Coordonnées: "+x+","+y);
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
}
