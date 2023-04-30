package p_figuras_redondas2;

public abstract class FiguraRedonda {

    float radio = 1;
    float pi = 3.141516f;
  
    public FiguraRedonda(){
      System.out.printf("Construyendo figuraRedonda...\t");
    }
  
    public abstract String detailsToString();
  
    @Override
    public String toString() {
      return detailsToString();
    }
  
  }