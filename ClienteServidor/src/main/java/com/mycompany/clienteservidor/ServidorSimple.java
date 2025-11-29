/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clienteservidor;

/**
 *
 * @author David-Code
 */

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServidorSimple {
    public static void main(String[] args) {
        int puerto = 8080;

        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor esperando conexiones en puerto " + puerto);

            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado");

            BufferedReader entrada = new BufferedReader(
                new InputStreamReader(cliente.getInputStream())
            );

            String mensaje = entrada.readLine();
            System.out.println("Mensaje recibido: " + mensaje);

            entrada.close();
            cliente.close();
            servidor.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
