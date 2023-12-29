package com.jbeltran.app.jardin;

import com.jbeltran.app.hogar.Persona;

class Perro {
    private String nombre;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
