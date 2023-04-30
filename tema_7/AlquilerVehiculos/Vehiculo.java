public class Vehiculo{
    
    //La clase Vehiculo tendrá los atributos marca, modelo y posicionClienteAlquiler, que será null cuando el 
    //vehiculo esté disponible y tendrá la posición del cliente que lo ha alquilado cuando esté alquilado.

    private String marca,modelo;
    private int posicionClienteAlquiler;

    public Vehiculo(String marca, String modelo, int posicionClienteAlquiler) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", posicionClienteAlquiler="
                + posicionClienteAlquiler + "]";
    }
    
}