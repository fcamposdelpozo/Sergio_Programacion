package p11_6;

public abstract class p11_6Maquina {

    String numSerie;
    String modelo;
    int horasFuncionamiento;
    boolean estado = false;

    public p11_6Maquina(String numSerie, String modelo, int horasFuncionamiento, boolean estado) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
        this.estado = estado;
    }

    public void encender(){
        //si esta encendida queremos que se apague y viceversa

        if(estado==true){
            System.out.println("La maquina ya estaba encendida.");
        }else{
            estado = true;
            System.out.println("Maquina encendida.");
        }
    }

    public void apagar(){
        //si esta encendida queremos que se apague y viceversa

        if(estado==false){
            System.out.println("La maquina ya estaba apagada.");
        }else{
            estado = false;
            System.out.println("Maquina apagada");
        }
    }

    @Override
    public String toString() {
        return "Maquina [numSerie=" + numSerie + ", modelo=" + modelo + ", horasFuncionamiento="
                + horasFuncionamiento + ", encendida=" + estado + ", ";
    }

    
}
