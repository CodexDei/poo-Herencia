package org.codexdei.pooherencia;

public class Persona {

    protected String nombre;
    protected String apellido;
    private int edad;
    private String email;

    public Persona(){
        System.out.println("Inicializando constructor PERSONA");
    }

    public Persona(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){

        this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "¡Hey amig@!";
    }

    @Override
    public String toString() {

        return  "Nombre='" + nombre + "\n" +
                "Apellido='" + apellido + "\n" +
                "Edad=" + edad + "\n" +
                "Email='" + email + "\n";
    }
}
