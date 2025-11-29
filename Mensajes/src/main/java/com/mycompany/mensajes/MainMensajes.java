/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

/**
 *
 * @author David-Code
 */


// Clase principal para probar el sistema de mensajes
public class MainMensajes {
    public static void main(String[] args) {
        // Crear un buzón y los objetos emisor y receptor
        BuzonMensajes buzon = new BuzonMensajes();
        EmisorMensajes emisor = new EmisorMensajes(buzon);
        ReceptorMensajes receptor = new ReceptorMensajes(buzon);

        // Enviar mensajes
        emisor.enviar("Hola");
        emisor.enviar("¿Cómo estás?");

        // Contar mensajes en el buzón
        System.out.println("Mensajes en buzón: " + buzon.contarMensajes());

        // Recibir mensajes
        receptor.recibir();
        receptor.recibir();
        receptor.recibir(); // No hay mensajes restantes
    }
}
