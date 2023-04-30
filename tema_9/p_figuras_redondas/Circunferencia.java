package p_figuras_redondas;

public class Circunferencia{

    double radio;
    double diametro;
    double perimetro;

    public Circunferencia(double radio, double pi) {
        this.radio = radio;
        diametro= radio*2;

        perimetro = diametro * pi;
    }

    @Override
    public String toString() {

        String solCircunferencia;
        solCircunferencia= "\nConstruyendo una circunferencia de radio "+(String.format("%.0f", radio))+"\n";
        solCircunferencia= solCircunferencia+ "\tSoy una circunferencia de perimetro ";
        solCircunferencia= solCircunferencia + (String.format("%.2f", perimetro));

        return solCircunferencia;
    }
    
}
