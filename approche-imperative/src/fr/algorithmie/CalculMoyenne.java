package fr.algorithmie;
import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		OptionalDouble max = Arrays.stream(array).average();
		System.out.print("La moyenne avec stream est : " + max.getAsDouble());
		
		//ou avec for
		double sum = 0;
		for (int value : array) {
	        sum += value;
	    }
		double moyenne = sum / array.length;
		System.out.print("\nLa moyenne avec for est : " + moyenne);
		
	}

}
