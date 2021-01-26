package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] tableau = new int[2];
		int menu = 2;
		int ajouterNombre = 1;
		int choix;
		int nombre;
		int nbAjouts = 0;
		
		while (true) {
			do {
				System.out.println("\n\n###########################");
				System.out.println("Que voulez-vous faire ?\n1 - Ajouter un nombre. \n2 - Voir les nombres");
				choix = scanner.nextInt();
				if(choix != menu && choix != ajouterNombre) {
					System.out.println("L'entrée n'est pas reconnue, merci de rentrer un nombre valide pour votre choix.");
				}
			} while (choix != menu && choix != ajouterNombre);
			
			if(choix == 2) {
				
				System.out.println("Voici tous les nombres : ");
				for(int b = 0; b < nbAjouts; b++) {
					System.out.print(tableau[b] + " ");
				}
			}
			
			if(choix == 1) {
				if(nbAjouts == tableau.length) {
					tableau = Arrays.copyOf(tableau, tableau.length * 2);
					System.out.println("Nous avons doublé la taille du tableau par soucis de manque de place.");
				}
				System.out.println("Merci de renseigner un nombre : ");
				nombre = scanner.nextInt();
				nbAjouts++;
				tableau[nbAjouts -1] = nombre;
				System.out.println("Le nombre "+nombre +" a bien été ajouté.");
			}	
		}
	}	
}
