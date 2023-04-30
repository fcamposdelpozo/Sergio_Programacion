package practicaExamenFinal.CuadradoMagico;

public class CuadradoMagico {

    private static int contador1;
    private static int contador2;
    private static int contador3;

    // con el boolean haremos que la primera vez se guarde en el contador3 el valor
    // para que no de errores
    private static boolean unavez = true;

    // El contador 1 revisara las lineas horizontales
    // El contador 2 revisara las lineas verticales
    // El contador 3 revisara que las nuevas lineas horizontales y verticales sumen
    // lo mismo que las anteriores

    public static boolean esCuadradoMagico(int[][] cuadrado) {
        for (int i = 0; i < 3; i++) {
            contador1 = 0;
            contador2 = 0;
            for (int e = 0; e < 3; e++) {

                contador1 = contador1 + cuadrado[i][e];
                contador2 = contador2 + cuadrado[e][i];

            }
            if (contador1 != contador2) {
                return false;
            } else {

                // solo nos intersa que se guarde una vez
                if (unavez) {
                    contador3 = contador2;
                    unavez = false;
                }

                if (contador3 != contador2) {
                    return false;
                }
            }
        }
        return true;
    }

}
