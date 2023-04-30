package EmpresaAgroalimentaria;

public abstract class ProductosGeneral {

    public String f_caducidad;
    int n_lote;

    public ProductosGeneral(String f_caducidad, int n_lote) {
        this.f_caducidad = f_caducidad;
        this.n_lote = n_lote;
    }

    public void setF_caducidad(String f_caducidad) {
        this.f_caducidad = f_caducidad;
    }

    public void setN_lote(int n_lote) {
        this.n_lote = n_lote;
    }

    public String getF_caducidad() {
        return f_caducidad;
    }

    public int getN_lote() {
        return n_lote;
    }

}
