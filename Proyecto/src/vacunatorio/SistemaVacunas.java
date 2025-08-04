package vacunatorio;

import general.Persona;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaVacunas {
    private HashSet<Ciudadano>ciudadanosVacunados=new HashSet<>();

    public SistemaVacunas(HashSet<Ciudadano>ciuds){
        this.ciudadanosVacunados=ciuds;

    }

    public HashSet<Ciudadano> getCiudadanosVacunados() {
        return ciudadanosVacunados;
    }

    public void setCiudadanosVacunados(HashSet<Ciudadano> ciudadanosVacunados) {
        this.ciudadanosVacunados = ciudadanosVacunados;
    }


    public void verVacunas(int dni){
        System.out.println("Lista de vacunas del ciudadano con DNI "+dni);
        for(Ciudadano ciuAux:this.ciudadanosVacunados){
            if(ciuAux.getDni()==dni){
                for(Vacuna vacAux:ciuAux.getListaVacunas()){
                    System.out.println("-"+vacAux.getNombre());
                }
            }
        }
    }

    public HashMap<Provincia, Integer> cantidadPorProvincia(){
        HashMap<Provincia, Integer> cantidadPorProv=new HashMap<Provincia,Integer>();
        for(Ciudadano aux: this.ciudadanosVacunados){
            if(!cantidadPorProv.containsKey(aux.getProvincia())){
                cantidadPorProv.put(aux.getProvincia(),1);
            }else{
                cantidadPorProv.put(aux.getProvincia(),cantidadPorProv.get(aux.getProvincia())+1);
            }

        }return cantidadPorProv;
    }

    public HashSet<Ciudadano> tieneCiertaCantidad(int cantidad){
        HashSet<Ciudadano>ciudsQueCumplen=new HashSet<>();
        for(Ciudadano aux: this.ciudadanosVacunados){
            if(aux.getListaVacunas().size()>=cantidad){
                ciudsQueCumplen.add(aux);
            }
        }return ciudsQueCumplen;
    }

    public HashSet<Ciudadano> ciudsAplicaronVacuna(Vacuna vacunaAplicada){
        HashSet<Ciudadano>ciudsQueCumplen=new HashSet<>();
        for(Ciudadano aux: this.ciudadanosVacunados){
          if(aux.getListaVacunas().contains(vacunaAplicada)){
              ciudsQueCumplen.add(aux);
          }
        }
        return ciudsQueCumplen;
    }







    public static void main(String args[]) {
        //vacunasss
        Vacuna vac1 = new Vacuna(LocalDate.of(2024, 12, 23), LocalDate.now(), 21, 4567, "Anigripal");
        Vacuna vac2 = new Vacuna(LocalDate.of(2024, 9, 7), LocalDate.now(), 89, 210, "Hepatitis B");
        Vacuna vac3 = new Vacuna(LocalDate.of(2025, 3, 16), LocalDate.now(), 45, 110, "Hepatitis A");

        //ciudadanoss
        HashSet<Vacuna> listaVac1 = new HashSet<Vacuna>();
        listaVac1.add(vac1);
        listaVac1.add(vac2);
        HashSet<Vacuna> listaVac2 = new HashSet<Vacuna>();
        listaVac2.add(vac2);
        listaVac2.add(vac3);
        Ciudadano ciu1=new Ciudadano("Eugenio","Lesertesseur",48362738, LocalDate.of(2007,11,2),Provincia.CHUBUT,"eugeles@gmail.com",listaVac1);
        Ciudadano ciu2=new Ciudadano("Abril","Tedesco",48456789,LocalDate.of(2007,12,20),Provincia.TIERRA_DEL_FUEGO,"abyted@gmail.com",listaVac2);
        Ciudadano ciu3=new Ciudadano("Delfina","Linares",50124563,LocalDate.of(2008,6,2),Provincia.CHUBUT,"delfilinpat@gmail.com",listaVac2);

        //lista de ciudadanos vacunados
        HashSet<Ciudadano>ciudadanosVacs=new HashSet<Ciudadano>();
        ciudadanosVacs.add(ciu1);
        ciudadanosVacs.add(ciu2);
        ciudadanosVacs.add(ciu3);


        SistemaVacunas sistema=new SistemaVacunas(ciudadanosVacs);
        Vacuna vac4 = new Vacuna(LocalDate.of(2025, 3, 28), LocalDate.now(), 32, 457, "Antitetánica");
        ciu2.agregarVacuna(vac4);
        sistema.verVacunas(48456789);

        System.out.println("Ciudadanos que cumplen con 2 vacunas");
        for(Ciudadano aux: sistema.tieneCiertaCantidad(2)){
            System.out.println("-"+aux.getNombre()+" "+aux.getApellido());
        }

        System.out.println("Ciudadanos que se aplicaron la Antitetánica");
        for(Ciudadano aux: sistema.ciudsAplicaronVacuna(vac4)){
            System.out.println("-"+aux.getNombre()+" "+aux.getApellido());
        }

        System.out.println("Cantidad de ciudadanos vacunados por provincia");
        for(Map.Entry<Provincia,Integer> auxHashMap:sistema.cantidadPorProvincia().entrySet()){
            String provincia= auxHashMap.getKey().toString();
            int cantidad= auxHashMap.getValue();
            System.out.println(provincia+","+cantidad);
        }
    }
}
