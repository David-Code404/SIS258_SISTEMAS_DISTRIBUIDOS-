/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web;

/**
 *
 * @author David-Code
 *  * Ingresar a este enlace para cuando se ejecute  http://localhost:8080/hora
 * 
 */


import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.net.InetSocketAddress;
import java.io.OutputStream;

// Servidor HTTP simple que expone dos rutas: /saludo y /hora
public class ServidorWeb {
    public static void main(String[] args) {
        try {
            // Crear el servidor en el puerto 8080
            HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

            // Crear los contextos y asociar los manejadores
            servidor.createContext("/saludo", new ManejadorSaludo());
            servidor.createContext("/hora", new ManejadorHora());

            // Iniciar el servidor
            servidor.start();
            System.out.println("Servidor web iniciado en puerto 8080");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Manejador para la ruta /saludo
class ManejadorSaludo implements HttpHandler {
    public void handle(HttpExchange exchange) {
        try {
            String respuesta = "Hola desde el servidor web";
            exchange.sendResponseHeaders(200, respuesta.length());

            OutputStream salida = exchange.getResponseBody();
            salida.write(respuesta.getBytes());
            salida.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Manejador para la ruta /hora
class ManejadorHora implements HttpHandler {
    public void handle(HttpExchange exchange) {
        try {
            String hora = java.time.LocalTime.now().toString();
            String respuesta = "Hora actual: " + hora;
            exchange.sendResponseHeaders(200, respuesta.length());

            OutputStream salida = exchange.getResponseBody();
            salida.write(respuesta.getBytes());
            salida.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
