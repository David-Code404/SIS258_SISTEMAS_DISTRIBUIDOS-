/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi;

/**
 *
 * @author joses
 */
import java.rmi.Naming;

// Cliente que se conecta al servidor RMI y llama a los métodos remotos
public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Buscar el objeto remoto registrado en el RMI Registry
            Calculadora calc = (Calculadora) Naming.lookup("//localhost/Calculadora");

            // Llamadas remotas
            System.out.println("10 + 5 = " + calc.sumar(10, 5));
            System.out.println("10 - 5 = " + calc.restar(10, 5));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}