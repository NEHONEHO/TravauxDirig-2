package exercice3td3;

public class Main {
	public static void main(String[] args) {
		Centre centre = new Centre(0, 0,'A');
		Cercle cercle = new Cercle(0, 1, 'B');
		
		centre.affiche();
		centre.affNom();
		
		System.out.println("");
		
		cercle.affiche();
		cercle.affNom();
		
	}
}
