import java.util.Scanner;

public class Rectangulo{

    public int alto, ancho;
    public char signo;
    Scanner dato = new Scanner (System.in);

    public void PedirDimensiones(){
        System.out.println("\nDime cuanto quieres que mida de Alto");
        alto = dato.nextInt();
        System.out.println("\nDime cuanto quieres que mida de Ancho");
        ancho = dato.nextInt();
    }

    public void Pintar(){
        signo='*';
        for(int i = 0; i<alto; i++){
            for(int e = 0; e<ancho; e++){
                System.out.print(signo +"\t");
            }
            System.out.println();
        }
    }

    public void PintarSigno(){
        for(int i = 0; i<alto; i++){
            for(int e = 0; e<ancho; e++){
                System.out.print(signo +"\t");
            }
            System.out.println();
        }
    }

    public void Invertir(){
        for(int i = 0; i<ancho; i++){
            for(int e = 0; e<alto; e++){
                System.out.print(signo +"\t");
            }
            System.out.println();
        }
    }

    public void CentrarHorizontal(){

    }

    public void CentrarPantalla(){

    }

    public void CalcularArea(){
        System.out.println("\nArea de la figura: \t\t"+(ancho*alto));
    }

    public void CalcularPerimetro(){
        System.out.println("Perimetro de la figura: \t"+((ancho*2)+(2*alto)));
    }
}