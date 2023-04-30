public class Esfera{
    
    double radio;
    double volumen;

    public Esfera(double radio, double pi) {
        this.radio = radio;

        volumen = (1.33333) * pi * (radio * radio * radio);
    }

    @Override
    public String toString() {

        String solEsfera;
        solEsfera= "\nConstruyendo una esfera de radio "+(String.format("%.0f", radio))+"\n";
        solEsfera= solEsfera+ "\tSoy una efera de volumen ";
        solEsfera= solEsfera + (String.format("%.2f", volumen));

        return solEsfera;
    }
}