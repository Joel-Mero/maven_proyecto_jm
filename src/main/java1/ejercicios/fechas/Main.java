package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date(); //Deprecada y ya no se debería usar
		
		LocalDate diaHoy = LocalDate.now(); //Fecha actual 
		LocalDate fechaFin = diaHoy.plusDays(15);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(diaHoy);		
		curso1.setFechaFin(fechaFin);
		
		System.out.println("--Nombre--");
		System.out.println(curso1.getNombre());
		System.out.println("--Fecha Inicio--" );
		System.out.println(curso1.getFechaInicio());
		System.out.println("--Fecha Fin--");
		System.out.println(curso1.getFechaFin());
		System.out.println();
		
		LocalDate diaHoy2 = LocalDate.now(); //Fecha actual 
		LocalDate diaQueInicio = diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación principiantes");
		curso2.setFechaInicio(diaQueInicio);		
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("--Nombre--");
		System.out.println(curso2.getNombre());
		System.out.println("--Fecha Inicio--" );
		System.out.println(curso2.getFechaInicio());
		System.out.println("--Fecha Fin--");
		System.out.println(curso2.getFechaFin());
		System.out.println();
		
		// Fechas específicas
		
		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);
		
		// Ejercicios
		LocalDate fechaEspeciInicio = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciInicio);		
		curso3.setFechaFin(fechaEspeciFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("--Nombre--");
		System.out.println(curso3.getNombre());
		System.out.println("--Fecha Inicio--" );
		System.out.println(curso3.getFechaInicio());
		System.out.println("--Fecha Fin--");
		System.out.println(curso3.getFechaFin());
		System.out.println();
		
		
	}

}
