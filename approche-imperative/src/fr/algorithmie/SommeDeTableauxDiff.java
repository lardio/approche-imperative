package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		int[][] arrays = {array, array2}; //array d'array
		int[] somme = new int[2];
		
		for(int i = 0; i < arrays.length; i++) {
			somme[i] = Arrays.stream(arrays[i]).sum();
		}
		int diff = somme[0] - somme[1];
		System.out.print("La diff entre les deux tableaux avec stream est : " + diff);
		
		//ou avec for
		for(int i = 0; i < arrays.length; i++) {
			int max2 = 0;
		    for (int value : arrays[i]) {
		    	max2 += value;
		    }
		}
		int diff2 = somme[0] - somme[1];
		System.out.print("\nLa diff entre les deux tableauxavec for est : " + diff2);

	}

}
