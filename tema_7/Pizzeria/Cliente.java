public class Cliente {

    private String nombreCliente, apellidosCliente, direccionCliente, telefonoCliente;

    public Cliente(String nombreCliente, String apellidosCliente, String direccionCliente, String telefonoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public String toString() {
        return apellidos + ", " + nombre + "; direccion: " + direccion + "; telefono: " + telefono;
    }

    /*
     * public void setNombreCliente(String dato){
     * dato = nombreCliente;
     * }
     * public String getNombreCliente(){
     * return nombreCliente;
     * }
     * 
     * public void setApellidosCliente(String dato){
     * dato = ApellidosCliente;
     * }
     * public String getApellidosCliente(){
     * return apellidosCliente;
     * }
     * 
     * public void setDireccionCliente(String dato){
     * dato = direccionCliente;
     * }
     * public String getDireccionCliente(){
     * return direccionCliente;
     * }
     * 
     * public void setTelefonoCliente(String dato){
     * dato = telefonoCliente;
     * }
     * public String getTelefonoCliente(){
     * return telefonoCliente;
     * }
     */
}