package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		int nb;
		int[] listeNombres = new int[10];

		
		for(int i = 0; i < listeNombres.length; i++) {
			System.out.println("Merci de renseigner un nombre - Encore " + (listeNombres.length - i) +" nombres a renseigner.");
			nb = scanner.nextInt();
			listeNombres[i] = nb;
		}
		
		int max = listeNombres[0];
		for (int i = 1; i < listeNombres.length; i++){
		     if (listeNombres[i] > max){
		    	 max = listeNombres[i];
		     }
		}
		System.out.print("\nLe nombre le plus grand que vous avez donné est : " + max);

	}
}
