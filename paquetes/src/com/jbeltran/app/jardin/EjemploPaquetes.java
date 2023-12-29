package com.jbeltran.app.jardin;

import com.jbeltran.app.hogar.*;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Javier");
        persona.setColorPelo(ColorPelo.CAFE);

        System.out.println(persona.getNombre() + " - " + persona.getColorPelo());

        // Creando objetos sin necesidad de importar los modelos ya que estan dentro del mismo contexto (mis package)
        Perro perro = new Perro();

        perro.setNombre("Minnie");

        System.out.println(perro.getNombre());

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = Persona.saludar();
        System.out.println("Saludo = " + saludo);
    }
}
