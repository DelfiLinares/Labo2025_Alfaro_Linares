package mascotas;

import java.util.ArrayList;

public class Menu {
    public void alta(Mascota m1, ArrayList<Mascota>mascotas){
        mascotas.add(m1);
    }

    public void eliminar(Mascota m1, ArrayList<Mascota>mascotas){
        mascotas.remove(m1);
    }
    public void modificar(Mascota m1, Mascota mNueva, ArrayList<Mascota>mascotas){
        for (Mascota aux : mascotas) {
            if (aux == m1) {
                aux = mNueva;
            }
        }
    }

    public void actualizacion(ArrayList<Mascota>mascotas){
        for(Mascota aux: mascotas){
            if(aux instanceof Pez){
                //para eliminar a los peces sin vida del array
            }
        }
    }

    public static void main(String[] args) {
        Perro p1=new Perro("Nubebecito",new Duenio("Delfi","Linares"), Animal.PERRO, 9);
        Pez pz1=new Pez("Darwin",new Duenio("Cande","Malempre"), Animal.PEZ,7);
        Pajaro pj1=new Pajaro("Lili",new Duenio("Aby","Tedisk"),true, Animal.PAJARO, 7);
        ArrayList<Mascota>mascotas=new ArrayList<>();
        mascotas.add(p1);
        mascotas.add(pz1);
        mascotas.add(pj1);
        pz1.saludoDuenio(new Duenio("Cande","Malempre"));
        pz1.alimentar();
        pz1.saludoDuenio(new Duenio("Cande","Matambre"));
        pz1.clase();;

        p1.saludoDuenio(new Duenio("Delfi","Linares"));
        p1.alimentar();
        p1.saludoDuenio(new Duenio("Delfi","Lampara"));

        pj1.saludoDuenio(new Duenio("Aby", "Tedisk"));
        pj1.alimentar();
        pj1.saludoDuenio(new Duenio("Aby", "Tedesco"));

    }
}
