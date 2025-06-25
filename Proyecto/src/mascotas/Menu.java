package mascotas;

import java.util.ArrayList;

public class Menu {
    ArrayList<Mascota>mascotas;

    public Menu(ArrayList<Mascota>mascotas){
        this.mascotas=mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void alta(Mascota m1){
        mascotas.add(m1);
    }

    public void eliminar(Mascota m1){
        mascotas.remove(m1);
    }
    public void modificar(Mascota m1, Mascota mNueva){
        for (Mascota aux : mascotas) {
            if (aux == m1) {
                aux = mNueva;
            }
        }
    }

    public void saludoDuenio(Mascota m, Duenio d){
        m.saludo(d);
    }
    public static void main(String[] args) {
        Perro p1=new Perro("Nubebecito",new Duenio("Delfi","Linares"), Animal.PERRO, 9);
        Pez pz1=new Pez("Darwin",new Duenio("Cande","Malempré"), Animal.PEZ,4);
        Pajaro pj1=new Pajaro("Lili",new Duenio("Aby","Tedisk"),true, Animal.PAJARO, 7);
        ArrayList<Mascota>mascotas=new ArrayList<>();
        mascotas.add(p1);
        mascotas.add(pz1);
        mascotas.add(pj1);
        Menu m1=new Menu(mascotas);


    }
}
