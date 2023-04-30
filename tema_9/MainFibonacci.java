import java.util.Scanner;

public class MainFibonacci{
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        System.out.println("\nElige el numero del que quieres calcular Fibonacci: ");

        final int num = dato.nextInt();
        System.out.println("Fibonacci de "+ num+ " nos da: "+ fibonacci(num));
        dato.close();
       
        //System.out.println(fibonacci(num));

        /*Sabiendo que:
        fibonacci(0) = 0
        fibonacci(1) = 1
        fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        [Definición Fibonacci en Wikipedia]

        Implementa la función recursiva fibonacci en la clase MainFibonacci y llámala pasándole el valor de n como literal (número mágico).

        Puedes comprobar que el valor obtenido es correcto con cualquier calculadora de números de fibonacci online (por ejemplo aquí)

        Una vez funcione, haz que la función main lea el array de argumentos String[] args y coge 
        el número n de la primera posición de ese array. 
        Imprime el resultado, que será el enésimo elemento de la sucesión de Fibonnaci.

        El funcionamiento sería algo así:

        > javac MainFibonacci.java
        > java MainFibonacci 10
        > 55 */
    }

    public static int fibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        int resultado;
        resultado = fibonacci(num-1)+fibonacci(num-2);
        return resultado;
    }
}