package EmpresaAgroalimentaria;

public class PCongAgua extends ProductosCongelados {

    public float salinidad;

    public PCongAgua(String f_caducidad, int n_lote, String f_envasado, String origen, int temp_mantenimiento,
            tipoCongelado tipo, float salinidad) {
        super(f_caducidad, n_lote, f_envasado, origen, temp_mantenimiento, tipo);
        this.salinidad = salinidad;
    }

    public void setSalinidad(float salinidad) {
        this.salinidad = salinidad;
    }

    public float getSalinidad() {
        return salinidad;
    }

    public String toString() {
        return super.toString() + " Salinidad[ " + salinidad + " ]";
    }

}
