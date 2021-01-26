package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int total = 0;
		int doublon = 0;
		for(int i = 0; i < array2.length; i++) {
			doublon = 0;
			for(int j = 0; j < array.length; j++) {
				if( array[j] == array2[i] ) {
					System.out.println("Occurence trouvée : " +array[j] );
					if(doublon == 0) {
						total++;
					}
					doublon++;
				}
				
			}
		}
		System.out.print("La nombre de valeurs égales entre les deux tableaux est de : " + total);
	}

}
