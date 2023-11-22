
public class Temps {
	private int heures;
	private int minutes;
	private int secondes;
	
	public Temps() {}
	
	public Temps(int heures) {
		this.heures = heures;
	}
	
	public Temps(int heures, int minutes) {
		this.heures = heures ;
		this.minutes = minutes;
	}
	
	public Temps(int heures, int minutes, int secondes) {
		this.heures = heures ;
		this.minutes = minutes;
		this.secondes = secondes;
	}
	
	public Temps(Temps temps) {
		this.heures = temps.heures ;
		this.minutes = temps.minutes;
		this.secondes = temps.secondes;
	}
	
	public void setheures(int heures) {
		if(heures >= 0 && heures <= 23) {
			this.heures = heures;
		}
		else {
			System.out.println("l'heure doit être comprise entre 0 et 23");
		}
	}
	
	public int getheures() {
		return heures;
	}
	
	public void setminutes(int minutes) {
		if(minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		}
		else {
			System.out.println("les minutes doivent être comprise entre 0 et 59");
		}
	}
	
	public int getminutes() {
		return minutes;
	}
	
	public void setsecondes(int secondes) {
		if(secondes >= 0 && secondes <= 59) {
			this.secondes = secondes;
		}
		else {
			System.out.println("les secondes doivent être comprise entre 0 et 59");
		}
	}
	
	public int getsecondes() {
		return secondes;
	}
	
	public void ajouterHeures(int heures) {
		int newheure = this.heures + heures;
		this.heures = newheure % 24;
	}
	
	public void ajouterMinutes(int minutes) {
		int totalMinutes = this.heures * 60 + this.minutes + minutes;
        this.heures = (totalMinutes / 60) % 24;
        this.minutes = totalMinutes % 60;
	}
	
	public void ajouterSecondes(int secondes) {
		int totalSecondes = this.heures * 3600 + this.minutes * 60 + this.secondes + secondes;
        this.heures = (totalSecondes / 3600) % 24;
        this.minutes = (totalSecondes / 60) % 60;
        this.secondes = totalSecondes % 60;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", heures, minutes, secondes);
	}
	
	public static void main(String[] args) {
		Temps t1 = new Temps(15,30,18);
		
		System.out.println("temps avant ajout: "+t1);
		
		t1.ajouterHeures(5);
		t1.ajouterMinutes(90);
		t1.ajouterSecondes(100);
		
		System.out.println("temps après ajout: "+t1);
		
	}
	
	
	
	
	
}