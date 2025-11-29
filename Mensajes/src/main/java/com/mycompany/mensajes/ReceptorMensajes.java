/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

/**
 *
 * @author David-Code
 */


// Clase que recibe mensajes desde un buzón
public class ReceptorMensajes {
    private BuzonMensajes buzon;

    public ReceptorMensajes(BuzonMensajes buzon) {
        this.buzon = buzon;
    }

    // Método para recibir un mensaje y mostrarlo
    public void recibir() {
        System.out.println("Mensaje recibido: " + buzon.recibirMensaje());
    }
}
