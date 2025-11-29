/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author David-code
 */
public class Interfaces {

    public static void main(String[] args) {

        CarroElectrico carro = new CarroElectrico();

        // MÉTODOS ABSTRACTOS implementados
        carro.arrancar();
        carro.detener();
        carro.cargarBateria();

        // MÉTODOS DEFAULT de las interfaces
        carro.mostrarVelocidad();   // De Vehiculo
        carro.estadoBateria();      // De Electrico

        // MÉTODO STATIC (se llama desde la interfaz)
        Vehiculo.info();
    }
}
