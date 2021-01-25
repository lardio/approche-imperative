package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};
		boolean lastFirst = (array.length > 0 && array[0] == array[array.length -1]);
		System.out.print(lastFirst);
	}

}
