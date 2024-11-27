/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras.Circulos;

/**
 *
 * @author HP
 */
public class Circulo {
  
    public double radio;
    
    public void imprimir (){
        
        System.out.println("El radio del circulo es: " + radio);
        
    }

    public Circulo() {
    }
    
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.1416 * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

}
    
