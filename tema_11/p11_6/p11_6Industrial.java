package p11_6;

public class p11_6Industrial extends p11_6Maquina{

    int potenciaConsumo;

    public p11_6Industrial(String numSerie, String modelo, int horasFuncionamiento, boolean estado,
            int potenciaConsumo) {
        super(numSerie, modelo, horasFuncionamiento, estado);
        this.potenciaConsumo = potenciaConsumo;
    }

    public void usarIndustrial(){
        if(estado==false){
            System.out.println("No se puede usar la máquina ya que esta apagada, debes encenderla primero");
        }else{
            potenciaConsumo=potenciaConsumo+20;
            System.out.println("La maquina I ha aumentado su potencia a :"+potenciaConsumo);
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "potenciaConsumo=" + potenciaConsumo + " - INDUSTRIAL ]";
    }

    
    
}
