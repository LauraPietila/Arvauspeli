import java.util.Scanner;


public class GitArvaus {

	public static void main(String[] args) {
		// Arvaa nimi? 
		

		Scanner in = new Scanner(System.in);
		
		String vastaus = "";
		
		int kysymys =0;
		
		
		do
		{
		System.out.println ("Arvaa nimi? Kirjota stop, jos haluat lopettaa.");
		vastaus = in.nextLine();
		kysymys +=1;
		
		System.out.println (vastaus);
		
		if (vastaus.equals("Laura"))
		{
			System.out.println("Onnittelut, arvasit oikein!");
		}
		
		if (vastaus.equals("stop"))
		{
			kysymys -=1;
			System.out.println("Kiitos pelista!");
			break;
		}
		
		} while (!vastaus.equals("Laura"));

		{
			
			System.out.println ("Arvasit " + kysymys + " kertaa!");
		}
		
		
	}

}
