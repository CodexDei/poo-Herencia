package org.codexdei.Ejemplo;

import org.codexdei.pooherencia.Alumno;
import org.codexdei.pooherencia.AlumnoInternacional;
import org.codexdei.pooherencia.Persona;
import org.codexdei.pooherencia.Profesor;

public class EjemploHerenciaContructores {

    public static void main(String[] args) {

        System.out.println("==============Creando instancia de la clase PERSONA con constructor ALUMNO===================");
        Persona alumna = new Alumno("Samy", "Acosta");
        //Se hace un cast para que el objeto "alumna" pueda usar el metodo setInstitucion
        //Realmente es algo innecesario ya que cambiando de tipo "Persona" a Alumno se puede acceder al
        //"setInstitucion sin hacer cast, al igual que los gets y sets tipo Persona porque la clase
        //Alumno ya hereda de Persona, solo es para mostrar como se hace un cast de objetos en caso
        //de que si sea necesario
        ((Alumno) alumna).setInstitucion("Inem");
        alumna.setEmail("Samy@correo.com");

        System.out.println("==============Creando instancia de la clase ALUMNO===================");

        Alumno alumno = new Alumno("Luis", "Castillo", 40,
        "Intituto Nacional",4.6,4.7,5.0);

        System.out.println("==============Creando instancia de la clase ALUMNO-INTER===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Jhon", "Macarthur",
                                                            "Estados Unidos");

        alumnoInt.setEdad(17);
        alumnoInt.setInstitucion("Inem");
        alumnoInt.setNotaIdiomas(4.9);
        alumnoInt.setNotaCastellano(3.0);
        alumnoInt.setNotaMatematicas(4.0);
        alumnoInt.setNotaProgramacion(3.5);

        System.out.println("==============Creando instancia de la clase PROFESOR===================");
        Profesor profesor = new Profesor("Maryi","Mora", "Español");
        profesor.setEdad(25);

        imprimir(alumna);
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

        //Otra forma de imprimir con ToString
        System.out.println(alumna.toString());
        System.out.println(alumno.toString());
        System.out.println(alumnoInt.toString());
        System.out.println(profesor.toString());
    }

    public static void imprimir(Persona persona){

        System.out.println("*********Inprimiendo datos basicos de persona*******************");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());

        if (persona.getEmail() != null){
            System.out.println("Email: " + persona.getEmail());
        } else {
            System.out.println("Email: Sin email");
        }

        if (persona instanceof Alumno){

            System.out.println("*********Imprimiendo datos basicos de Alumno*************");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            System.out.println("Nota Programacion: " + ((Alumno) persona).getNotaProgramacion());

            if (persona instanceof AlumnoInternacional){

                System.out.println("*********Imprimiendo datos basicos de Alumno Internacional*****************");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());

        }

        if (persona instanceof Profesor){

            System.out.println("*******************Imprimiendo datos basicos de profesor*******************");
            System.out.println("Materia: " + ((Profesor) persona).getMateria());
        }
        System.out.println("*******************SOBREESCRITURA DEL METODO SALUDAR*********************************");
        System.out.println(persona.saludar());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }
}
