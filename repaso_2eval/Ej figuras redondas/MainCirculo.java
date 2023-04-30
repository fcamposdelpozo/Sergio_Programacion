public class MainCirculo{
    public static void main(String[] args) {

        final double radio = 1;
        final double pi = 3.141516;

        Circunferencia circunferencia = new Circunferencia(radio,pi);
        Circulo circulo = new Circulo(radio, pi);
        Esfera esfera = new Esfera(radio,pi);

        System.out.println(circunferencia);
        System.out.println(circulo);
        System.out.println(esfera);
    }

}