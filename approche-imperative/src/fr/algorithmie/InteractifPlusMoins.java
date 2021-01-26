package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		double nbMystere = r.nextInt((100 - 1) + 1) + 1;
		System.out.println("Nombre a deviner : " +nbMystere);
		
		int tour = 0;
		int guess;
		
		System.out.println("Vous devez essayer de deviner le nombre correct !");
		
		do {
			guess = scanner.nextInt();
			tour++;
			if(guess > nbMystere) {
				System.out.println("Loupé ! C'est un nombre plus bas.");
			} else if(guess < nbMystere){
				System.out.println("Loupé ! C'est un nombre plus haut.");
			}
			
		} while (guess != nbMystere);
		
		System.out.println("Bravo, vous avez trouvé en " +tour +" coups.");

	}	
	
}
