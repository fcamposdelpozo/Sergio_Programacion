package Ejemplo2_PersonaCompanero;

public class Companero extends Persona{
	private String telefono;
	private String apodo;
	
	public Companero() {}
	
	public Companero(String n, int e,String t,String mote) {
		super(n,e);
		telefono=t;
		apodo=mote;
	}
	
	public String getTelefono() {return telefono;}
	
	public void setTelefono(String t) {telefono=t;}
	
	public String getNombre() {
		System.out.println("El nombre en la clase padre es "+super.getNombre());
		System.out.println(super.toString());
		return apodo;
		
	}

}
