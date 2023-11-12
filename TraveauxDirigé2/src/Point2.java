
public class Point2 {
	private double abscisse;
	private double ordonné;
	
	public Point2() {
		this.abscisse = 5;
		this.ordonné = 10;
	}
	
	public Point2(double abscisse, double ordonné) {
		this.abscisse = abscisse;
		this.ordonné = ordonné;
	}
	
	public double getabscisse() {
		return abscisse;
	}
	
	public void setabscisse(double abscisse) {
		this.abscisse = abscisse ;
	}
	
	public double getordonné() {
		return ordonné;
	}
	
	public void setordonné(double ordonné) {
		this.ordonné = ordonné;
	}
	
	public double Norme() {
		return Math.sqrt(ordonné * ordonné + abscisse * abscisse);
	}
	
	public static void main(String[] args) {
		Point2 point = new Point2();
		point.setabscisse(10);
		point.setordonné(20);
		System.out.println("l'abscisse du point : "+point.getabscisse());
		System.out.println("l'ordonné  du point : "+point.getordonné());
	}
}
