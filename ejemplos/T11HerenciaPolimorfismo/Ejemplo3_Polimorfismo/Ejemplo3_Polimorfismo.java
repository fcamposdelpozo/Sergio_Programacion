package Ejemplo3_Polimorfismo;

public class Ejemplo3_Polimorfismo {

	public static void main(String[] args) {
		Empleado trabajador1;
		Empleado consultor1;
		Empleado comercial1;
		
		trabajador1 = new Empleado("Pedor Lopez" ,"3939949493S",1680.5,18.0);
		consultor1 = new Consultor("Laura Garcia","382720284SS",2200.5,24.0,25,85.1);
		comercial1 = new Comercial("Luis Perez"  ,"555550284SS",1800.5,19.0,18560421,1);
		
		saludar(trabajador1);
		mostrarNombreYPaga(trabajador1);
		System.out.println();

		saludar(consultor1);
		mostrarNombreYPaga(consultor1);
		System.out.println();

		saludar(comercial1);
		mostrarNombreYPaga(comercial1);
		System.out.println();
		
	}
	
	public static void saludar(Empleado e) {
		System.out.println("Buenos dias sr./sra "+ e.getNombre());
	}
	
	public static void mostrarNombreYPaga(Empleado e) {
		System.out.printf("El sueldo base del emplead@ %s es %.2f, sus impuestos %.2f y su sueldo final es %.2f%n",e.getNombre(),e.getSueldo()
			,(e.getSueldo()*e.getImpuestos()/100),e.calcularSueldo());
		
	}

}
