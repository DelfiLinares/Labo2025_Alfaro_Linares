package drones;

import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) {
        Carga c1 = new Carga(15, 40, "Mavic", LocalDate.of(2024,6,5), 100, 4, Estado.VUELO, 100, 15.3689, 90.7123, true );
        Carga c2 = new Carga(5, 20, "Mavic", LocalDate.of(2025,2,1), 100, 4, Estado.OPERATIVO, 100, 35.4789, 96.2177, true );
        Vigilancia v1 = new Vigilancia("Mavic", LocalDate.of(2025,2,22), 100, 7, Estado.MANTENIMIENTO, 100, 80, 65.8889, 85.2289);
        Vigilancia v2 = new Vigilancia("Mavic", LocalDate.of(2025,5,16), 100, 3, Estado.OPERATIVO, 100, 90, 75.8339, 82.1211);
    }
}
