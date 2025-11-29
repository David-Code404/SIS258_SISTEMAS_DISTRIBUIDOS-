/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author David-Code
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        Animal a1 = new Gato();  // Polimorfismo
        Animal a2 = new Perro(); // Polimorfismo

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
