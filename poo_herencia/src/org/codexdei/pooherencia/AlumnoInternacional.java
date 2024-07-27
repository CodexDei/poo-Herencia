package org.codexdei.pooherencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Inicializando el constructor ALUMNO-INTERNACIONAL");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){

        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3) + notaIdiomas) / 4;
    }

    @Override
    public String saludar(){

        return super.saludar() + ", I am international student from " + getPais();
    }

    @Override
    public String toString() {
        //Se usa replace para que no se repita la informacion del "promedio" de la clase Alumno ya que esta tambien
        //debe estar en ambos porque se debe poder mostrar un promedio de notas tanto en Alumno como Alumno internacional
        return  super.toString().replace("Promedio=" + calcularPromedio() + "\n", "") +
                "NotaIdiomas=" + notaIdiomas + "\n" +
                "Promedio=" + calcularPromedio() + "\n" +
                "Pais = " + pais + "\n";
    }
}
