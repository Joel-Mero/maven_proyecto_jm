package deber.ordenamiento.vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends Paciente{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in); 
		
		int N = 0;
		
		do {
			System.out.println("-----MENÚ-----");
			System.out.println("1. Registrar Paciente");
			System.out.println("2. Imprimir Reporte");
			System.out.println("3. SALIR");
			N = teclado.nextInt();
	
			if (N == 1) {
				System.out.println("Ingresar Nombre Paciente");
				String M = teclado1.nextLine();
				System.out.println("Ingresar Apellido Paciente");
				String A = teclado1.nextLine();
				System.out.println("Ingresar Edad Paciente");
				int E = teclado.nextInt();
				System.out.println("Ingresar Síntoma Paciente");
				String S = teclado1.nextLine();	
				
				Paciente paciente1 = new Paciente();
				paciente1.setNombre("Danna");
				paciente1.setApellido("Morales");
				paciente1.setEdad(23);
				paciente1.setSintoma("Dolor de pie");	
				
				Paciente paciente2 = new Paciente();
				paciente2.setNombre("Juan");
				paciente2.setApellido("Maldonado");
				paciente2.setEdad(34);
				paciente2.setSintoma("Dolor de Cabeza");
				
				Paciente paciente3 = new Paciente();
				paciente3.setNombre("Daniel");
				paciente3.setApellido("Terán");
				paciente3.setEdad(30);
				paciente3.setSintoma("Dolor de cuello");
				
				Paciente listaPaciente[] = new Paciente[3];
				listaPaciente[0] = paciente1;
				listaPaciente[1] = paciente2;
				listaPaciente[2] = paciente3;				
				
			}else if (N == 2){
				System.out.println("Pacientes antes de ordenar");
				System.out.println(Arrays.toString(listaPaciente));
				
				Arrays.sort(listaPaciente);
				System.out.println("Estudiantes despues de ordenar");
				System.out.println(Arrays.toString(listaPaciente));
			}
	
		}while (N != 3);
	
	}

}
