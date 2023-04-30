package ejemplos.T10Excepciones;

import javax.swing.JOptionPane;

public class Ejemplo5_VariosCatch {

	public static void main(String[] args) {
		int num1, num2;
        // PEDIR DOS N�MERO POR TECLADO
        // Segunda parte. Pedir datos por teclado
        try{       
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));

            System.out.println("A/B = " + num1/num2);   
        }
        catch(NumberFormatException ex) {
            System.out.println("SE HA PRODUCIDO UN ERROR. USTED NO HA INTRODUCIDO UN N�MERO ENTERO");
            
            System.out.println("Informaci�n que proporciona el m�todo getMessage es ");
            System.out.println(ex.getMessage());           
            
            System.out.println("Informaci�n que proporciona el m�todo toString es ");
            System.out.println(ex.toString());   
            
        }
        catch(ArithmeticException ex)        {
            System.out.println("HA INTROUCIDO UN DENOMINADOR CON VALOR 0");
        }
        catch(Exception ex){
            System.out.println("SE HA PRODUCIDO UN ERROR");
            //System.out.println("Informaci�n que proporciona el m�todo getName es "+ex.getName());
        }

	}


}
