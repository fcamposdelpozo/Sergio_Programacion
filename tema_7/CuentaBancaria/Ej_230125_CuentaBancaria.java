public class Ej_230125_CuentaBancaria{
    public static void main(String[] args){
    //Esta clase solamente tendrá el método main. Se podrán crear otros métodos auxiliares si fuesen necesarios, aunque en principio no hace falta.
    //El método main hará lo siguiente:
    //Creará el objeto cuentaNomina, que será una instancia de la clase CuentaBancaria.
    //Creará el objeto cuentaDeAhorro, que será una instancia de la clase CuentaBancaria.

    CuentaBancaria cuentaNomina = new CuentaBancaria();
    CuentaBancaria cuentaDeAhorro = new CuentaBancaria();
    //Ambas cuentas tendrán el mismo titular, distinto número de cuenta y distinto saldo.
    //cuentaNomina comenzará con un saldo de 1500€. cuentaDeAhorro comenzará con un saldo de 5000€.

    int cantidadTransferencia, cantidadIngresar;

    cuentaNomina.setTitular("Sergio");
    cuentaNomina.setNumeroDeCuenta("1234567890");
    cuentaNomina.setSaldo(1500);
    cuentaDeAhorro.setTitular("Sergio");
    cuentaDeAhorro.setNumeroDeCuenta("0987654321");
    cuentaDeAhorro.setSaldo(5000);


    //Imprimiremos el estado de cuentaNomina
    System.out.println("cuentaNomina\n Titular de la cuenta: " +cuentaNomina.getTitular()+"\n Numero de Cuenta: " +cuentaNomina.getNumeroDeCuenta() + "\n Saldo: " +cuentaNomina.getSaldo());
    //Imprimiremos el estado de cuentaDeAhorro
    System.out.println("\ncuentaDeAhorro\n Titular de la cuenta: " +cuentaDeAhorro.getTitular()+"\n Numero de Cuenta: " +cuentaDeAhorro.getNumeroDeCuenta() + "\n Saldo: " +cuentaDeAhorro.getSaldo());
    

    System.out.println("\n");
    //Haremos una retirada de la cuentaNomina de 500€
    boolean sePuede = cuentaNomina.retirarDinero(500);
    if(sePuede==true){
      System.out.println("Retirada de 500 eur en cuentaNomina CORRECTA, saldo restante: " +cuentaNomina.getSaldo());
    }
    else{
      System.out.println("Retirada de 500 eur en cuentaNomina INCORRECTA, saldo insuficiente");
    }


    System.out.println("\n");
    cantidadTransferencia = 700;
    //Haremos una transferencia de la cuentaNomina a la cuentaDeAhorro de 700€
    boolean transfe = cuentaNomina.hacerTransferencia(cuentaDeAhorro, cantidadTransferencia);
    if(transfe== true){
        System.out.println("Transferencia realizada\n  Saldo de cuenta Origen: "+cuentaNomina.getSaldo()+" euros\n  Saldo cuenta Receptora: "+cuentaDeAhorro.getSaldo()+" euros");
      }
    else{
        System.out.println("No hay saldo suficiente en la cuenta para realizar una transferencia :(");
      }


    System.out.println("\n");
    //Haremos una retirada de la cuentaNomina de 500€
    sePuede = cuentaNomina.retirarDinero(500);
    if(sePuede==true){
      System.out.println("Retirada de 500 eur en cuentaNomina CORRECTA, saldo restante: " +cuentaNomina.getSaldo());
  }
    else{
      System.out.println("Retirada de 500 eur en cuentaNomina INCORRECTA, saldo insuficiente");
  }


    System.out.println("\n");
    //Haremos un depósito en la cuentaNomina de 300€
    cantidadIngresar=300;
    cuentaNomina.depositarDinero(cantidadIngresar);
    System.out.println("Deposito de 300 eur ingresado, saldo en cuentaNomina: "+cuentaNomina.getSaldo());
    

    System.out.println("\n");
    //Haremos una retirada de la cuentaNomina de 500€
    sePuede = cuentaNomina.retirarDinero(500);
    if(sePuede==true){
      System.out.println("Retirada de 500 eur en cuentaNomina CORRECTA, saldo restante: " +cuentaNomina.getSaldo());
  }
    else{
      System.out.println("Retirada de 500 eur en cuentaNomina INCORRECTA, saldo insuficiente");
  }

    System.out.println("\n");
    //Imprimiremos el estado de cuentaNomina
    System.out.println("cuentaNomina\n Titular de la cuenta: " +cuentaNomina.getTitular()+"\n Numero de Cuenta: " +cuentaNomina.getNumeroDeCuenta() + "\n Saldo: " +cuentaNomina.getSaldo());
    //Imprimiremos el estado de cuentaDeAhorro
    System.out.println("\ncuentaDeAhorro\n Titular de la cuenta: " +cuentaDeAhorro.getTitular()+"\n Numero de Cuenta: " +cuentaDeAhorro.getNumeroDeCuenta() + "\n Saldo: " +cuentaDeAhorro.getSaldo());
    
    }
}