package exercice2td3;

public class PointNom extends Point{
	
	private char nom;
	
	public PointNom(int x, int y, char nom) {
		super(x,y);
		this.nom = nom;
	}
	
	public void setPointNom(int x, int y, char nom) {
		super.deplace(x - getx(), y - gety());
		this.nom = nom;
	}
	
	public void setNom(char nom) {
		this.nom = nom;
	}
	
	public void affCoordNom() {
		System.out.println(nom+" est de coodonnées: ("+getx()+","+gety()+")");
	}
}
