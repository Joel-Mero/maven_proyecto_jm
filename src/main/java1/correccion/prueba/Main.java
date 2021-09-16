package correccion.prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);

		System.out.println("-----SISTEMA BANCO PICHINCHA-----");
		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;

		do {
			System.out.println("Ingrese Clave");
			claveIngresada = teclado.nextLine();

			if (claveIngresada.equals("85DB")) { // SI
				do {
					System.out.println("-----MENÚ-----");
					System.out.println("1. Consultar Pagos");
					System.out.println("2. Realizar Transferencia");
					System.out.println("3. SALIR");
					opcionMenu = teclado.nextLine();

					if (opcionMenu.equals("1")) { // Todo lo que me pide la opción 1
						System.out.println("No tiene ningun pago pendiente");
					} else {
						if (opcionMenu.equals("2")) { // Todo lo que me pide la opción 2
							System.out.println("Ingrese la cuenta de destino:");
							String cuentaDestino = teclado.nextLine();
							System.out.println("Ingrese el monto a tranferir:");
							int montoTransferir = teclado1.nextInt();
							saldoInicial = saldoInicial - montoTransferir;
							System.out.println("Su nuevo saldo es:" + saldoInicial);
						}
					}

					// while (opcionMenu.equals("1") || opcionMenu.equals("2"));
				} while (!opcionMenu.equals("3"));
				claveIngresada = "0";
			} else { // NO
				System.out.println("La clave no es la correcta");
			}
			// claveIngresada = -1
		} while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
	}

}
