package exercice2td3;

public class Main {
	
	public static void main(String[] args) {
		
		PointNom point = new PointNom(4,2,'A');
		point.affCoordNom();
		System.out.println("");
		
		//Modifiant les coordonnées et le nom du point
		System.out.println("changement des coordonnée et du nom");
		point.setPointNom(8, 6, 'B');
		point.affCoordNom();
		
		System.out.println("");
		
		//Modifiant le nom seulement
		System.out.println("changement du nom");
		point.setNom('C');
		point.affCoordNom();
		
		System.out.println("");
		
		//deplaçant le point
		System.out.println("point après deplacement:");
		point.deplace(5, 20);
		point.affCoordNom();
	}
}
