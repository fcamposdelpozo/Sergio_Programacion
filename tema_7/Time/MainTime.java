public class MainTime {
    public static void main(String[] args) {
        Time medianoche = new Time(00, 00);
        Time mediodia = new Time(12, 00, 00);
        /*
         *
         * La línea que instancia el objeto de la clase Time llamado tiempoPorDefecto,
         * no compila. Al fallar la instanciación, tampoco podemos imprimir
         * tiempoPorDefecto.
         * Encuentra el porqué y haz el cambio necesario **en el fichero Time.java**
         * para que descomentando las líneas que instancian e imprimen tiempoPorDefecto,
         * el
         * programa compile.
         */

        Time tiempoPorDefecto = new Time();

        System.out.println("medianoche es " + medianoche);
        System.out.println("mediodia es " + mediodia);
        System.out.println("El valor de tiempoPorDefecto es " + tiempoPorDefecto);

        final int quince = 15;
        final int treinta = 30;
        final int noventa = 90;

        if (medianoche.addMinutes(quince)) {
            System.out.println("Después de ejecutar medianoche.addMinutes(quince), \t\tmedianoche es "
                    + medianoche);
        } else {
            System.err.println("Error: medianoche.addMinutes(quince) ha devuelto false. medianoche"
                    + " es " + medianoche);
        }

        if (medianoche.addSeconds(treinta)) {
            System.out.println("Después de ejecutar medianoche.addSeconds(treinta), \t\tmedianoche es "
                    + medianoche);
        } else {
            System.err.println("Error: medianoche.addSeconds(treinta) ha devuelto false. medianoche"
                    + " es " + medianoche);
        }

        if (medianoche.addSeconds(noventa)) {
            System.out.println("Después de ejecutar medianoche.addSeconds(noventa), \t\tmedianoche es "
                    + medianoche);
        } else {
            System.err.println("Error: medianoche.addSeconds(noventa) ha devuelto false. medianoche"
                    + " es " + medianoche);
        }

        if (mediodia.addMinutes(noventa)) {
            System.out.println("Después de ejecutar mediodia.addMinutes(noventa), \t\tmediodia es "
                    + mediodia);
        } else {
            System.err.println("Error: mediodia.addMinutes(noventa) ha devuelto false. "
                    + "mediodia es " + mediodia);
        }

        if (mediodia.addHoras(quince)) {
            System.out.println("Después de ejecutar mediodia.addHoras(quince)="
                    + quince + "), \t\tmediodia es " + mediodia);
        } else {
            System.err.println("Error: mediodia.addHoras(quince) ha devuelto false. mediodia es "
                    + mediodia);
        }

        /*
         * TODO
         * Añade el código que necesites para probar todos los casos de uso de los
         * métodos addSeconds,
         * addMinutes y addHoras, y comprobar que los incrementos de tiempo se comportan
         * como se
         * espera: el valor de hora se encuentra entre 0 y 23, el valor de minuto entre
         * 0 y 59 y el
         * de segundo también entre 0 y 59.
         */

        if (tiempoPorDefecto.addHoras(22)) {
            System.out.println(
                    "Después de ejeutar tiempoporDefecto.addHoras(22)=" + 22 + "), \t\ttiempoPorDefecto nos da "
                            + tiempoPorDefecto);
        } else {
            System.out.println(
                    "Error: tiempoPorDefecto.addHoras(22) ha devuelto false. tiempoPorDefecto es " + tiempoPorDefecto);
        }

        if (tiempoPorDefecto.addSeconds(75)) {
            System.out.println("Después de ejecutar tiempoPorDefecto.addSeconds(75)=" + 75 + "), \ttiempoPorDefecto es "
                    + tiempoPorDefecto);
        } else {
            System.out.println("Error: mediodia.addHoras(75) ha devuelto false. mediodia es " + mediodia);
        }

        if (tiempoPorDefecto.addMinutes(90)) {
            System.out.println("Después de ejecutar tiempoPorDefecto.addmins(90)=" + 90 + "), \t\ttiempoPorDefecto es  "
                    + tiempoPorDefecto);
        } else {
            System.out.println(
                    "Error: tiempoPorDefecto.ddminutes(90) ha devuelto false. tiempoPorDefecto es " + tiempoPorDefecto);
        }

        if (tiempoPorDefecto.addMinutes(90)) {
            System.out.println("Después de ejecutar tiempoPorDefecto.addmins(90)=" + 90 + "), \t\ttiempoPorDefecto es  "
                    + tiempoPorDefecto);
        } else {
            System.out.println(
                    "Error: tiempoPorDefecto.ddminutes(90) ha devuelto false. tiempoPorDefecto es " + tiempoPorDefecto);
        }
    }
}