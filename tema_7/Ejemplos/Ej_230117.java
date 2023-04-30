public class Ej_230117{
    public static void main(String[] args){

        //Crear la clase Ej_230117, la cual solamente tendrá el método main desde el que se intentará ejecutar lo siguiente. 
        //Habrá líneas que darán error. Se debe entregar el fichero con las líneas que dan error comentadas y sustituidas por una línea que haga lo equivalente de forma correcta.
        MiClase objeto1 = new MiClase();
        MiClase objeto2 = new MiClase();
    
        objeto1.variableEnteraPublica = 10;
        objeto2.variableEnteraPublica = 20;

        //objeto1.nombrePrivado = "Pedro";
        objeto1.setNombrePrivado("Pedro");

        //objeto2.nombrePrivado = "Maria";
        objeto2.setNombrePrivado("Maria");

    
        System.out.println("En el objeto1 el atributo variableEnteraPublica tiene valor " + objeto1.variableEnteraPublica 
        + " y el atributo nombrePrivado tiene valor '" + objeto1.getNombrePrivado() + "'");
        System.out.println("En el objeto2 el atributo variableEnteraPublica tiene valor " + objeto2.variableEnteraPublica 
        + " y el atributo nombrePrivado tiene valor '" + objeto2.getNombrePrivado() + "'");

    }
}