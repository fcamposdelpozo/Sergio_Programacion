package p11_1;

import p11_1.*;
import p11_1.p11_1trabajador.categoria;

public class Mainp11_1 {

    public static void main(String[] args) {

         p11_1trabajador trabajador;
         trabajador = new p11_1trabajador("Sofia", 636987458, 26, categoria.A, 6);

         p11_1trabajador trabajador2;
         trabajador2 = new p11_1trabajador("Luisa", 698574245, 38, categoria.B, 12);

         System.out.println(trabajador);
         System.out.println(trabajador2);

         if(trabajador.antiguedad > trabajador2.antiguedad){
            System.out.println("La trabajadora mas antigua es: "+trabajador.getNombre());
         }else{
            System.out.println("La trabajadora mas antigua es: "+trabajador2.getNombre());
         }

    }
    
}
