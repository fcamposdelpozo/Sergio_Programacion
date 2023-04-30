public class Cliente{

    /*La clase Cliente tendrá los atributos nombre, apellido y posicionVehiculoAlquilado. 
    posicionVehiculoAlquilado será null cuando el cliente no tenga ningún vehículo alquilado. 
    Cada cliente solamente podrá alquilar un vehículo a la vez, no se pueden alquilar simultáneamente 2 o más vehículos por el mismo cliente.*/

    private String nombre, apellido,direccion,telefono;
    private int posicionClienteAlquiler;

    public Cliente(String nombre, String apellido,String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
                + telefono + ", posicionClienteAlquiler=" + posicionClienteAlquiler + "]";
    }

}