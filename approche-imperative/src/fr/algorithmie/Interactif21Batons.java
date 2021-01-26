package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
	
	static int jouer(int player, int battons) {
		
		Scanner scanner = new Scanner(System.in);
		if(player == 1) { //robot
			System.out.println("############### TOUR DU ROBOT ########################");
			if(battons == 2) {
				return 1;
			} else if(battons == 3) {
				return 2;
			} else if(battons == 4) {
				return 3;
			}
			Random r = new Random();
			int choixBattons = r.nextInt((3 - 1) + 1) + 1;
			System.out.println("## Le robot a pioché " +choixBattons +" baton(s).\n");
			return choixBattons;
			
		} else {
			System.out.println("############### VOTRE TOUR ########################");
			int choixBattons;
			do {
				choixBattons = scanner.nextInt();
				if(choixBattons < 1 || choixBattons > 3) {
					System.out.println("Merci de renseigner un nombre comprit entre 1 et 3.\n");
				}
			} while (choixBattons < 1 || choixBattons > 3);
			System.out.println("## Vous avez pioché " +choixBattons +" baton(s).\n");
			return choixBattons;
		}
	}

	
	
	public static void main(String[] args) {
		System.out.println("############### WELCOME TO THE 21 BATTONS GAME ########################");
		System.out.println("#######################################################################");
		System.out.println("#### A chaque tour vous devez prendre entre 1 et 3 battons ############");
		System.out.println("####### Celui qui pioche le dernier batton sera le perdant ############");
		System.out.println("#######################################################################\n");
		
		int battonLeft = 21;
		int nbTour = 0;
		
		//CHOIX de qui commence 
		Random r = new Random();
		int premierJoueur = r.nextInt((2 - 1) + 1) + 1; //SI 1 => ROBOT; SI 2 => JOUEUR
		System.out.println("Premier joueur : " +(premierJoueur == 1 ? "ROBOT" : "VOUS"));
		int deuxiemeJoueur = premierJoueur == 1 ? 2 : 1;
		
		do {
			nbTour++;
			System.out.println("####### IL RESTE "+battonLeft +" BATTON(S) ############");
			if(nbTour % 2 != 0) {
				battonLeft -= jouer(premierJoueur, battonLeft);
			} else {
				battonLeft -= jouer(deuxiemeJoueur, battonLeft);
			}
		} while (battonLeft >= 0);
		
		System.out.println("#########################################################");
		if(nbTour % 2 != 0) {
			System.out.println("############### VOUS AVEZ GAGNÉ !!! #################");
		} else {
			System.out.println("############### VOUS AVEZ PERDU #####################");
		}
		System.out.println("#########################################################");

	}
}
