package p_figuras_redondas2;

public class Circulo2 extends FiguraRedonda {

    public Circulo2() {
        System.out.println("Construyendo circulo...");
    }

    public String detailsToString() {
        return String.format("Soy un círculo y mi superficie es %.2f", (radio * pi));
    }

}