package curling;
import colegio.Fecha;
import enums.Turno;
public class Partido {
    Fecha dia;
    Turno turno;
    Equipo e1;
    Equipo e2;

    public Partido(Fecha dia, Turno turno, Equipo e1, Equipo e2){
        this.dia=dia;
        this.turno=turno;
        this.e1=e1;
        this.e2=e1;
    }
    public Partido(){
        this.dia=new Fecha(2,05,2025);
        this.turno=Turno.Manana;
    }
}
