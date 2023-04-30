class MainFactorial {
    public static void main(String[] args) {

        final int n = 6;

        System.out.println(factorial(n));
    }

    public static int factorial(int num) {
        if(num==0){
            return 1;
        }
        int valor;
        valor = num * factorial(num - 1);
        return valor;
    }
}