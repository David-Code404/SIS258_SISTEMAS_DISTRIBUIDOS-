/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author David-code
 */
// Segunda interfaz para practicar MULTI-INTERFACE
public interface Electrico {

    // Atributo constante
    int BATERIA_MAXIMA = 100;

    // Método abstracto
    void cargarBateria();

    // Método default
    default void estadoBateria() {
        System.out.println("La batería está al " + BATERIA_MAXIMA + "%");
    }
}

