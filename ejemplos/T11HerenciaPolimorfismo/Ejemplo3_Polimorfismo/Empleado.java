package Ejemplo3_Polimorfismo;

public class Empleado {
	private String nombre;
	private String nss;
	private double sueldo;
	private double impuestos;
	
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String nss, double sueldo, double impuestos) {
		super();
		this.nombre = nombre;
		this.nss = nss;
		this.sueldo = sueldo;
		this.impuestos = impuestos;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nss=" + nss + ", sueldo=" + sueldo + "]";
	}
	
	
	public double calcularSueldo() {
		return sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

}
