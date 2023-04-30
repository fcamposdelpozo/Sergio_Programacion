public class Pedido {

    private Cliente cliente;
    private Pizza pizza;
  
    public Pedido(Cliente cliente, String tamanio, String tipo){
      Pizza pizza = new Pizza(tamanio, tipo);
      this.cliente = cliente;
      this.pizza = pizza;
    }

}