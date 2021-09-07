package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//1. contains
		String frase="Programación de algoritmos módulo II";
		System.out.println("Ingrese el nombre del libro");
		String palabra = teclado.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("Continene la palabra: " + resultado);
		
		//2. equals
		System.out.println("-----------------------------------------------");
		String cadena1= "joel";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: " + resultado2);
		
		//3. y 4. Upper Lower 
		System.out.println("-----------------------------------------------");
		String nombre="Daniel";
		String nombreMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en Mayúscula: " + nombreMayuscula);
		
		String nombre2="VALERIA";
		String nombreMiniscula = nombre2.toLowerCase();
		System.out.println("Nombre en Mayúscula: " + nombreMiniscula);
		
		
		
	}

}
