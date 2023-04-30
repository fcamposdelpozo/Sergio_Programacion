class MainArgs {
    public static void main(String[] args) {

        System.out.println("El array Args tiene: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("La posicion " + i + " del Array es: " + args[i]);
        }
        System.out.println();
        int variable = Integer.parseInt(args[0]);
        System.out.println("Variable = " + variable);
    }
}