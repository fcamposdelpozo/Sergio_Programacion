public class MainAgencia {
  public static void main(String[] args) {
    
    AgenciaAlquilerVehiculos miAgencia = new AgenciaAlquilerVehiculos(5, 2, "Coches Fer");
       
    System.out.println("miAgencia=" + miAgencia);

    System.out.println(miAgencia+"\n");
    miAgencia.addCliente("Linus", "Torvalds");
    System.out.println(miAgencia);
    
    miAgencia.addCliente("Alan", "Turing");
    System.out.println(miAgencia);
    
    miAgencia.addVehiculo("Seat", "Ibiza");
    System.out.println(miAgencia);

    miAgencia.addVehiculo("Ford", "Fiesta");
    System.out.println(miAgencia);

  }
}
