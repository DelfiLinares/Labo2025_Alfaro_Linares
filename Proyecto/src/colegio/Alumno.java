package colegio;

import videoclub.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
        private ArrayList<Integer> notas;
        private ArrayList<Materia>materia;


        public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, ArrayList<Integer>notas, ArrayList<Materia>materia) {
           super(nombre, apellido, fechaNacimiento);
            this.notas=notas;
            this.materia=materia;
    }
        public Alumno(String nombre, LocalDate fechaNacimiento, ArrayList<Integer>notas){
            super(nombre, fechaNacimiento);
            this.notas=notas;
        }

        public Alumno(){
         super();
            this.notas=new ArrayList<Integer>();
            this.materia=new ArrayList<Materia>();
            notas.add(3);
            notas.add(9);
            notas.add(7);
        }

        public ArrayList<Integer> getNotas() {
            return notas;
        }
        public void setNotas(ArrayList<Integer> notas) {
            this.notas = notas;
        }

        public ArrayList<Materia> getMateria() {
            return materia;
        }

        public void setMaterias(ArrayList<Materia> materia) {
            this.materia = materia;
        }

        public int mayorNota(Alumno alum){
                int mayor=notas.get(0);
                for(int i=0;i<this.notas.size();i++){;
                    if(mayor<notas.get(i)){
                        mayor=notas.get(i);
                    }
                }return mayor;
            }

        public int menorNota(Alumno alum){
            int menor=notas.get(0);
            for(int i=0;i<this.notas.size();i++){;
                if(menor>notas.get(i)){
                    menor=notas.get(i);
                }
            }return menor;
        }
        public void agregarNota(int ingreso){
            notas.add(ingreso);
            System.out.println("Se agregó nota; "+ingreso);
        }
        public void agregarMateria(Materia mati){
            materia.add(mati);
            System.out.println("Se agregó materia: "+ mati.getNombre());
        }




        public static void main (String [] args) {
                ArrayList<String>listaContenidos=new ArrayList<String>();
                listaContenidos.add("Verb to-be");
                listaContenidos.add("Future perfect");
                listaContenidos.add("Present perfect");

                ArrayList<Alumno>alumnosInscriptos=new ArrayList<Alumno>();
               // alumnosInscriptos.add(new colegio.Alumno("Delfina", "Lithium", new Fecha(2, 6, 2008), new ArrayList<Integer>());

                Materia mat= new Materia("Ingles", listaContenidos,alumnosInscriptos);

                ArrayList<Integer>notas=new ArrayList<Integer>();
                notas.add(6);
                notas.add(7);
                notas.add(1);
                ArrayList<Materia>materias=new ArrayList<Materia>();
                materias.add(new Materia());

                Alumno a1=new Alumno("Carlita","Wolf",LocalDate.of(1,2,2023), notas, materias);
                System.out.println("Mayor nota de "+a1.getNombre() +" es: "+a1.mayorNota(a1));
                System.out.println("Menor nota de "+a1.getNombre() +" es: "+a1.menorNota(a1));
                a1.agregarNota(4);
                a1.agregarMateria(mat);
            }

}