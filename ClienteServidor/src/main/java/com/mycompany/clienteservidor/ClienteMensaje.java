/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clienteservidor;

/**
 *
 * @author David-Code
 */


import java.io.IOException;
import java.net.Socket;
import java.io.PrintWriter;

public class ClienteMensaje {
    public static void main(String[] args) {
        String servidor = "localhost";
        int puerto = 8080;

        try {
            Socket socket = new Socket(servidor, puerto);
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            salida.println("Hola desde el cliente");
            salida.close();
            socket.close();
            System.out.println("Mensaje enviado");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
