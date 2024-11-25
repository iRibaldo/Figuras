/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras.Triangulos;

/**
 *
 * @author User
 */
public class Triangulo {

    public double alturaTriangulo;
    public double baseTriangulo;

    public Triangulo() {
    }

    public Triangulo(double alturaTriangulo, double baseTriangulo) {
        
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }
    

    public void imprimir() {

        System.out.println("La altura del triangulo es de: " + alturaTriangulo);
        System.out.println("La base del trianfulo es de: " + baseTriangulo);
    }
    
        public double calcularHipotenusa(){
        double hipotenusa =0;
        hipotenusa = (alturaTriangulo*alturaTriangulo)+(baseTriangulo*baseTriangulo);
        return hipotenusa;
    }







}
