package Ejemplo1_FiguraDosDimensiones;

public class AppFiguras {
	   public static void main(String[] args) {
	     Triangulo t1 = new Triangulo();
		 Triangulo t2 = new Triangulo();
			 
		 // todos los miembros de Triangulo estan disponibles para objetos de tipo Triangulo, incluso los heredados
		 t1.ancho = 4.0;
		 t1.alto = 4.0;
		 t1.estilo = "relleno"; 
		 
		 t2.ancho = 8.0;
		 t2.alto = 12.0;
		 t2.estilo = "hueco";
		 
		 System.out.println("INFORMACION DEL TRIANGULO 1");
		 System.out.println("---------------------------");
		 t1.mostrarDimension();
		 t1.mostrarEstilo();
		 System.out.println("EL AREA DEL TRIANGULO 1 ES :"+t1.area());
		 
		 System.out.println();
		 
		 System.out.println("INFORMACION DEL TRIANGULO 2");
		 System.out.println("---------------------------");
		 t2.mostrarDimension();
		 t2.mostrarEstilo();
		 System.out.println("EL AREA DEL TRIANGULO 2 ES :"+t2.area());
		 
		 System.out.println("Valor devuelto por el metodo getClass() de Object:"+t1.getClass());
		 System.out.println("Valor devuelto por el metodo equals() de Object:"+t1.equals(t2));
	   }
	}

	 