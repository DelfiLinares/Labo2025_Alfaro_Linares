package vehiculos;
import java.time.LocalDate;
public class Bicicleta extends Vehiculo {
    public Bicicleta(String modelo, String marca, String color, int cant, LocalDate f){
        super(modelo,marca, color, cant, f);
    }
    public Bicicleta(){
      super();
    }

}
