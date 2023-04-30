//import java.util.Arrays;

//import org.jcp.xml.dsig.internal.SignerOutputStream;

public class AgenciaAlquilerVehiculos{

/*El sistema va a gestionar un conjunto de vehículos y un conjunto de clientes, que almacenará en arrays.
El tamaño de los arrays se introducirá por teclado, junto con el nombre de la agencia.
Con esa información crearemos una instancia de la clase AgenciaAlquilerVehiculos.
Esta clase contendrá un array de la clase Vehiculo y un array de la clase Cliente. */

private Cliente cliente[];
private Vehiculo vehiculo[];
private String nombre;
int numClientes =0;
int numVehiculos;
//private static int numAlquileres=2;

public AgenciaAlquilerVehiculos(int maxClientes, int maxVehiculos, String nombre) {
    this.cliente = new Cliente[maxClientes];
    this.vehiculo = new Vehiculo[maxVehiculos];
    this.nombre = nombre;
}

@Override
public String toString() {
  String cadena = "Agencia '" + nombre + "' (maxClientes=" + cliente.length 
                  + ", maxVehiculos=" + vehiculo.length + ")\n";
  
  /*cadena += numClientes + " clientes:\n";
  for(int i=0; i<numClientes; i++) {
    cadena += "\t" + i + ") " + clientes[i] + "\n";
  }
  
  cadena += numVehiculos + " vehiculos:\n";
  for(int i=0; i<numVehiculos; i++) {
    cadena += "\t" + i + ") " + vehiculos[i] + "\n";
  }*/
  return cadena;
}

public void leerCliente(int num){
    System.out.println(cliente[num].toString());

}

public void annadirCliente(String name, String surname){
    if(numClientes<cliente.length){
        cliente[numClientes]=new Cliente(name,surname, surname, surname);
        numClientes++;
    }
    else{
        System.out.println("No hay espacio");
    }
}



    
}
