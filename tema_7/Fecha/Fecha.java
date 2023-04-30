public class Fecha{

    public int dia;
    public int mes;
    public int anno;
    private int may;

    public boolean esBisiesto(){
        boolean checkbisiesto;
        if(((anno%4==0)||((anno%400==0)&&(anno%100==0))))
        {
            checkbisiesto=true;
        }
        else{
            checkbisiesto=false;
        }
        return checkbisiesto;
    }

    public void tiempoPasado(Fecha fechanac){
        System.out.println();
        if((anno>=fechanac.anno)&&(dia>=fechanac.dia)&&(mes>=fechanac.mes)){
                System.out.print("La fecha que has introducido es "+(anno - fechanac.anno)+ " años, " +
                (mes - fechanac.mes)+" meses y "+(dia - fechanac.dia)+ " mayor que mi fecha de nacimiento");
        }
        else{
            may = ((30*mes)+dia+(365*anno))-((30*fechanac.mes)+fechanac.dia+(365*fechanac.anno));
            System.out.print("La fecha que has introducido es "+may+ " dias mayor que la de mi nacimiento");
        }

        if(anno<fechanac.anno){
            System.out.print("La fecha introducida es menor que mi cumpleaños");
        }
    }

    public void formatoFecha(){
        System.out.println(dia +"/"+ mes + "/"+anno);
    }
}