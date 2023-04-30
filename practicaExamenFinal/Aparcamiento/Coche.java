package practicaExamenFinal.Aparcamiento;

public class Coche extends Vehiculo {

    float largo;
    String modelo;

    enum marcaCoche {
        AUDI, BMW, MERCEDES, OTRA
    }

    marcaCoche marca;

    public Coche(String matricula, int fecha, tipoVehiculo tipo, marcaCoche marca, String modelo, float largo) {
        super(matricula, fecha, tipo);
        this.marca = marca;
        this.largo = largo;
        this.modelo = modelo;
    }

    public void pasarRevision(marcaCoche marca) {

        if (marca == marcaCoche.AUDI) {
            System.out.println("Quedan 5 años para pasar la revision");
        }
        if (marca == marcaCoche.BMW) {
            System.out.println("Quedan 6 años para pasar la revision");
        }
        if (marca == marcaCoche.MERCEDES) {
            System.out.println("Quedan 7 años para pasar la revision");
        }
        if (marca == marcaCoche.OTRA) {
            System.out.println("Quedan 3 años para pasar la revision");
        }
    }

    public String toString() {
        return super.toString() + "Marca y Modelo [ " + marca + " " + modelo + " ] Largo [ " + largo + " ] ";
    }

}
