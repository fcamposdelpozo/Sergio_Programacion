import java.util.Scanner;
public class R2evEj_1{
    public static void main(String[] args) {


        Scanner dato = new Scanner(System.in);
        System.out.println("Dime el numero maximo");
        int c = dato.nextInt();
        final int f = 5;
        //final int c = 5;
        int[][] array = new int[f][c];

        //aqui guardamos los valores iniciales de 1 a n(c)
        for(int x=0; x<c;x++){
            array[0][x]=(x+1);
        }

        for(int i=1;i<f; i++){

            for(int e=0;i<c;i++){

                array[i][e] = array[i-1][e];

            }
        }

        
        
        
        
        
        
        
    /*Vamos a crear una tabla de enteros de dos dimensiones.
    En primer lugar vamos a almacenar en ellas valores que
    capturemos por teclado.
    Posteriormente sustituir los anteriores por valores
    consecutivos pero en el siguiente orden: en la primera fila irán
    los valores del 1 a n, en la segunda fila los valores irán de 2n
    a n+1 y así sucesivamente.
    Veamos un ejemplo:
        1 2 3 4 5
        10 9 8 7 6
        11 12 13 14 15
        20 19 18 17 16 */
    }
}