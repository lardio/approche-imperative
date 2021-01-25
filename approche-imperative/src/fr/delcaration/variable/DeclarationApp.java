package fr.delcaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		int nombre = 5;
		int nombre2;
		nombre2=nombre++;
		System.out.println(nombre2); //5
		System.out.println(nombre); //6
	}
}
