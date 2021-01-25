package fr.algorithmie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		//fonction pas avec array car on doit définir une taille déjà définie lors de la creation
		List<Integer> nombrePair = new ArrayList<Integer>();
		List<Integer> superieurDeTrois = new ArrayList<Integer>();
		List<Integer> nombreImpair = new ArrayList<Integer>();
		List<Integer> indexPair = new ArrayList<Integer>();

		List<?>[] listeArrays = new List<?>[]{nombrePair, superieurDeTrois, nombreImpair, indexPair};
 		String[] titre = {"Nombres pair", "Superieur de trois", "Nombres impair", "Valeurs des index pair"};
	
		// Assignation des valeurs aux tableaux
		for(int i = 0; i < array.length; i++) {
			//Si supérieur à trois
			if(array[i] > 3) {
				superieurDeTrois.add(array[i]);
			}
			
			//Si nombre pair ou impair
			if(array[i] % 2 == 0) {
				nombrePair.add(array[i]);
			} else {
				nombreImpair.add(array[i]);
			}
			//Si index pair
			if(i % 2 == 0) {
				indexPair.add(array[i]);
			}
		}
		
		//Affichage des tableaux
		for(int i = 0; i < listeArrays.length; i++) {
			System.out.println("\n############# " +titre[i] +" ##############");
			System.out.print(listeArrays[i]);
			//for(int j = 0; j < listeArrays[i].size(); j++) {
				//System.out.print(" " +listeArrays[i].get(j));
			//}
		}
	}
}
