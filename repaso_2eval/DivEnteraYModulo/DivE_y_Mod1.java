public class DivE_y_Mod1 {
    public static void main(String[] args) {

        String cadena;

        for (int i = 0; i < 21; i++) {

            cadena ="";
            cadena = cadena + i + "\t";

            for (int e = 2; e <= 7; e++) {

                cadena = cadena + (i / e) + "\t";
                cadena = cadena + (i % e) + "\t";
            }

            System.out.printf(cadena +"\n");
        }
    }
}