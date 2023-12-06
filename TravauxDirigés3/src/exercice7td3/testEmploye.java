package exercice7td3;

public class testEmploye {
	public static void main(String[] args) {
		Patron patron = new Patron("Abdelouahid", "Hachim", 10000);
		TravailleurHoraire travailleur1 = new TravailleurHoraire("Arige", "Otmani", 7000);
		TravailleurCommission travailleur2 = new TravailleurCommission("khalil", "Achour", 7000, 2000);
		
		System.out.println(patron);
		System.out.print("Son gain: ");
		System.out.println(patron.gains());
		System.out.println("");
		
		System.out.println(travailleur1);
		System.out.print("Son gain: ");
		System.out.println(travailleur1.gains());
		System.out.println("");
		
		System.out.println(travailleur2);
		System.out.print("Son gain avec commission: ");
		System.out.println(travailleur2.gains());
	}
}
