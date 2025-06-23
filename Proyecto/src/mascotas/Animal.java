package mascotas;

import java.util.ArrayList;

public enum Animal {
    PERRO, GATO, PAJARO_C, PAJARO_NC;

    public static class Alta extends Mascota {
        ArrayList<Mascota> mascotas;

        public Alta(String nombre, Duenio duenio, Animal tipo, ArrayList<Mascota> mascotas) {
            super(nombre, duenio, tipo);
            this.mascotas = mascotas;
        }

        public Alta() {
            super();
        }

        @Override
        public void saludo() {

        }

        public void Mostrar(String nombre, Duenio duenio, Animal tipo) {
            System.out.println("Nombre de la mascota: " + nombre + ", el dueño de la mascota: " + duenio.getNombre() + " La mascota es un: " + tipo);
        }

        public void Eliminar(Mascota m1) {
            this.mascotas.remove(m1);
        }

        public void Modificar(Mascota mascota_nueva, Mascota m1) {
            for (Mascota aux : mascotas) {
                if (aux == m1) {
                    aux = mascota_nueva;
                }
            }
        }
    }

    public static class Menu {
        public void Saludar(Mascota m1, Duenio d1){

        }
    }
}
