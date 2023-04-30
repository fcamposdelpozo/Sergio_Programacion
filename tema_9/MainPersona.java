import java.util.Scanner;
import p_1.*;

class MainPersona{
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner close = new Scanner(System.in);

        boolean continuar = true;
        String nombre;
        String numero;
        String edad;
        int contador=0;
        int menor =100;
        String checkNombre="Hola";

        String[] arrayPersonas = new String[10];

        
        do{
            System.out.println("Dime el nombre de la Persona");
            nombre = dato.nextLine();

            System.out.println("Ahora dime el telefono de "+nombre);
            numero = dato.nextLine();

            System.out.println("Por ultimo dime la edad de "+nombre);
            edad = dato.nextLine();
            if(Integer.parseInt(edad)<menor){
                menor=Integer.parseInt(edad);
                checkNombre=nombre;
            }

            Persona persona = new Persona(nombre, numero, edad, contador);

            arrayPersonas[contador]= persona.toString();
            contador++;

            System.out.println("¿Quieres continuar? '0'=no   'otro numero'=si ");
            if(close.nextInt()==0){
                continuar=false;
                System.out.println("Cerrando programa...");
            }else{
                continuar=true;
            }
        }while(continuar==true);

        System.out.println("\nAhora te mostrare los datos que has introducido: \n");

        for(int num =0; num<contador; num++){
            System.out.println(arrayPersonas[num]);
        }
        System.out.println("\t"+checkNombre+" es la persona mas pequenna con "+menor+" annos");
        System.out.println();

        dato.close();
        close.close();
    
    /*Programa una clase llamada Persona, con los siguientes atributos privados:
    Nombre, Teléfono y edad.
    Programa los métodos set (pon) y get (dame) para cada uno de los atributos y un método
    para visualizarlos.
    Hacer un programa principal que realiza en este orden las siguiente operaciones:
    • cree un objeto de la clase Persona.
    • Pida que se introduzcan por teclado los valores de sus atributos y asigne
    estos valores a los mismos.
    • visualizar los datos el objeto creado.
    Crear otro objeto leyendo los datos por teclado.
    Visualizar el nombre de la persona de menor edad de las dos. */
    }
}