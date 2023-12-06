package exercice3td3;

public class Cercle extends Centre{
	
	public Cercle(int x, int y, char nom) {
		super(x, y, nom);
	}
	
	public void affNom() {
		System.out.println("Ce cercle est de nom "+getnom());
	}
	
	public void affiche() {
		System.out.println("Ce cercle est de nom "+getnom()+" sont centre est de coordonnées "+getx()+","+gety());
	}
}
