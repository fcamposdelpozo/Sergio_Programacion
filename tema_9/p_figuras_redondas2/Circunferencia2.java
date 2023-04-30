package p_figuras_redondas2;

public class Circunferencia2 extends FiguraRedonda {

    public Circunferencia2() {
        System.out.println("Construyendo circunferencia...");
    }

    public String detailsToString() {
        return String.format("Soy una Circunferencia y mi perimetro es %.2f", ((2 * radio) * pi));
    }

}
