/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.web;

/**
 *
 * @author David-Code
 * 
 * Ingresar a este enlace para cuando se ejecute  http://localhost:8080/hora
 */


import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Cliente que realiza una solicitud HTTP GET a un servidor web
public class ClienteWeb {
    public static void main(String[] args) {
        String urlTexto = "https://api.github.com";

        try {
            // Crear la URL y la conexión
            URL url = new URL(urlTexto);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            // Obtener el código de respuesta
            int codigo = conexion.getResponseCode();
            System.out.println("Código de respuesta: " + codigo);

            // Leer la respuesta si es exitosa
            if (codigo == 200) {
                BufferedReader lector = new BufferedReader(
                        new InputStreamReader(conexion.getInputStream())
                );

                String linea;
                System.out.println("Respuesta:");
                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }
                lector.close();
            }
            conexion.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
