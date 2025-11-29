/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesabstractas;

/**
 *
 * @author David-Code
 */
// Clase ABSTRACTA: NO se puede instanciar directamente
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

