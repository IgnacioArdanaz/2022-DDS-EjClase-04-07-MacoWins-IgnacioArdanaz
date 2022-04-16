package domain;

public class Promocion {
  private Double valorFijo;

  public Double precioFinal(Double precioBase){
    return precioBase - this.valorFijo;
  }
}
