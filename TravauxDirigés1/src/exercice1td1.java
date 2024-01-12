import java.util.Scanner;

public class exercice1td1 {
	 public static void main(String[] args) {
	        System.out.println("Hello and welcome!");
	        System.out.println("donner trois elements :");
	        Scanner s = new Scanner(System.in);
	        int x= s.nextInt();
	        int y= s.nextInt();
	        int z= s.nextInt();
	        System.out.println("x="+x+ " y="+y+ " z="+z );
	        int max=x;
	        if (max<y){
	            max=y;
	        }
	        if (max<z){
	            max=z;
	        }
	        System.out.println("le max est = "+max);

	    }
}
