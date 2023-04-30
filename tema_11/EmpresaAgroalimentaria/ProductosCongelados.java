package EmpresaAgroalimentaria;

public abstract class ProductosCongelados extends ProductosGeneral {

    public enum tipoCongelado {
        Aire, Agua, Nitrogeno
    }

    String f_envasado;
    String origen;
    int temp_mantenimiento;
    tipoCongelado tipo;

    public ProductosCongelados(String f_caducidad, int n_lote, String f_envasado, String origen, int temp_mantenimiento,
            tipoCongelado tipo) {
        super(f_caducidad, n_lote);
        this.f_envasado = f_envasado;
        this.origen = origen;
        this.temp_mantenimiento = temp_mantenimiento;
        this.tipo = tipo;
    }

    public void setF_envasado(String f_envasado) {
        this.f_envasado = f_envasado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setTemp_mantenimiento(int temp_mantenimiento) {
        this.temp_mantenimiento = temp_mantenimiento;
    }

    public void setTipo(tipoCongelado tipo) {
        this.tipo = tipo;
    }

    public String getF_envasado() {
        return f_envasado;
    }

    public String getOrigen() {
        return origen;
    }

    public int getTemp_mantenimiento() {
        return temp_mantenimiento;
    }

    public tipoCongelado getTipo() {
        return tipo;
    }

    public String toString() {
        return "P_Congelado: F_Caducidad[ " + f_caducidad + " ] N_Lote[ " + n_lote + " ] F_envasado[ " + f_envasado
                + " ] Pais[ " + origen + " ] Conservar[ " + temp_mantenimiento + "·C ] Tipo[ " + tipo + " ]";
    }

}
