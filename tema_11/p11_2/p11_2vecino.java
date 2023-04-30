package p11_2;

public class p11_2vecino extends p11_2persona{

    String codigoVecino;
    String codigoVivienda;
    static double cuota;

    public p11_2vecino(String nombre, int edad, String dni, String codigoVecino, String codigoVivienda) {
        super(nombre, edad, dni);
        this.codigoVecino = codigoVecino;
        this.codigoVivienda = codigoVivienda;
    }

    public Boolean codigoValido(String codigoVecino){
        if(codigoVecino.length()<=5&&codigoVecino.charAt(0)=='V'){
            return true;
        }
        return false;
    }

    public void modificarCuota(double nuevaCuota){
        cuota = nuevaCuota;
    }

    @Override
    public String toString() {
        return super.toString() + "- VECINO - codigo=" + codigoVecino + ", codigoVivienda=" + codigoVivienda + "]";
    }

    
    
}
