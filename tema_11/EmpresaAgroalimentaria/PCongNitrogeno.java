package EmpresaAgroalimentaria;

public class PCongNitrogeno extends ProductosCongelados {

    float tExposicion;

    public PCongNitrogeno(String f_caducidad, int n_lote, String f_envasado, String origen, int temp_mantenimiento,
            tipoCongelado tipo, float tExposicion) {
        super(f_caducidad, n_lote, f_envasado, origen, temp_mantenimiento, tipo);
        this.tExposicion = tExposicion;
    }

    public void settExposicion(float tExposicion) {
        this.tExposicion = tExposicion;
    }

    public float gettExposicion() {
        return tExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + " Tiempo_Exposicion[ " + tExposicion + " seg ]";
    }

}
