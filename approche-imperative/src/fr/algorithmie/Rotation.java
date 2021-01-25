package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 1, 2, 3};
		int longueur = array.length;
		int[] arrayDroite = new int[4];
		
		for(int i = 0; i < longueur; i++) {
			if(i == longueur -1) {
				arrayDroite[0] = array[i];
			} else {
				arrayDroite[i + 1] = array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(arrayDroite[i]);
		}        
	}
}
