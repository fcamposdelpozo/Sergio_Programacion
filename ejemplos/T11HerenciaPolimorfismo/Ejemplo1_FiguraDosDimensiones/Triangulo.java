package Ejemplo1_FiguraDosDimensiones;

//SUBCLASE DE FiguraDosDimensiones para tri�ngulos
class Triangulo extends FiguraDosDimensiones {
   String estilo;
   
   public Triangulo() {}
   
   public Triangulo(double an, double al, String tipo) {
	   super(an, al);
	   ancho=an;
	   alto=al;
	   estilo=tipo;
	   
   }
   
   double area(){
	   return ancho*alto/2;  
	   //Triangulo puede hacer referencia a los miembros de FiguraDosDimensiones como si fueran suyos
   }
   
   void mostrarEstilo(){
	   System.out.println("El triangulo es :"+estilo);
   }
}