package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//affichage tableau
		for(int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n########################");
		
		//affichage inverse tableau
		for(int b = array.length -1; b >= 0; b--) {
			System.out.print(array[b] + " ");
		}
		
		System.out.println("\n########################");
		int[] arrayCopy = array; 
			
	}

}
