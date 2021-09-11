package ejercicios.nonaccess.finall;

public class EstudianteMedicina extends Estudiante{
	
	private String codigoMSP;

	protected final void realizarPracticas() {
		System.out.println("Realiza 50 horas de práticas");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de pansantías");
	}
}
