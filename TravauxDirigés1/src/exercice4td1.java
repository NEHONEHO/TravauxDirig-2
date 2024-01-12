import java.util.Scanner;

public class exercice4td1 {
	 public static void main(String[] args){
	        System.out.println("donner la moyenne\n");
	        Scanner s= new Scanner(System.in);
	        int m=s.nextInt();
	        if (m>=16){
	            System.out.println("T.bien");
	        }
	        else if (m>=14){
	            System.out.println("bien");
	        }
	        else if (m>=12) {
	            System.out.println("A.bien");
	        }
	        else if (m>=10) {
	            System.out.println("Passable");
	        }

	    }
}
