import java.util.Scanner;
public class GitArvaus {

	public static void main(String[] args) {
		// Arvaa nimi? 

		Scanner in = new Scanner(System.in);
		
		String vastaus = "";
		String nimi;
		
		do
		{
		System.out.println ("Arvaa nimi?");
		vastaus = in.nextLine();
		nimi = vastaus;
		System.out.println (nimi);
		
		} while (!nimi.equals("Laura"));
		{
			System.out.println ("Onnittelut, arvasit oikein!");
		}
		
	}

}
