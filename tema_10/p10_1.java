package tema_10;

import java.util.Scanner;

public class p10_1 {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Dime las dimensiones para un array bidimensional");

        try {
            num1 = dato.nextInt();
            num2 = dato.nextInt();

            int[][] array = new int[num1][num2];
            System.out.println("Array creado con exito :)");

            try {
                System.out.println("Ahora rellena el array con valores numericos");
                for (int i = 0; i < num1; i++) {
                    for (int e = 0; e < num2; e++) {
                        array[i][e] = dato.nextInt();
                    }
                }

                try {
                    System.out.println("Dime la posicion que quieres visualizar del array");
                    num1 = dato.nextInt();
                    num2 = dato.nextInt();

                    try {
                        System.out.println(array[num1][num2]);

                    } catch (IndexOutOfBoundsException e) {

                        System.out.println("Valor fuera de los limites del array");
                    }

                } catch (Exception e) {
                    System.out.println("Datos no validos");
                }

            } catch (Exception e) {
                System.out.println("El array solo acepta valores numericos");
            }

        } catch (Exception e) {
            System.out.println("Debe tratarse de un valor numerico");
        }

    }
}
