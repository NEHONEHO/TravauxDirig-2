package exercice1td2;

public class Point {
	private char nom;
	private double abscisse;
	
	public Point(char nom, double abscisse) {
		this.nom = nom;
		this.abscisse = abscisse;
	}
	
	public void affiche() {
		System.out.println("nom du point est "+nom+"  son abscisse est "+abscisse);
	}
	
	public void translate(double translation) {
		abscisse += translation;
	}
	
	public static void main(String[] args) {
		Point pt = new Point('A',15);
		 System.out.println("les caractéristiques du point avant translation: ");
		 pt.affiche();
		 
		 pt.translate(2);
		 System.out.println("les caractéristiques du point après translation: ");
		 pt.affiche();
	}
}


