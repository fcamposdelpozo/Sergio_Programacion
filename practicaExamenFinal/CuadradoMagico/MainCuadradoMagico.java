package practicaExamenFinal.CuadradoMagico;

public class MainCuadradoMagico {
    public static void main(String[] args) {
        
        int[][] cuadradoMagico ={{4,9,2},{3,5,7},{8,1,6}};
        int[][] cuadradoNoMagico={{4,9,2},{3,6,7},{8,1,5}};

        boolean respuesta1 = CuadradoMagico.esCuadradoMagico(cuadradoMagico);
        boolean respuesta2 = CuadradoMagico.esCuadradoMagico(cuadradoNoMagico);

        System.out.println("El cuadrado 1 es magico: "+respuesta1);
        System.out.println("El cuadrado 2 es magico: "+respuesta2);

    }
    
}
