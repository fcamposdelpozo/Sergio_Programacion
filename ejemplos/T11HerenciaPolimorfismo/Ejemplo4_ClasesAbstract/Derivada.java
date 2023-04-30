package Ejemplo4_ClasesAbstract;

public class Derivada extends ClaseAbstracta1 {
	
	public Derivada() {}
	
	public Derivada(String n) {
		super.nombrePersona=n;
	}

	@Override
	public void saludar() {
		System.out.println("Hola que tal estas "+nombrePersona);
		
	}

}
