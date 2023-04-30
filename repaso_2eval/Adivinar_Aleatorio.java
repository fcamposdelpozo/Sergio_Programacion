import java.util.Scanner;
class Adivinar_Aleatorio{
    
    public static void main(String[] args) {
        
        int intentos=0;
        int num =0;
        Scanner dato = new Scanner(System.in);

        final int numMax =1000;
        final int numSecreto= ((int)(Math.random()*numMax));
        //System.out.println(numSecreto);

        System.out.println("He pensado un numero menor de "+numMax+", trata de adivinarlo. Para cerrar el programa escribe -1\n");

        do{

            num = dato.nextInt();
            intentos++;

            if(num!=numSecreto){
                if(num>numSecreto){
                    System.out.println("El numero que has introducido es mayor que el numero secreto");
                }else{
                    System.out.println("El numero que has introducido es menor que el numero secreto");

                }
            }

        }while((num!=numSecreto)&&(num!=-1));

        if(num==numSecreto){
            System.out.println("\nEnhorabuena has adivinado el numero en "+intentos+" intentos!");
        }
        else{
            System.out.println("\nHas cerrado el programa tras realizar "+(intentos-1)+" intentos");
            System.out.println("\t El numero que habia pensado era el "+numSecreto);
        }
        dato.close();
         
    }
}