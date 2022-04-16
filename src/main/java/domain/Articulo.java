package domain;

public class Articulo {
  private Prenda prenda;
  private Integer cantidad;

  public Double importe(){
    return this.prenda.precio() * cantidad;
  }
}
