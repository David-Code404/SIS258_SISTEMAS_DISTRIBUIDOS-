/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajes;

/**
 *
 * @author David-Code
 */


import java.util.ArrayList;

// Clase que representa un buzón de mensajes
public class BuzonMensajes {
    private ArrayList<String> mensajes = new ArrayList<>();

    // Guardar un mensaje en el buzón
    public void enviarMensaje(String mensaje) {
        mensajes.add(mensaje);
        System.out.println("Mensaje guardado: " + mensaje);
    }

    // Recibir el primer mensaje del buzón
    public String recibirMensaje() {
        if (!mensajes.isEmpty()) {
            return mensajes.remove(0);
        }
        return "No hay mensajes";
    }

    // Contar mensajes en el buzón
    public int contarMensajes() {
        return mensajes.size();
    }
}
