/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

/**
 *
 * @author David-Code
 */


// Clase que envía mensajes a un buzón
public class EmisorMensajes {
    private BuzonMensajes buzon;

    public EmisorMensajes(BuzonMensajes buzon) {
        this.buzon = buzon;
    }

    // Método para enviar un mensaje al buzón
    public void enviar(String mensaje) {
        buzon.enviarMensaje(mensaje);
    }
}
