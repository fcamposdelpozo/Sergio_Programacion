
/*AVISO: Para preparar el examen de la próxima semana se recomienda encarecidamente enfocarse en el ejercicio ClaseConArray y después en este ejercicio Pizzería.*/
import java.util.Scanner;

public class MainPizzeria {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);
		String valor;
		int opcion = 0;
		// Pizzeria pizzeria = new Pizzeria();

		System.out.println("Dime cual es el nombre de la Pizzeria");
		valor = dato.nextLine();
		// pizzeria.setNombrePizzeria(valor);
		Pizzeria pizzeria = new Pizzeria(valor);

		do {
			System.out.printf("\n\nBienvenidx a la Pizzeria " + pizzeria.getNombrePizzeria()
					+ " elija una de las siguientes opciones:" +
					"\n\t1. Imprimir detalles\n\t2. Añadir cliente \n\t3. Crear pedido \n\t4. Servir pedido \n\t0. Salir\n");
			opcion = dato.nextInt();

			switch (opcion) {

				case 0:
					System.out.printf("\nGracias por su visita :)");
					break;

				case 1:
					pizzeria.Imprimir();
					break;

				case 2:
					if (pizzeria.getNumClientes() >= 5) {
						System.out.printf("\nLo siento pero no se aceptan mas clientes por hoy");
					} else {
						String nombreCliente;
						String apellidosCliente;
						String direccionCliente;
						String telefonoCliente;
						System.out.printf("\nIntroduce el nombre del cliente: ");
						nombreCliente = dato.nextLine();
						nombreCliente = dato.nextLine();
						System.out.printf("\nIntroduce los apellidos del cliente: ");
						apellidosCliente = dato.nextLine();
						System.out.printf("\nIntroduce la dirección del cliente: ");
						direccionCliente = dato.nextLine();
						System.out.printf("\nIntroduce el teléfono del cliente: ");
						telefonoCliente = dato.nextLine();

						if (pizzeria.annadirCliente(nombreCliente, apellidosCliente, direccionCliente,
								telefonoCliente)) {
							System.out.printf("\nCliente añadido \n");
							System.out.println(pizzeria.clienteToString(0));
						} else {
							System.out.printf("\nERROR: No se pudo añadir");
						}
						System.out.println();
						break;
					}
					break;

				case 3:
					// crear pedido
					break;

				case 4:
					// servir pedido

					break;

				default:
					System.out.printf("\nLo siento, pero no se trata de una opcion valida, reiniciando programa...");
					break;
			}

		} while (opcion != 0);

	}

	@Override
	public String toString() {
		return "MainPizzeria []";
	}
}
/*
 * Crea una clase MainPizzeria, que contendrá el método main, que pida
 * introducir el nombre de la pizzería, cree una instancia de Pizzeria y ofrezca
 * un menú por teclado que permita:
 * Imprimir detalles: Imprime toda la información de la pizzeria: Nombre de
 * pizzeria, lista de clientes, total de pizzas pedidas, total de pizzas
 * servidas y lista de pedidos.
 * Pista: se recomienda implementar los métodos toString() de las clases para
 * facilitar la impresión.
 * Añadir Cliente: Habrá que comprobar si queda hueco en el array de tamaño 5
 * para añadir otro cliente. Si no queda hueco, se mostrará un mensaje de aviso
 * y se volverá a mostrar el menú.
 * Si hay hueco se pedirán todos los datos del cliente por teclado para crear la
 * nueva instancia de Cliente.
 * Crear Pedido: Habrá que comprobar si queda hueco en el array de tamaño 5 para
 * añadir otro pedido. Si no queda hueco, se mostrará un mensaje de aviso y se
 * volverá a mostrar el
 * menúprincipal. Si hay hueco se mostrará la lista de clientes y se pedirá
 * introducir el número (posición en el array) del Cliente. Después se pedirán
 * los datos necesarios para
 * crear la pizza (tamaño y tipo).
 * Servir Pedido: Se mostrará un listado de los pedidos y se pedirá introducir
 * el número (posición en el array) del Pedido. El estado de la pizza de ese
 * pedido pasará de "pedida"
 * a "servida". Si ya estaba servida, se mostrará un mensaje de aviso indicando
 * que ese pedido ya ha sido servido y se volverá a mostrar el menú principal.
 * Salir: Se imprimirá toda la información sobre la pizzería, como en el caso 1,
 * y se saldrá del programa.
 * 
 * Pista: Todos los métodos a los que se llamará desde el main serán de la clase
 * Pizzeria. La clase Pizzería, internamente, utilizará las clases Cliente,
 * Pizza y Pedido
 */