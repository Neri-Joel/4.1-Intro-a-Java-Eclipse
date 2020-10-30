MATpackage introduccion;
import java.util.Scanner;

public class IntroPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.println("Enter a study term");
		termvar = scanterm.nextLine();
		
		Scanner scandef = new Scanner(System.in);
		String termdef;
		System.out.println("Enter a definition");
		termdef = scandef.nextLine();
		
		System.out.println(termvar+ ": " + termdef);
			
	}

} 
