package domain;

import java.time.LocalDate;
import java.util.List;

public class RegistroVentas {
  private List<Venta> ventas;

  public Double gananciasDeFecha(LocalDate fecha){
    return this.ventas
        .stream()
        .filter(venta -> venta.esDeFecha(fecha))
        .mapToDouble(venta -> venta.importe())
        .sum();
  }
}
