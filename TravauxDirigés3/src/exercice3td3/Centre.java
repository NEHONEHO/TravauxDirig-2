package exercice3td3;

public class Centre extends Point{
	
	private char nom;
	
	public Centre(int x, int y, char nom) {
		super(x,y);
		this.nom = nom;
	}
	
	public char getnom() {
		return nom;
	}
	
	public void affNom() {
		System.out.println("Ce centre est de nom "+nom);
	}
	
	public void affiche() {
		System.out.println("Ce centre est de nom "+nom+" de coordonnées "+getx()+","+gety());
	}
}
