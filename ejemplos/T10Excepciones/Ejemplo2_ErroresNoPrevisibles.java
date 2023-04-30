package ejemplos.T10Excepciones;

import javax.swing.JOptionPane;

public class Ejemplo2_ErroresNoPrevisibles {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        // En esta excepcion comprobaremos que la edad no sea un string
        try {

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
            System.out.println("Hola " + nombre + " tu edad es de " + edad + " años");

        } catch (NumberFormatException e) {

            System.out.println("Dato edad no valido");
        }
    }

}
