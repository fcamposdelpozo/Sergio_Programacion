package practicaExamenFinal.Aparcamiento;

public abstract class Vehiculo {

    enum tipoVehiculo {
        COCHE, CAMION
    }

    String matricula;
    int fecha;
    tipoVehiculo tipo;

    public Vehiculo(String matricula, int fecha, tipoVehiculo tipo) {
        this.matricula = matricula;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public float calcularImporte(tipoVehiculo tipo, float largo, int ruedas) {

        if (tipo == tipoVehiculo.COCHE) {
            return largo * 5;
        }
        if (tipo == tipoVehiculo.CAMION) {
            return ruedas * 15;
        }
        return 0;

    }

    public String toString() {
        return tipo + " - Matricula [ " + matricula + " ] ";
    }

}