package p11_1;

public class p11_1persona {

    private String nombre;
    private int telefono;
    private int edad;

    public p11_1persona(String nombre, int telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + " ";
    }

    public String getNombre() {
        return nombre;
    } 

    
}
