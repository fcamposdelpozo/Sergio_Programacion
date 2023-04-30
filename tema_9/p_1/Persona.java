package p_1;
public class Persona{
    
    private String nombre;
    private String telefono;
    private String edad;
    private int contador;
    
    
    public Persona(String nombre, String telefono, String edad, int contador) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.contador=contador;
    }


    @Override
    public String toString() {
        return "Persona"+contador+": [nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + "]";
    }


    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    } 
}