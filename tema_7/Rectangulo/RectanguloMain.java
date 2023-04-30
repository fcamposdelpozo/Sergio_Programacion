import java.util.Scanner;
public class RectanguloMain{
    public static void main(String args[] ){
        
        Scanner dato = new Scanner (System.in);
        Rectangulo figura = new Rectangulo();

        int opcion;
        //Primero creamos el menu de opciones
        do{
            //Creamos un blucle que se repite hasta que opcion sea un valor valido
            do{
                System.out.println("\nElige una opcion:\n\t0. Salir\n\t1.Pintar\n\t2.Pintar on Signo\n\t3.Invertir"+
                "\n\t4. Centrar Horizontal\n\t5.Centrar Pantalla\n\t6.Calcular Area Y Perimetro");
                opcion = dato.nextInt();
    
    
                switch(opcion){
                    case 0:
                        System.out.println("Cerrando programa...");
                        break;
    
                    case 1:
                        System.out.println("Creando Rectangulo...");
                        figura.PedirDimensiones();
                        figura.Pintar();
                        break;
                        
                    case 2:
                        System.out.println("Creando Rectangulo...");
                        System.out.println("Dime que signo quieres usar para crear la figura;");
                        figura.signo = dato.next().charAt(0);
                        figura.PedirDimensiones();
                        figura.PintarSigno();
                        break;

                    case 3:
                        System.out.println("Creando Rectangulo Invertido...");
                        figura.Invertir();
                        break;

                    case 4:
                        System.out.println("Creando Rectangulo Centrado Horizontal...");
                        figura.CentrarHorizontal();
                        break;
                        
                    case 5:
                        System.out.println("Creando Rectangulo Centrar en Pantalla...");
                        figura.Pintar();
                        break;

                    case 6:
                        System.out.println("Cargando calculadora...");
                        figura.PedirDimensiones();
                        figura.CalcularArea();
                        figura.CalcularPerimetro();
                        break;

                    default:
                        System.out.println("Valor introducido incorrecto, prueba de nuevo.");
                }
            }while((opcion<0)||(opcion>6));

        }while(opcion !=0);
        dato.close();
    }
}