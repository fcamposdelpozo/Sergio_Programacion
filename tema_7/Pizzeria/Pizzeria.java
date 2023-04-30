import java.util.Scanner;

public class Pizzeria {

    Scanner dato = new Scanner(System.in);

    private String nombrePizzeria;
    private Cliente[] arrayClientes;
    private int numClientes;
    private int numPedidos;
    private Pedido[] arrayPedidos;

    public Pizzeria(String nombre) {
        this.nombrePizzeria = nombre;
        this.arrayClientes = new Cliente[5];
        this.arrayPedidos = new Pedido[5];

        // Estas inicializaciones no hacen falta, se hacen por defecto:
        this.numClientes = 0;
        this.numPedidos = 0;
    }

    public boolean annadirCliente(String nombre, String apellidos, String direccion, String telefono) {

        if (numClientes < 5) {

            Cliente cliente = new Cliente(nombre, apellidos, direccion, telefono);
            arrayClientes[numClientes] = cliente;
            numClientes++;
            return true;
        } else {
            return false;
        }
    }

    /*
     * public String clienteToString(int posicionCliente) {
     * if(posicionCliente < 0 || posicionCliente >= numClientes) {
     * return "Cliente " + posicionCliente + " no encontrado";
     * }
     * return clientes[posicionCliente].toString();
     * }
     */

    public int getNumClientes() {
        return numClientes;
    }

    public String clienteToString(int posicionCliente) {
        String cadena;
        cadena = "";
        //cadena = "\nClientes registrados=" + arrayClientes[posicionCliente].numClientes + "(max= 5)";
        for (int i = 0; i < numClientes; i++) {
            cadena += "\n" + (i + 1) + ") " + arrayClientes[i];
        }
        return cadena;
    }

    public void setNombrePizzeria(String dato) {
        nombrePizzeria = dato;
    }

    public String getNombrePizzeria() {
        return nombrePizzeria;
    }

    public void Imprimir() {

        System.out.printf("\nEl nombre de la pizzeria es " + nombrePizzeria);
        // Imprimir detalles: Imprime toda la información de la pizzeria: Nombre de
        // pizzeria, lista de clientes, total de pizzas pedidas, total de pizzas
        // servidas y lista de pedidos.
        // Pista: se recomienda implementar los métodos toString() de las clases para
        // facilitar la impresión.
    }

}