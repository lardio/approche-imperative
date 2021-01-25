package fr.algorithmie;
import java.util.Arrays;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[][] arrays = {array, array2}; //array d'array
		
		int max = 0;
		for(int i = 0; i < arrays.length; i++) {
			max += Arrays.stream(arrays[i]).sum();
		}
		System.out.print("La valeur des deux tableaux avec stream est : " + max);
		
		//ou avec for
		int max2 = 0;
		for(int i = 0; i < arrays.length; i++) {
		    for (int value : arrays[i]) {
		    	max2 += value;
		    }
		}
		System.out.print("\nLa valeur des deux tableaux avec for est : " + max2);
		
	}

}
