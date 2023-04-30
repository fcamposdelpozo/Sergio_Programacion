package p11_2;

public abstract class p11_2persona {

    String nombre;
    int edad;
    String dni;

    public p11_2persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Boolean esMayorDeEdad(){
        if(edad>=18){
            return true;
        }
        return false;
    }

    //voy a poner como que si la ultima letra es A B o C no sea valido para ahorrar tiempo
    public Boolean dniValido(String dni){
        char letra9 = dni.charAt(8);
        if(letra9=='A'||letra9=='B'||letra9=='C'){
            return false;
        }
        return true;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre + ": edad=" + edad + ", dni=" + dni + " ";
    }   
}
