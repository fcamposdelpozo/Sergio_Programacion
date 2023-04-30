public class Array1 {

    public static void main(String[] args) {

        int[][] array = new int[6][10];
        int nummax = 0;
        int nummin = 1000;
        int filamax = 0;
        int columnamax = 0;
        int filamin = 0;
        int columnamin = 0;

        for (int filas = 0; filas < 6; filas++) {

            for (int columnas = 0; columnas < 10; columnas++) {

                array[filas][columnas] = (int) (Math.round(Math.random() * 1001));
                System.out.print(array[filas][columnas] + "\t");

                if (array[filas][columnas] > nummax) {
                    nummax = array[filas][columnas];
                    filamax = filas;
                    columnamax = columnas;
                }

                if (array[filas][columnas] < nummin) {
                    nummin = array[filas][columnas];
                    filamin = filas;
                    columnamin = columnas;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nEl numero mayor generado en el array es el " + nummax + " situado en array[" + filamax
                + "][" + columnamax + "]");
        System.out.println("\nEl numero menor generado en el array es el " + nummin + " situado en array[" + filamin
                + "][" + columnamin + "]");

    }
}
/*
 * Ejercicio 1
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 */