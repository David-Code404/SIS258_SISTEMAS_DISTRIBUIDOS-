/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author David-code
 */
// INTERFAZ: solo contiene métodos abstractos por defecto
// No puede tener constructores
public interface Vehiculo {

    // Atributo constante (public static final por defecto)
    int VELOCIDAD_MAXIMA = 180;

    // Método abstracto (implícito)
    void arrancar();

    // Método abstracto
    void detener();

    // Método DEFAULT (Java 8) → Tiene cuerpo
    default void mostrarVelocidad() {
        System.out.println("La velocidad máxima permitida es: " + VELOCIDAD_MAXIMA + " km/h");
    }

    // Método STATIC (Java 8) → Se invoca desde la interfaz, no desde el objeto
    static void info() {
        System.out.println("Este es un método static dentro de la interfaz Vehiculo.");
    }
}

