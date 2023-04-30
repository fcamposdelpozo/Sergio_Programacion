package EmpresaAgroalimentaria;

public class ProductosRefrigerados extends ProductosGeneral {

    String cod_supervision;
    String f_envasado;
    int temp_mantenimiento;
    String origen;

    public ProductosRefrigerados(String f_caducidad, int n_lote, String f_envasado, String origen,
            int temp_mantenimiento, String cod_supervision) {
        super(f_caducidad, n_lote);
        this.cod_supervision = cod_supervision;
        this.f_envasado = f_envasado;
        this.temp_mantenimiento = temp_mantenimiento;
        this.origen = origen;
    }

    public void setCod_supervision(String cod_supervision) {
        this.cod_supervision = cod_supervision;
    }

    public void setF_envasado(String f_envasado) {
        this.f_envasado = f_envasado;
    }

    public void setTemp_mantenimiento(int temp_mantenimiento) {
        this.temp_mantenimiento = temp_mantenimiento;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCod_supervision() {
        return cod_supervision;
    }

    public String getF_envasado() {
        return f_envasado;
    }

    public int getTemp_mantenimiento() {
        return temp_mantenimiento;
    }

    public String getOrigen() {
        return origen;
    }

    public String toString() {

        return "P_Refrigerado: F_Caducidad[ " + f_caducidad + " ] N_Lote[ " + n_lote + " ] F_envasado[ " + f_envasado
                + " ] Pais[ " + origen + " ] Cod_Sup[ " + cod_supervision + " ] Temp_conservacion[ "
                + temp_mantenimiento + "·C ]";
    }
}
