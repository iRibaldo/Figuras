/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras.Triangulos;

import com.mycompany.figuras.Triandulos.Tipos.Tipostriangulo;

/**
 *
 * @author User
 */
public class Triangulo {

    public double alturaTriangulo;

    public double baseTriangulo;
    public Tipostriangulo tipostriangulo;

    public Triangulo() {
    }

    public Triangulo(double primerAlturaTriangulo, double segundaAlturaTriangulo, double baseTriangulo, Tipostriangulo tipostriangulo) {
        this.alturaTriangulo = primerAlturaTriangulo;
        this.baseTriangulo = baseTriangulo;
        this.tipostriangulo = tipostriangulo;
    }

    public void imprimir() {

        System.out.println("La altura del triangulo es de: " + alturaTriangulo);
        System.out.println("La base del trianfulo es de: " + baseTriangulo);
        System.out.println("El triangulo es: " + tipostriangulo);
    }
    
    public double areaTriangulo(){
        double areaTriangulo = 0;
        return areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
    }

    public double calcularHipotenusa() {

        double hipotenusa = 0;
        if (null == tipostriangulo) {
            System.out.println("Es imposible calcular la hipotenusa del triangulo, dibido a que todos sus lados son iguales ");
        }else switch (tipostriangulo) {
            case ISOCELES -> hipotenusa = (Math.sqrt((alturaTriangulo * alturaTriangulo) + (baseTriangulo * baseTriangulo)));
            case ESCALENO -> hipotenusa = (Math.sqrt((alturaTriangulo * alturaTriangulo) + (baseTriangulo * baseTriangulo)));
            default -> System.out.println("Es imposible calcular la hipotenusa del triangulo, dibido a que todos sus lados son iguales ");
        }

        return hipotenusa;
    }
    
    public double perimetroTriangulo (){
        double perimetroTriangulo = 0;
        return perimetroTriangulo = (baseTriangulo + alturaTriangulo + calcularHipotenusa());
    }
}
