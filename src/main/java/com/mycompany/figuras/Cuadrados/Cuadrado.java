/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras.Cuadrados;

public class Cuadrado {

    public double logintudCuadrado;


    public Cuadrado() {
    }

    public Cuadrado(double logintudCuadrado) {
        this.logintudCuadrado = logintudCuadrado;

    }

    public void imprimir() {

        System.out.println("La longitud de los lados del cuadrado en centimetros son: " + logintudCuadrado);

    }

    public double calcularLongitudc() {

        double longitud = 0;
        return longitud = (logintudCuadrado * 4);

    }

}