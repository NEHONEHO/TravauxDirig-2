package exercice4td3;

public class testBatiment {
	
	public static void main(String[] args) {
		
		Batiment batiment = new Batiment("bat 1 boulvard agricole");
		
		Maison maison = new Maison("Qrt Salam rue 102 num 15",4);
		
		Immeuble immeuble = new Immeuble("Qrt Mohammed V Grp 6 num 9", 6);
		
		System.out.println(batiment);
		System.out.println("");
		System.out.println(maison);
		System.out.println("");
		System.out.println(immeuble);
	}
}
