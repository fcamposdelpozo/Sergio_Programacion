package p11_2;
import java.util.Scanner;

public class Main11_2 {

    public static void main(String[] args) {

        String txt;
        
        Scanner dato = new Scanner(System.in);
        p11_2vecino vecino1 = new p11_2vecino("Raul", 16, null, "V586", "234F");
        
        do{
            System.out.println("Introduce un dni valido para "+ vecino1.nombre);

            do{
                txt = dato.nextLine();
                if(txt.length()!=9){
                    System.out.println("El dni debe tener 9 caracteres");
                }

            }while(txt.length()!=9);

            vecino1.setDni(txt);

            if(vecino1.dniValido(txt)==false){
                System.out.println("Dni no valido, debe acabar en letra distinta de A B o C");
            }

        }while(vecino1.dniValido(txt)==false);
        System.out.println("DNI guardado con exito");

        System.out.println(vecino1.nombre + " es mayor de edad: " +vecino1.esMayorDeEdad());

        if(vecino1.esMayorDeEdad()==false){
            vecino1.edad=18;
            System.out.println("Edad cambiada, ahora "+vecino1.nombre+" es mayor de edad: "+vecino1.edad);
        }


        System.out.println();
        p11_2administrador administrador1 = new p11_2administrador("Manuel", 16, "50698715P", "A234", "345", 7, 1250f);

        System.out.println(administrador1.nombre + " es mayor de edad: " +administrador1.esMayorDeEdad());

        if(administrador1.esMayorDeEdad()==false){
            administrador1.edad=18;
            System.out.println("Edad cambiada, ahora "+administrador1.nombre+" es mayor de edad: "+administrador1.edad);
        }

        System.out.println("Salario de "+administrador1.nombre +"= "+administrador1.salario+" / salario maximo: " + administrador1.salarioMaximo(500));

        System.out.println();
        System.out.println(vecino1);
        System.out.println(administrador1);

        dato.close();
    }
}