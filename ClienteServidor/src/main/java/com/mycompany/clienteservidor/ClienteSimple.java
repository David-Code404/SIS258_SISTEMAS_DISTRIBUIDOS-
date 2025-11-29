/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clienteservidor;

/**
 *
 * @author David-Code
 */
import java.io.IOException;
import java.net.Socket;

public class ClienteSimple {
    public static void main(String[] args) {
        String servidor = "localhost";
        int puerto = 8080;

        try {
            Socket socket = new Socket(servidor, puerto);
            System.out.println("Conectado al servidor");
            socket.close();
            System.out.println("Conexión cerrada");
        } catch (IOException e) {
            System.out.println("No se pudo conectar: " + e.getMessage());
        }
    }
}
