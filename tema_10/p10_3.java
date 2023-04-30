package tema_10;

import java.util.ArrayList;
import java.util.List;
import tema_10.Alumno.enumgenero;

public class p10_3{
    public static void main(String[] args) {
    
        List<Alumno> alumnos = new ArrayList<>();
    
        Alumno alumno01 = new Alumno("Sara",22,4,'A',enumgenero.MUJER);
        alumnos.add(alumno01);

        Alumno alumno02 = new Alumno("Miguel",21,4,'A',enumgenero.HOMBRE);
        alumnos.add(alumno02);

        Alumno alumno03 = new Alumno("Max",24,5,'C',enumgenero.NB);
        alumnos.add(alumno03);

        Alumno alumno04 = new Alumno("Sergio",24,3,'B',enumgenero.HOMBRE);
        alumnos.add(alumno04);

        Alumno alumno05 = new Alumno("Lucia",20,3,'A',enumgenero.MUJER);
        alumnos.add(alumno05);

        for(Alumno alum:alumnos){
            System.out.println(alum);        
        }
    
    }


    
}
