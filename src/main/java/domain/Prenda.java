package domain;

public class Prenda {
  private Estado estado;
  private Double precioBase;
  private Tipo tipo;

  public Double precio(){
    return this.estado.precioFinal(precioBase);
  }
}
