package fr.algorithmie;
import java.util.stream.IntStream;

public class InverstionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy = IntStream.range(0, array.length).map(i -> array[array.length-i-1]).toArray(); //tableau inversé
		int[][] arrays = {array, arrayCopy}; //array d'array
		
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[i].length ; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println("\n########################");
		}
	}
}