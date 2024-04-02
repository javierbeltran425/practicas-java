package org.jbeltran.pooherencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaSociales;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaSociales() {
        return notaSociales;
    }

    public void setNotaSociales(double notaSociales) {
        this.notaSociales = notaSociales;
    }
}
