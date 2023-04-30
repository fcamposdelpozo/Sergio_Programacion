package EmpresaAgroalimentaria;

public class ProductosFrescos extends ProductosGeneral {

    String f_envasado;
    String origen;

    public ProductosFrescos(String f_caducidad, int n_lote, String f_envasado, String origen) {
        super(f_caducidad, n_lote);
        this.f_envasado = f_envasado;
        this.origen = origen;
    }

    public void setF_envasado(String f_envasado) {
        this.f_envasado = f_envasado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getF_envasado() {
        return f_envasado;
    }

    public String getOrigen() {
        return origen;
    }

    public String toString() {

        return "P_Fresco: F_Caducidad[ " + f_caducidad + " ] N_Lote[ " + n_lote + " ] F_envasado[ " + f_envasado
                + " ] Pais[ " + origen + " ]";
    }

}
