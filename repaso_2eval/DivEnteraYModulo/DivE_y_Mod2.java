public class DivE_y_Mod2 {
    public static void main(String[] args) {

        final int filas=4;
        final int columnas = 7;
        final int maxRandom =100;

        int[][] matriz = new int[filas][columnas];
        

        for (int i = 0; i < (filas*columnas); i++) {

            matriz[i/columnas][i%columnas]= (int)(Math.random()*maxRandom);
            System.out.printf(matriz[i/columnas][i%columnas]+"\t");

            if(((i+1)%filas)==0)
            {
                System.out.printf("\n");
            }
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < (filas*columnas); i++) {

            System.out.printf(matriz[i/columnas][i%columnas]+"\t");

            if(((i+1)%columnas)==0)
            {
                System.out.printf("\n");
            }
        }
    }
}