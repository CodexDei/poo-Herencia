package org.codexdei.Ejemplo;

import org.codexdei.pooherencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println("==============Creando instancia de la clase PERSONA con constructor ALUMNO===================");
        Persona alumna = new Alumno();
        alumna.setNombre("Samy");
        alumna.setApellido("Acosta");
        //Se hace un cast para que el objeto "alumna" pueda usar el metodo setInstitucion
        //Realmente es algo innecesario ya que cambiando de tipo "Persona" a Alumno se puede acceder al
        //"setInstitucion sin hacer cast, al igual que los gets y sets tipo Persona porque la clase
        //Alumno ya hereda de Persona, solo es para mostrar como se hace un cast de objetos en caso
        //de que si sea necesario
        ((Alumno)alumna).setInstitucion("Inem");

        System.out.println("==============Creando instancia de la clase ALUMNO===================");

        Alumno alumno = new Alumno();

        alumno.setNombre("Luis");
        alumno.setApellido("Castillo");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaMatematicas(4.5);
        alumno.setNotaCastellano(4.8);
        alumno.setNotaProgramacion(5.0);


        System.out.println("==============Creando instancia de la clase ALUMNO-INTER===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();

        alumnoInt.setNombre("Jhon");
        alumnoInt.setApellido("Macarthur");
        alumnoInt.setPais("Estados Unidos");
        alumnoInt.setEdad(17);
        alumnoInt.setInstitucion("Inem");
        alumnoInt.setNotaIdiomas(4.9);
        alumnoInt.setNotaCastellano(4.0);
        alumnoInt.setNotaMatematicas(4.7);
        alumnoInt.setNotaProgramacion(4.0);

        System.out.println("==============Creando instancia de la clase PROFESOR===================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Maryi");
        profesor.setApellido("Mora");
        profesor.setMateria("Español");

        System.out.println("****************************************************************************************");
        System.out.println(
        "La profesora '" + profesor.getNombre() + " " + profesor.getApellido() + "' "
         + "de " + "'" + profesor.getMateria() + "' " + "tiene como alumno a "
         + "'" + alumno.getNombre() + " " + alumno.getApellido() + "'" + " y tambien a la alumna "
         + "'" + alumna.getNombre() + " " + alumna.getApellido() + "'" + " de la institucion " + "'"
         + ((Alumno) alumna).getInstitucion() + "'"
        );

        //Va mostrando las diferentes clases hijas y padres
        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es la clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
