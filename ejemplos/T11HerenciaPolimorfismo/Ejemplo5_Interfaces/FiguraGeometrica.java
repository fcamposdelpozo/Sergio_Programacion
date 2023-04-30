package Ejemplo5_Interfaces;

public interface FiguraGeometrica {
	
	//metodo para ver si una figura es mas grande que otra
	public boolean isLargerThan(FiguraGeometrica fg);
	
	default public void metodoPorDefecto() {
		System.out.println("Se ejecuta el metodo por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("El metodo estatico se esta ejecutando");
	}
}
