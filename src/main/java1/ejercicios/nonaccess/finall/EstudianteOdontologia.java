package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{

	//No se puede sobreescribir un m�todo final del padre
	protected void realizarPracticas() {
		System.out.println("Realiza 100 horas de pr�ticas");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realiza 200 horas de pansant�as");
	}
}
