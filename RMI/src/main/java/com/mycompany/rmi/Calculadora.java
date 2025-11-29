/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rmi;

/**
 *
 * @author David-Code
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz remota para RMI
// Define los métodos que se podrán invocar remotamente
public interface Calculadora extends Remote {
    int sumar(int a, int b) throws RemoteException;
    int restar(int a, int b) throws RemoteException;
}
