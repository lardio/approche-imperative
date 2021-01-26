package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		System.out.println("Merci de renseigner un nombre.");
		int nb = scanner.nextInt();

		
		int sommeTotal = 0;
		for(int i =1; i <= nb; i++) {
			sommeTotal+= i;
		}
		System.out.println("\nVoici la somme de tous les chiffres entre 1 et " +nb +" : " + sommeTotal);
	}
	
}
