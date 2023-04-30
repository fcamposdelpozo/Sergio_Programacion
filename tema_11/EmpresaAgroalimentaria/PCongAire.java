package EmpresaAgroalimentaria;

public class PCongAire extends ProductosCongelados {

    float cantOxigeno;
    float cantDioxido;
    float cantNitrogeno;

    public PCongAire(String f_caducidad, int n_lote, String f_envasado, String origen, int temp_mantenimiento,
            tipoCongelado tipo, float cantOxigeno, float cantDioxido, float cantNitrogeno) {
        super(f_caducidad, n_lote, f_envasado, origen, temp_mantenimiento, tipo);
        this.cantOxigeno = cantOxigeno;
        this.cantDioxido = cantDioxido;
        this.cantNitrogeno = cantNitrogeno;
    }

    public void setCantOxigeno(float cantOxigeno) {
        this.cantOxigeno = cantOxigeno;
    }

    public void setCantDioxido(float cantDioxido) {
        this.cantDioxido = cantDioxido;
    }

    public void setCantNitrogeno(float cantNitrogeno) {
        this.cantNitrogeno = cantNitrogeno;
    }

    public float getCantOxigeno() {
        return cantOxigeno;
    }

    public float getCantDioxido() {
        return cantDioxido;
    }

    public float getCantNitrogeno() {
        return cantNitrogeno;
    }

    public String toString() {
        return super.toString() + " O2[ " + cantOxigeno + "% ] CO2[ " + cantDioxido + "% ] N[ "
                + cantNitrogeno + "% ]";
    }

}
