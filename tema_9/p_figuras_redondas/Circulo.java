package p_figuras_redondas;
public class Circulo{
    
    double radio;
    double area;

    public Circulo(double radio, double pi) {
        this.radio = radio;

        area = (radio * radio) * pi;
    }

    @Override
    public String toString() {

        String solCirculo;
        solCirculo= "\nConstruyendo un circulo de radio "+(String.format("%.0f", radio))+"\n";
        solCirculo= solCirculo+ "\tSoy un circulo de area ";
        solCirculo= solCirculo + (String.format("%.2f", area));

        return solCirculo;
    }
    
}