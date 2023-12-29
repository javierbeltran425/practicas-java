package com.jbeltran.app.hogar;

public class Persona {
    private String nombre;
    private ColorPelo colorPelo;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String lanzarPelota(){
        return "Lanza pelota al perro!";
    }

    public static String saludar(){
        return "Hola que tal!";
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}
