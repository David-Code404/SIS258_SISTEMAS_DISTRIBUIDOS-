/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstraccion;

/**
 *
 * @author David-Code
 */
public class Abstraccion {

    public static void main(String[] args) {

        Figura f = new Cuadrado(5);

        System.out.println("Área del cuadrado: " + f.calcularArea());
    }
}
