public class CuentaBancaria{

    //Sus atributos serán todos privados.Atributos: - Número de cuenta (20 dígitos) - Titular - Saldo - Moneda
    private String NumeroDeCuenta;
    private String titular;
    private int saldo;
    private int moneda;

    //Los métodos getter y setter se crearán solamente cuando sean necesarios:
    //-si no necesitas extraer el valor de un atributo, no hace falta crear el getter
    //-si no necesitas asignarle valor a un atributo, no hace falta crear el setter
    public void setNumeroDeCuenta(String valor){
        NumeroDeCuenta = valor;}
    public String getNumeroDeCuenta(){
        return NumeroDeCuenta;}

    public void setTitular(String valor){
        titular = valor;}
    public String getTitular(){
        return titular;}

    public void setSaldo(int valor){
        saldo = valor;}
    public int getSaldo(){
        return saldo;}

    public void setMoneda(int valor){
        moneda = valor;}
    public int getMoneda(){
        return moneda;}


    //Métodos: - retirarDinero(???) - depositarDinero(???) - hacerTransferencia(???) - Otros métodos que se puedan necesitar
    public boolean retirarDinero(int cantidad){
        boolean solu = false;
        if(saldo>cantidad){
            solu = true;
            saldo = saldo - cantidad;
        }
        return solu;
    }
    
    public void depositarDinero(int cantidad){
        saldo += cantidad;
    }

    public boolean hacerTransferencia(CuentaBancaria cuentaDestino, int cantEnviada){
        boolean transferencia;
        if(saldo >= cantEnviada){
            saldo -= cantEnviada;
            cuentaDestino.saldo += cantEnviada;
            transferencia = true;
        }
        else{
            transferencia= false;
        }
        return transferencia;
    }
}