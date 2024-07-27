package org.codexdei.pooherencia;

public class Profesor extends Persona{

    private String materia;

    public Profesor(){
        System.out.println("inicializando el constructor PROFESOR");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String materia){
        super(nombre, apellido);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String saludar() {

        return "Buenos dias, yo soy " + getNombre() + " profesor@ de " + getMateria();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Materia='" + materia + "\n";
    }
}
