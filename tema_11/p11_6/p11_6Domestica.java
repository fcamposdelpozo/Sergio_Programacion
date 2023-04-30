package p11_6;

public class p11_6Domestica extends p11_6Maquina{

    int numSerieDomestica;
    int contador=0;

    public p11_6Domestica(String numSerie, String modelo, int horasFuncionamiento, boolean estado,
            int numSerieDomestica) {
        super(numSerie, modelo, horasFuncionamiento, estado);
        this.numSerieDomestica = numSerieDomestica;
    }

    public void usarDomestica(){
        if(estado==false){
            System.out.println("No se puede usar la máquina ya que esta apagada, debes encenderla primero");
        }else{
            contador++;
            System.out.println("Maquina D operativa, con numero de serie: "+numSerieDomestica+" usada "+contador+" veces");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"numSerieDomestica=" + numSerieDomestica + ", contador=" + contador + " - DOMESTICA ]";
    }

    
    
}
