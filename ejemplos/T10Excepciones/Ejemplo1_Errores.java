package ejemplos.T10Excepciones;

public class Ejemplo1_Errores {
	public static void main(String[] args) {
		// El IDE nos previene de algunas

		// Ejemplo 1
		String nombre="Hola";
		System.out.println(nombre);

		// Ejemplo 2
		String nombre1 = "hola";
		System.out.println(nombre1);
		System.out.println("Longitud =" + nombre1.length());

		// Ejemplo 3.
		int a = 7;
		int b = 0;
		try{
			System.out.println(a / b); // Error de division entre 0
		}catch(Exception e){
			System.out.println("No se puede dividir entre 0");
		}

		// Ejemplo 4
		try{
			int matriz[] = new int[5];

			matriz[0] = 6;
			matriz[1] = 2;
			matriz[2] = 4;
			matriz[3] = 10;
			matriz[4] = 6;
			matriz[5] = 16;

			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Elemento " + i + ":" + matriz[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("El array supera los limites");
		}

	}

}
