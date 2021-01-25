package fr.algorithmie;
import java.util.Arrays;
import java.util.OptionalInt;

public class RechercheMax {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		OptionalInt max = Arrays.stream(array).max();
		System.out.print("La valeur max avec stream est : " + max.getAsInt());
		
		//ou avec for
		int max2 = array[0];
		for (int i = 1; i < array.length; i++){
		     if (array[i] > max2){
		    	 max2 = array[i];
		     }
		}
		System.out.print("\nLa valeur max avec for est : " + max2);
		
	}
}
