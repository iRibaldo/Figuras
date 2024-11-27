/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras.Rectangulos;

/**
 *
 * @author HP
 */
public class Rectangulo {
    public double baseRectangulo;
    public double alturaRectangulo;
    public Rectangulo() {
    }
    
    
     public Rectangulo(double baseRectangulo, double alturaRectangulo){
         this.alturaRectangulo=alturaRectangulo;
         this.baseRectangulo=baseRectangulo;
     } 
     public double calcularArea() {
        return baseRectangulo* alturaRectangulo;
    }
     public double calcularPerimetro() {
        return 2 * (baseRectangulo + alturaRectangulo);
    }
    
     public void imprimir() {

        System.out.println("La altura del rectangulo es de: " +alturaRectangulo);
        System.out.println("La base del rectangulo es de: " + baseRectangulo);
    }
}
