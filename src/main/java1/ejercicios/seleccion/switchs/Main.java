package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// El switch antes de la versión 1.7 solo funcionaba para byte, short, char e
		// int
		String opcion;

		do {
			
			System.out.println("1. Realizar Transferecia");
			System.out.println("2. Consultar Pagos");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese número de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
				break;
			default:
				System.out.println("No ha elegido ninguna opción valida");
				break;
			}

		} while (!opcion.equals("3")); // Similar a opción != 3
		System.out.println("Gracias por preferirnos");
	}

}
