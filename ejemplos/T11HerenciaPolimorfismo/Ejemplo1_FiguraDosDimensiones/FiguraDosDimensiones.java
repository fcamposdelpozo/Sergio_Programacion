package Ejemplo1_FiguraDosDimensiones;

public class FiguraDosDimensiones {
	// SUPERCLASE Figura de Dos Dimensiones
    double ancho;
	double alto;
	
	public FiguraDosDimensiones() {
		
	}
	
	public FiguraDosDimensiones(double an, double al) {
		ancho=an;
		alto=al;
	}
	   
	void mostrarDimension(){
	   System.out.printf("El alto y ancho de la figura son %.2f cm. de alto y %.2f cm. de ancho %n",ancho,alto);
	}

}
