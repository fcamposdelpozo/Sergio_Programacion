package p_figuras_redondas2;

public class Esfera2 extends FiguraRedonda {

    public Esfera2() {
        System.out.println("Construyendo esfera...");
    }

    public String detailsToString() {
        return String.format("Soy una esfera y mi volumen es %.2f", (4.0 / 3.0 * radio * pi));
    }

}