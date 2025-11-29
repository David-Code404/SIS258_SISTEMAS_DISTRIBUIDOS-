/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author David-code
 */
// Una clase puede implementar muchas interfaces
// Aquí implementamos Vehiculo y Electrico
public class CarroElectrico implements Vehiculo, Electrico {

    @Override
    public void arrancar() {
        System.out.println("El carro eléctrico está arrancando de forma silenciosa...");
    }

    @Override
    public void detener() {
        System.out.println("El carro eléctrico se ha detenido.");
    }

    @Override
    public void cargarBateria() {
        System.out.println("El carro eléctrico está cargando la batería...");
    }
}
