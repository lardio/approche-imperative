package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		System.out.println("Merci de renseigner un nombre.");
		int nb = scanner.nextInt();

		
		System.out.println("\nVoici les 10 chiffres suivants " +nb +"\n");
		for(int i =1; i <=10; i++) {
			System.out.println(i+nb);
		}
	}
}
