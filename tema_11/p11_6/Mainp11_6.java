package p11_6;

import java.util.Scanner;

public class Mainp11_6 {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int opcion = 7;
        int opcion2 = 0;

        p11_6Industrial industrial = new p11_6Industrial("22345Y", "Serie B", 22, false, 125);
        p11_6Domestica domestica = new p11_6Domestica("33T67U", "Serie Z", 12, false, 303);

        do {
            System.out.println();
            System.out.println("Elige una opcion del menu:");
            System.out.println("0.Cerrar programa y apagar maquinas");
            System.out.println("1.Ver estado de las máquinas");
            System.out.println("2.Encender maquina");
            System.out.println("3.Apagar maquina");
            System.out.println("4.Usar maquina Industrial");
            System.out.println("5.Usar maquina Domestica");
            System.out.println("6.Imprimir estado de las maquinas");

             try {
                 opcion = dato.nextInt();
             } catch (Exception e) {
                 System.out.println("Dato introducido no valido");
             }

             //Lo que esta aqui debajo comentado es la solucion que me dio chatGPT pero que no entiendo 
             
            //try {
            //    while (!dato.hasNextInt()) {
            //        dato.next(); // Leer y descartar el valor no válido
            //        System.out.println("Dato introducido no válido. Introduce un número entero:");
            //    }
            //    opcion = dato.nextInt();
            //} catch (Exception e) {
            //    System.out.println("Dato introducido no válido");
            //}

            switch (opcion) {

                case 0:
                    System.out.println("Apagando maquinas y cerrando el programa....");
                    industrial.apagar();
                    domestica.apagar();
                    break;

                case 1:
                    System.out.println();
                    System.out.print("Maquina Industrial: ");
                    if (industrial.estado) {
                        System.out.print("encendida");
                    } else {
                        System.out.print("apagada");
                    }
                    System.out.println();
                    System.out.print("Maquina Domestica: ");
                    if (domestica.estado) {
                        System.out.print("encendida");
                    } else {
                        System.out.print("apagada");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("¿Que maquina quieres encender? 1 Industrial, 2 Domestica");
                    opcion2 = dato.nextInt();

                    switch (opcion2) {

                        case 1:
                            industrial.encender();
                            break;

                        case 2:
                            domestica.encender();
                            break;

                        default:
                            System.out.println("Valor incorrecto");
                            break;
                    }
                    break;

                case 3:
                        System.out.println("¿Que maquina quieres apagar? 1 Industrial, 2 Domestica");
                        opcion2 = dato.nextInt();

                    switch (opcion2) {

                        case 1:
                            industrial.apagar();
                            break;

                        case 2:
                            domestica.apagar();
                            break;

                        default:
                            System.out.println("Valor incorrecto");
                            break;
                    }
                    break;

                case 4:
                    industrial.usarIndustrial();
                    break;

                case 5:
                    domestica.usarDomestica();
                    break;

                case 6:
                    System.out.println(industrial.toString());
                    System.out.println(domestica.toString());
                    break;

                default:
                    System.out.println();
                    break;

            }

        } while (opcion != 0);

        dato.close();
    }

}
