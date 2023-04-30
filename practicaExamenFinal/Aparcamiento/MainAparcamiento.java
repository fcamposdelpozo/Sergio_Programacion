package practicaExamenFinal.Aparcamiento;

//import practicaExamenFinal.Aparcamiento.*;
import practicaExamenFinal.Aparcamiento.Coche.marcaCoche;
import practicaExamenFinal.Aparcamiento.Vehiculo.tipoVehiculo;

import java.util.ArrayList;
import java.util.List;


public class MainAparcamiento {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        Coche coche01 = new Coche("1567T", 12, tipoVehiculo.COCHE, marcaCoche.AUDI, "B2", 12.5f);
        vehiculos.add(coche01);

        Camion camion01 = new Camion("22E68", 22, tipoVehiculo.CAMION, 8);
        vehiculos.add(camion01);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        
    }
}
