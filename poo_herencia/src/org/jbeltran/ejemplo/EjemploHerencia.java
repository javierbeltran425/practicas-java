package org.jbeltran.ejemplo;

import org.jbeltran.pooherencia.Alumno;
import org.jbeltran.pooherencia.AlumnoInternacional;
import org.jbeltran.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Andrea");
        alumno.setApellido("Mejia");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaSociales(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaSociales(5.8);
        alumnoInt.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Morice");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + ", " + alumno.getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("Alumno: " + alumnoInt.getNombre() + " " + alumnoInt.getApellido() + ", " + alumnoInt.getInstitucion() + ", " + alumnoInt.getPais());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
