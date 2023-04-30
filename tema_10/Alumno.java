package tema_10;

public class Alumno {

    public enum enumgenero{
        HOMBRE, MUJER, NB
    }

    public String nombre;
    public int edad;
    public int curso;
    public char letra;
    public enumgenero genero;

    public Alumno(String nombre, int edad, int curso, char letra, enumgenero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.letra = letra;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre + " [ genero= " + genero +", edad= " + edad + ", curso= " + curso + letra + " ]";
    }
    
    
}
