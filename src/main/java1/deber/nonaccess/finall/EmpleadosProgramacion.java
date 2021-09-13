package deber.nonaccess.finall;

public class EmpleadosProgramacion extends EmpresaVideojuegos{

	public String programaUtilizar = "Udemy";
	public final String fechaEntregaJuego = "13/10/2023";
	
	public EmpleadosProgramacion() {
		
		//Se puede reasignar por que no es un atributo final
		programaUtilizar = "Python";
		
		//No se puede reasignar un valor a un atributo final
		fechaEntregaJuego = "20/10/2023";
	}
}
