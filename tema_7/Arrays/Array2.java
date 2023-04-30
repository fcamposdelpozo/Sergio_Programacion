public class Array2 {

    public static void main(String[] args) {

        int array2[][] = new int[10][10];
        int diagonal[] = new int[10];
        int nummax = 50;
        int nummin = 300;
        int media = 0;

        for (int filas = 0; filas < 10; filas++) {

            for (int columnas = 0; columnas < 10; columnas++) {

                array2[filas][columnas] = (int) ((Math.round(Math.random() * (300 - 50)))) + 50;
                System.out.printf(array2[filas][columnas] + "\t");

                if (filas == columnas) {
                    diagonal[filas] = array2[filas][columnas];

                    if (diagonal[filas] > nummax) {
                        nummax = diagonal[filas];
                    }

                    if (diagonal[filas] < nummin) {
                        nummin = diagonal[filas];
                    }

                    media = media + diagonal[filas];
                }

            }
            System.out.print("\n");
        }

        System.out.print("\n\t A continuacion voy a mostrar los numeros de la diagonal\n\n");

        for (int i = 0; i < 10; i++) {
            System.out.printf(diagonal[i] + "\t");
        }

        System.out.printf("\n\nEl numero mayor de la diagonal es el: \t" + nummax +
                "\nEl numero menor de la diagonal es el: \t" + nummin + "\nLa media de numeros de la diagonal es: \t"
                + (media / 10) + "\n");

    }

    /*
     * Ejercicio 2
     * Realiza un programa que muestre por pantalla un array de 10 filas por 10
     * columnas relleno con números enteros aleatorios comprendidos entre 50 y 300,
     * ambos incluidos. Los números deben estar correctamente alineados al
     * mostrarlos por pantalla usando el formato de printf() o de String.format()
     * que hemos visto en clase.
     * A continuación, el programa debe mostrar todos los números de la diagonal que
     * va desde la esquina superior izquierda a la esquina inferior derecha.
     * También debe mostrar el número máximo, mínimo y la media de los números que
     * hay en esa diagonal.
     */
    /*
     * Ejercicio 3
     * Realiza un programa que calcule la estatura media, mínima y máxima en
     * centímetros de personas de diferentes países.
     * El array que contiene los nombres de los paises es el siguiente: pais =
     * {“España”, “Rusia”, “Japón”, “Australia”}.
     * Los datos sobre las estaturas se deben simular mediante un array de 4 filas
     * por 10 columnas con números aleatorios generados al azar entre 140 y 210.
     * La media debe calcularse utilizando float para no perder decimales. El
     * resultado final se redondeará al siguiente entero mayor (mirar función
     * Math.ceil()).
     * Los nombres de los países se deben mostrar utilizando el array de países (no
     * se pueden escribir directamente).
     * 
     * Ejemplo:
     * MED MIN MAX
     * España: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
     * Rusia: 179 189 208 167 186 174 152 192 173 179 | 179 152 179
     * Japón: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
     * Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191
     */
}