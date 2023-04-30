public class Array3 {

    public static void main(String[] args) {

        int array3[][] = new int[4][10];
        String paises[][] = new String[4][15];
        int max, min, media;

        paises[0][0] = "España:\t";
        paises[1][0] = "Rusia:\t";
        paises[2][0] = "Japon:\t";
        paises[3][0] = "Australia:";

        for (int filas = 0; filas < 4; filas++) {
            max = 0;
            min = 210;
            media = 0;

            for (int columnas = 0; columnas < 10; columnas++) {

                array3[filas][columnas] = (int) ((Math.round(Math.random() * (210 - 140)))) + 140;
                // System.out.printf(array3[filas][columnas] + "\t");

                if (array3[filas][columnas] > max) {
                    max = array3[filas][columnas];
                }

                if (array3[filas][columnas] < min) {
                    min = array3[filas][columnas];
                }

                media = media + array3[filas][columnas];

                paises[filas][columnas + 1] = Integer.toString(array3[filas][columnas]);
            }
            // aqui debajo construir cada fila con una cadena de strings convertir los nums
            // a string y meter en un array que luego imprimo

            media = media / 10;

            paises[filas][11] = "|";
            paises[filas][12] = Integer.toString(media);
            paises[filas][13] = Integer.toString(min);
            paises[filas][14] = Integer.toString(max);
        }

        for (int filas2 = 0; filas2 < 4; filas2++) {

            for (int columnas2 = 0; columnas2 < 15; columnas2++) {

                System.out.printf(paises[filas2][columnas2] + "\t");
            }

            System.out.printf("\n");
        }

    }

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