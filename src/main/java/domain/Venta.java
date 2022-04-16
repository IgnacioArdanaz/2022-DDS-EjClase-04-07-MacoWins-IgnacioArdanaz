package domain;

import java.time.LocalDate;
import java.util.List;

public class Venta {
  private List<Articulo> articulos;
  private LocalDate fecha;

  public Double importe(){
    return this.articulos
        .stream()
        .mapToDouble(articulo -> articulo.importe())
        .sum();
  }

  public Boolean esDeFecha(LocalDate unaFecha){
    return this.fecha.equals(unaFecha);
  }
}
