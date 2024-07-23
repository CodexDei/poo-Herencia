package org.codexdei.pooherencia;

public class EjemploHerencia {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();

        alumno.setNombre("Luis");
        alumno.setApellido("Castillo");

        Profesor profesor = new Profesor();
        profesor.setNombre("Maryi");
        profesor.setApellido("Mora");
        profesor.setMateria("Español");

        System.out.println(
        "La profesora '" + profesor.getNombre() + " " + profesor.getApellido() + "' "
         + "de " + "'" + profesor.getMateria() + "' " + "tiene como alumno a "
         + "'" + alumno.getNombre() + " " + alumno.getApellido() + "'"
        );
    }
}
