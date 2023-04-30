class PruebaComparadoes{
    public static void main(String[] args) {

        float uno = 0.1f;
        float dos = 0.2f;

        float suma = dos+uno;

        float epsilon = 0.001f;

        if(dos>uno){
            System.out.println("0.2f es mayor que 0.1");
        }

        if((suma)==0.3){
            System.out.println("Podemos usar == para comparar floats");
        }else{
            System.out.println("No podemos usar == con floats");
        }

        if((Math.abs(suma)-0.3)<epsilon){
            System.out.println("Debemos usar epsilon para comparar los floats ");
        }
        
    }
}