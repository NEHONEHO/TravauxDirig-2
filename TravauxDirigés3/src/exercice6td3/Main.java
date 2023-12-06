package exercice6td3;

import exercice1td3.PointA;

public class Main {
	public static void main(String[] args) {
		Disque disque = new Disque(new PointA(5,2), 3,"disque1");
		Rectangle rectangle = new Rectangle(10, 15, "rectangle1");
		
		System.out.println(disque);
		afficheDisque(disque);
		
		System.out.println(rectangle);
		afficheRectangle(rectangle);
		
	}
	
	static void afficheDisque(Disque disque) {
		System.out.println("Perimetre = "+disque.getPerimeter()+"\n"+"Aire = "+disque.getAire());
	}
	
	static void afficheRectangle(Rectangle rectangle) {
		System.out.println("Perimetre = "+rectangle.getPerimeter()+"\n"+"Aire = "+rectangle.getAire());
	}
}
