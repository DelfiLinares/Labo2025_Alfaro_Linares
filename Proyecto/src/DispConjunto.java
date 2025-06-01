import java.util.ArrayList;

public class DispConjunto extends Dispositivo{
    ArrayList<Dispositivo>dispositivos;

    public DispConjunto(String estado, int umbralI, int anio, ArrayList<Dispositivo> dispositivos) {
        super(estado, umbralI, anio);
        this.dispositivos = dispositivos;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public int  medidaTotal(){
        int medidaT=0;
        for(Dispositivo d:dispositivos){
            medidaT+=d.getMedida();
        }
        medidaT=medidaT/3;
        return medidaT;
    }
    public void alarmaCompuesta(){
        if(medidaTotal()>getUmbralI()){
            System.out.println("Se activó la alarma compuesta");
            System.out.println("-----------------------------");

        }
        else {
            System.out.println("El dispositivo compuesto no detectó disperfectos");
        }
    }
}
