//import java.util.Scanner;
public class pruebaBurbuja{
    public static void main(String[] args) {

        final int tamanno = 6;
        //int contador = 0;
        boolean check = false;
        //Scanner dato = new Scanner(System.in);
        int save;

        /*System.out.println("De que tamano quieres el array?");
        tamano = dato.nextInt();*/

        /*for(int i=0; i<tamano; i++){
            array[i] = (int)(Math.random()*tamano+1);
        }*/

        int[] array = {6,5,1,3,2,4};

        System.out.println("El array quedaria asi:");
        for(int i=0; i<tamanno; i++){
            System.out.printf(array[i]+"  ");
        }

        System.out.println("Ahora vamos a probar a ordenarlo con el metodo burbuja");

        do{
            for(int i=0; i<tamanno-1; i++){
                if(i!=tamanno){
                    //elementos repetidos
                    if(array[i]>array[i+1]){
                        save = array[i+1];
                        array[i+1]=array[i];
                        array[i]=save;
                    }
                }
                for(int e=0; e<tamanno-1; e++){
                    if(e!=tamanno){
                        if(array[e]<array[e+1]){
                            check = true;
                        }else{
                            check = false;
                            break;
                        }
                    }
            }
            //contador ++;
            System.out.println();
            for(int r=0; r<tamanno; r++){
                System.out.printf(array[r]+"  ");
            }
        }
        }while(check==false);
    
        
    }
}