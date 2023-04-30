import java.util.Scanner;
public class FechaMain{
    public static void main(String[] args){
        
        Scanner dato = new Scanner(System.in);
        Fecha fechaNac = new Fecha();
        Fecha fecha = new Fecha();

        fechaNac.dia =6;
        fechaNac.mes=8;
        fechaNac.anno = 2001;


        System.out.println("Introduce una fecha, empezando por el dia");
        fecha.dia = dato.nextInt();
        System.out.println("Ahora dime el mes");
        fecha.mes = dato.nextInt();
        System.out.println("Por ultimo el año");
        fecha.anno = dato.nextInt();
        System.out.println();

        dato.close();


        fechaNac.formatoFecha();
        fecha.formatoFecha();
        System.out.println();


        boolean esbisiesto = fechaNac.esBisiesto();
        if(esbisiesto==true){
            System.out.println("El año introducido es bisiesto");
        }
        else{
            System.out.println("El año introducido no es bisiesto");
        }


        fecha.tiempoPasado(fechaNac);
    }
}