package deber.nonaccess.finall;

public final class EmpleadosColoreo extends EmpleadosDibujos{

	//No se puede sobreescribir un método final del padre
	protected void Dibujar() {
		System.out.println("Realizar los dibujos de personajes y escenarios");
	}
	
	//Puede sobreescribir sin un método final
	protected void Revisar() {
		System.out.println("Revisar cada dibujo a detalle");
	}
}
