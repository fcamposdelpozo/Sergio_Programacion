package p11_1;

public class p11_1trabajador extends p11_1persona{

    public enum categoria{A,B,C};
    public categoria categoriaProfesional;
    public int antiguedad;
    
    public p11_1trabajador(String nombre, int telefono, int edad, categoria categoriaProfesional, int antiguedad) {
        super(nombre, telefono, edad);
        this.categoriaProfesional = categoriaProfesional;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString()+"categoriaProfesional=" + categoriaProfesional + ", antiguedad=" + antiguedad + "]";
    }
}
