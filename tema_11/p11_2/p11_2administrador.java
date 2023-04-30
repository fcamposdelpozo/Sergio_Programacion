package p11_2;

public class p11_2administrador extends p11_2persona{

    String codigoAdministrador;
    String finca;
    int numVecinos;
    float salario;

    public p11_2administrador(String nombre, int edad, String dni, String codigoAdministrador, String finca,
            int numVecinos, float salario) {
        super(nombre, edad, dni);
        this.codigoAdministrador = codigoAdministrador;
        this.finca = finca;
        this.numVecinos = numVecinos;
        this.salario = salario;
    }

    public Boolean codigoValido(String codigo){
        if(codigo.length()<=5&&codigo.charAt(0)=='A'){
            return true;
        }
        return false;
    }

    public double salarioMaximo(int cuota){
        return (0.5*numVecinos*cuota);
    }

    @Override
    public String toString() {
        return super.toString()+"- ADMI - codigo=" + codigoAdministrador + ", finca=" + finca + ", numVecinos="
                + numVecinos + ", salario=" + salario + "$]";
    }

    

    
    
}
