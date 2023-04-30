import java.util.Scanner;
public class MainAgencia{
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int maxClientes, maxVehiculos;
        String nombreAgencia;

        System.out.printf("\nDime el nombre de la Agencia: ");
        nombreAgencia = dato.nextLine();

        System.out.printf("\nDime el numero maximo de clientes de la Agencia: ");
        maxClientes = dato.nextInt();

        System.out.printf("\nDime el numero maximo de vehiculos de la Agencia: ");
        maxVehiculos = dato.nextInt();


        AgenciaAlquilerVehiculos miAgencia = new AgenciaAlquilerVehiculos(maxClientes, maxVehiculos, nombreAgencia);

        System.out.printf("\n"+ miAgencia.toString()+"");

        miAgencia.annadirCliente("Sergi", "serrano");
        miAgencia.leerCliente(0);

        miAgencia.annadirCliente("Luis", "Perez");
        System.out.println(miAgencia);
        miAgencia.leerCliente(0);
        miAgencia.leerCliente(1);

        dato.close();



        
    }
}