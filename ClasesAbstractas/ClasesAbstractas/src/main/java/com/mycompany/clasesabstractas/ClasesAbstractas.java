/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasesabstractas;

/**
 *
 * @author // Clase ABSTRACTA: NO se puede instanciar directamente
public abstract class Animal {

    // Atributo
    protected String nombre;

    // Constructor (las clases abstractas SÍ pueden tener constructor)
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: NO tiene cuerpo
    public abstract void hacerSonido();

    // Método concreto (con implementación)
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }
}

 */
public class ClasesAbstractas {

    public static void main(String[] args) {

        // NO se puede:
        // Animal a = new Animal("Animal");  // ERROR

        // ✔ Sí se puede crear un objeto de la clase hija
        Animal perro = new Perro("Firulais");

        // Método abstracto implementado en la hija
        perro.hacerSonido();

        // Método concreto heredado de la clase abstracta
        perro.dormir();
    }
}
