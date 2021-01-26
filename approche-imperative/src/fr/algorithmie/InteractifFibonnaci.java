package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Merci de renseigner le rang du nombre de la suite Fibonnaci souhaité :");
		
		int nb;
		int rang = 2;
		int somme;
		int previous;
		int[] fibo = {1, 0};
		
		do {
			nb = scanner.nextInt();
			if(nb < 1) {
				System.out.println("Rang incorrect merci de renseigner un nombre positif.");
			}
		} while (nb < 1);
		
		if(nb < 3) {
			if(nb == 1) {
				System.out.println("Le rang 1 de la suite Fibonnaci correspond au nombre 0.");
			}else{
				System.out.println("Le rang 2 de la suite Fibonnaci correspond au nombre 1.");
			}
			
		} else {
			do {
				somme = fibo[0] + fibo[1];
				previous = fibo[0];
				fibo[0] = somme;
				fibo[1] = previous;
				rang++;
			} while(rang < nb);
			System.out.println("Le rang "+nb +" de la suite Fibonnaci correspond au nombre " +somme +".");	
		}
			
	}
}
