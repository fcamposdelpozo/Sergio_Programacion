public class MiClase{

    //Esta clase tendrá los atributos:
    public int variableEnteraPublica;
    private String nombrePrivado;
    //y los métodos:

    /*public void setNombrePrivado(String nombrePrivado){
        this.nombrePrivado = nombrePrivado;
    }*/
    public void setNombrePrivado(String valor){
        nombrePrivado = valor;
    }
    public String getNombrePrivado(){
        return nombrePrivado;
    }
}