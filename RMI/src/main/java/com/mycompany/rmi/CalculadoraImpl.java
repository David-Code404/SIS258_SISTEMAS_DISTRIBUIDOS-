/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi;

/**
 *
 * @author joses
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementación de la interfaz Calculadora
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    // Constructor
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    // Método para sumar dos números
    @Override
    public int sumar(int a, int b) throws RemoteException {
        System.out.println("Sumando " + a + " + " + b);
        return a + b;
    }

    // Método para restar dos números
    @Override
    public int restar(int a, int b) throws RemoteException {
        System.out.println("Restando " + a + " - " + b);
        return a - b;
    }
}
