package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		int nb;
		do {
			System.out.println("Merci de renseigner un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb < 0 || nb > 10);
		
		System.out.println("\nVoici la table de multiplication de " +nb +" =>");
		for(int i =0; i <=10; i++) {
			System.out.println(i +" * " +nb +" = " +i*nb);
		}
	}
}
