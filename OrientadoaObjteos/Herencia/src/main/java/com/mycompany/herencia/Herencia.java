/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author joses
 */
public class Herencia {
     public static void main(String[] args) {
        
        Perro perro = new Perro();

        perro.hacerSonido(); // Método heredado
        perro.ladrar();      // Método propio
    }
}
