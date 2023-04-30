import java.util.Scanner;
public class BuscaminasMain{
    public static void main(String[] args) {
        
        final int alto = 6;
        final int ancho = 6;
        final int numMinas = 3;
        int contador = 0;
        //int minasPuestas = 0;
        int num1=0;
        int num2=0;
        int casillasDescubiertas=0;
        boolean perder = false;
        int intentos =0;

        Scanner dato = new Scanner(System.in);

        //Declaramos el array con numeros tan altos para luego poder comprobar bien que no se repitan valores
        int posicionesMinas[] = {100,100,100};

        //el array guarda la posicion y en el tercer[] habra un 1 si ya esta mostrado o si esta oculto un 0
        char[][][] array = new char[alto][ancho][2];

        //Primero voy a asignar de forma aleatoria las posiciones de las minas
        for(int i=0; i < numMinas; i++){

            //hacemos que si es el primer valor que se asigne no haga nada mas
            if(i==0){
                posicionesMinas[i]= (int) (Math.random()*((6*6)));
            }
            //en camnbio cuando annada las otras dos minas debe comprobar que la posicion no este ya asignada
            if(i==1){
                do{
                    posicionesMinas[i]= (int) (Math.random()*((6*6)));
    
                }while(posicionesMinas[i]==posicionesMinas[i-1]);
            }
            if(i==2){
                do{
                    posicionesMinas[i]= (int) (Math.random()*((6*6)));
    
                }while(posicionesMinas[i]==posicionesMinas[0]||posicionesMinas[i]==posicionesMinas[1]);
            }

        }

        //creo un bucle for que guarde los valores en el array poniendo * en las minas y 0 en los vacios q luego cambiare por las diastancias
        for(int x=0; x< alto; x++){
            for(int y=0; y< ancho; y++){

                if(contador==posicionesMinas[0]||contador==posicionesMinas[1]||contador==posicionesMinas[2]){
                    array[x][y][0]='*';
                    array[x][y][1]='0';

                    //Comprobamos las casillas de alrededor de las minas para que queden guardadas con un 1
                    for(int a=-1; a<2;a++){
                        for(int b=-1;b<2;b++){
                            if(((x+a)>=0)&&((x+a)<=5)&&((y+b)>=0)&&((y+b)<=5)){
                                if(array[x+a][y+b][0]!='*'){
                                    array[x+a][y+b][0]='1';
                                    array[x+a][y+b][1]='0';
                                }
                            }
                        }
                    }
                }else{

                    //en caso contrario quedaran con un 0
                    if((array[x][y][0]=='1')|| array[x][y][0]=='*'){

                    }else{
                        array[x][y][0]='0';
                        array[x][y][1]='0';
                    }
                }
                contador ++;
            }
        }

        //creamos el menu que se ira repitiendo y nos ira pidiendo introducir posicion
        do{
            System.out.println("\nDime el alto pulsa Enter y escribe el ancho");
            num1= dato.nextInt();
            num2 = dato.nextInt();
            System.out.println();
            intentos++;

            array[num1][num2][1]='1';
            casillasDescubiertas++;

            if(array[num1][num2][0]=='*'){
                perder = true;
                break;
            }

            //debajo muestra esa posicion y todas las de alrededor pero para eso debe comprobar que los valores esten dentro del array
            for(int a=-1; a<2;a++){
                for(int b=-1;b<2;b++){

                    //Falta terminar este bucle q lo q hace es comprobar que las posiciones esten dentro del rango del array para que no de error
                    if(((num1+a)>=0)&&((num1+a)<=5)&&((num2+b)>=0)&&((num2+b)<=5)){
                        if(array[num1+a][num2+b][0]!='*'){
                            if(array[num1+a][num2+b][1]=='0'){
                                casillasDescubiertas++;
                                array[num1+a][num2+b][1]='1';
                            }
                        }
                    }
                }
            }

            System.out.println(".   0  1  2  3  4  5");
            System.out.println();

            for(int x=0; x< alto; x++){

                System.out.printf(x+"   ");

                for(int y=0; y< ancho; y++){

                    //si el tercer [] es 1 querra decir que se tiene q mostrar e valor si no no
                    if(array[x][y][1]=='1'){
                        System.out.print(array[x][y][0]);
                    }
                    else{
                        System.out.print('.');
                    }
                    System.out.printf("  ");
                }
                System.out.printf("\n");
            }

        }while(casillasDescubiertas<((alto*ancho)-numMinas));

        if(perder==true){
            System.out.println("\nPerdiste, hiciste explotar una bomba :(");
        }
        else{
            System.out.println("\nEnhorabuena has ganado el BuscaMinas en "+intentos+" intentos :)");
        }

        dato.close();

    }
}