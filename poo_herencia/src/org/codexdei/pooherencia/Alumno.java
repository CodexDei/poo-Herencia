package org.codexdei.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaProgramacion;

    public Alumno(){
        System.out.println("Inicializando el constructor ALUMNO");
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){

        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                    double notaMatematicas, double notaCastellano, double notaProgramacion){

        this(nombre, apellido, edad, institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
        this.notaProgramacion = notaProgramacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    //metodos de la clase
    public double calcularPromedio(){

        return (notaMatematicas + notaCastellano + notaProgramacion) / 3;
    }

    @Override
    public String saludar() {
        String saludo = super.saludar();
        return saludo += " yo soy " + getNombre() + " alumno de la institucion " + getInstitucion();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Institucion='" + institucion +  "\n" +
                "NotaMatematicas=" + notaMatematicas + "\n" +
                "NotaCastellano=" + notaCastellano + "\n" +
                "NotaProgramacion=" + notaProgramacion + "\n" +
                "Promedio=" + calcularPromedio() + "\n";
    }
}
