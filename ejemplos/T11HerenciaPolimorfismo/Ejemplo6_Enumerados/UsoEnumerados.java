package Ejemplo6_Enumerados;

public class UsoEnumerados {
	
	public static void main(String[] args) {
		Talla t=Talla.PEQUENA;
		Demarcacion puesto= Demarcacion.DEFENSA;
		Demarcacion puesto2=Demarcacion.PORTERO;
		
		System.out.println("Que visualiza el metodo toString(): "+t.toString());
		System.out.println("Que visualiza el metodo ordinal(): "+t.ordinal());
		System.out.println("Que visualiza el metodo comparteTo(): "+puesto2.compareTo(puesto));
	}

	
	public enum Talla{PEQUENA,MEDIANA,GRANDE};
			
	public enum Demarcacion{PORTERO, DEFENSA, DELANTERO, CENTROCAMPISTA};
}
