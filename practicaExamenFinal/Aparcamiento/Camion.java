package practicaExamenFinal.Aparcamiento;

public class Camion extends Vehiculo {

    int numRuedas;

    public Camion(String matricula, int fecha, tipoVehiculo tipo, int numRuedas) {
        super(matricula, fecha, tipo);
        this.numRuedas = numRuedas;
    }

    public void cambiarRuedas(int numRuedas) {
        if (numRuedas >= 6) {
            System.out.println("Hay que cambiar las ruedas al camion");

        } else {
            System.out.println("No hay que cambiar las ruedas al camion");
            
        }
    }

    public String toString() {
        return super.toString() + "Numero de ruedas [ " + numRuedas + " ] ";
    }

}
