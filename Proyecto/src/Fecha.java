public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

   public Fecha(){
        this.dia=2;
        this.mes=6;
        this.anio=2008;
    }


    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }

    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }

    public void Valida(Fecha fechita){
        if(dia<32 && dia >0 && mes<13 && mes>0 && anio>0 && anio<2026) {
            System.out.println("Fecha válida");
        }
            else{
                System.out.println("Fecha inválida");
            }
    }

    public int CantDias(int mes) {
        int cantidad = 0;
        switch (mes) {
            case 1:
                cantidad = 31;
                break;
            case 3:
                cantidad = 31;
                break;
            case 5:
                cantidad = 31;
                break;
            case 7:
                cantidad = 31;
                break;
            case 8:
                cantidad = 31;
                break;
            case 10:
                cantidad = 31;
                break;
            case 12:
                cantidad = 31;
                break;
            case 4:
                cantidad = 30;
                break;
            case 6:
                cantidad = 30;
                break;
            case 9:
                cantidad = 30;
                break;
            case 11:
                cantidad = 30;
                break;
            case 2:
                cantidad = 28;
                break;

        } return cantidad;
    }

    public String Corta(Fecha fechita){
        String date=" ";
        String mesaux="";
        String diaaux="";
        if(mes<10){
            mesaux="0"+mes;
        }
        else{
            mesaux+=mes;
        }
        if(dia<10){
            diaaux="0"+dia;
        }
        else{
            diaaux+=dia;
        }
        date=diaaux+'-'+mesaux+'-'+anio;
        return date;
    }
   public String Larga(Fecha fechita){
        String date=" ";
        date="Día de la semana "+dia+" del mes "+mes+ " de "+anio;
        return date;
    }

    public int Siguiente(int dia){
        dia+=1;
        return dia;
    }
    public int Anterior(int dia){
        dia-=1;
        return dia;
    }

    public void Igual(Fecha fechita){
        Fecha aux= new Fecha(2,12,2016);

        if(fechita.dia==aux.dia && fechita.mes==aux.mes && fechita.anio==aux.anio){
            System.out.println("Fechas iguales");
        }
        else{
            System.out.println("Fechas diferentes");
        }
    }

    public String Menor(Fecha fechita){
        Fecha aux= new Fecha(2,12,2016);
        System.out.println("La fecha auxiliar es "+aux.dia+"-"+aux.mes+"-"+aux.anio);
        String respuesta;
      if(dia>aux.dia && mes>=aux.mes && anio>=aux.anio) {
          respuesta = "La fecha no es anterior a la auxiliar";
      }
      else if (dia<=aux.dia && mes<=aux.mes && anio>aux.anio){
          respuesta="La fecha no es anterior a la auxiliar";
      }
      else{
          respuesta="La fecha es anterior a la auxiliar";
        } return respuesta;
    }
 public String Mayor(Fecha fechita){
        Fecha aux= new Fecha(2,12,2016);
        System.out.println("La fecha auxiliar es "+aux.dia+"-"+aux.mes+"-"+aux.anio);
        String respuesta;
      if(dia>aux.dia && mes>=aux.mes && anio>=aux.anio) {
          respuesta = "La fecha es posterior a la auxiliar";
      }
      else if (dia<=aux.dia && mes<=aux.mes && anio>aux.anio){
          respuesta="La fecha es posterior a la auxiliar";
      }
      else{
          respuesta="La fecha no es posterior a la auxiliar";
        } return respuesta;
    }


    public static void main (String [] args) {
        Fecha fechita = new Fecha(1,12,2016);
        fechita.Valida(fechita);
        System.out.println("Cantidad de dias del mes "+fechita.mes+"= "+fechita.CantDias(fechita.mes));
        System.out.println("Formato corto: "+fechita.Corta(fechita));
        System.out.println("Formato largo: "+fechita.Larga(fechita));
        System.out.println("FECHA CAMBIADA: Avanzada");
        fechita.dia=fechita.Siguiente(fechita.dia);
        System.out.println("Formato corto: "+fechita.Corta(fechita));
        System.out.println("Formato largo: "+fechita.Larga(fechita));
        System.out.println("FECHA CAMBIADA: Retrocedida");
        fechita.dia=fechita.Anterior(fechita.dia);
        System.out.println("Formato corto: "+fechita.Corta(fechita));
        System.out.println("Formato largo: "+fechita.Larga(fechita));
        fechita.Igual(fechita);
        System.out.println( fechita.Menor(fechita));
        System.out.println( fechita.Mayor(fechita));


    }
}
