package exercice1td3;

public class PointA extends Point{

	public PointA(int x, int y) {
		super(x, y);
	}
	
	public void affiche() {
		System.out.println("les coordonnées de ce point sont: ("+getx()+","+gety()+")");
	}
}
