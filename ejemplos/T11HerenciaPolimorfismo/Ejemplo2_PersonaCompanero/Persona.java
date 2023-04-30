package Ejemplo2_PersonaCompanero;

public class Persona {
	protected String nombre;
	protected int edad;
	
	Persona(){}
	
	Persona(String n, int e){
		nombre=n;
		edad=e;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
    @Override
	public String toString() {
	    return "Nombre: "+nombre+" Edad: "+ edad;
	}
}
