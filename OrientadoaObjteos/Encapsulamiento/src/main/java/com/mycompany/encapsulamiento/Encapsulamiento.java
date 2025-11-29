/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamiento;

/**
 *
 * @author David-Code
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Persona p = new Persona("David", 20);

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());

        p.setEdad(21); // Cambiar edad

        System.out.println("Nueva edad: " + p.getEdad());
    }
}
