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
        System.out.println("La base del triangulo es de: " + baseTriangulo);
        System.out.println("El triangulo es: " + tipostriangulo);
    }

    public double areaTriangulo() {
        double areaTriangulo = 0;
<<<<<<< HEAD
        return areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
=======
        return areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
    
>>>>>>> Anthony
    }

    public double calcularHipotenusa() {

        double hipotenusa = 0;

         if (null != tipostriangulo) switch (tipostriangulo) {
            case ISOCELES:
                hipotenusa = (Math.sqrt((alturaTriangulo * alturaTriangulo) + (baseTriangulo * baseTriangulo)));
                break;
            case ESCALENO:
                hipotenusa = (Math.sqrt((alturaTriangulo * alturaTriangulo) + (baseTriangulo * baseTriangulo)));
                break;
            case EQUILATERO:
                hipotenusa=0;
                // System.out.println("Es imposible calcular la hipotenusa del triangulo, dibido a que todos sus lados son iguales ");
                break;
            default:
                break;
        }
        return hipotenusa;
        
    }

    public double perimetroTriangulo() {
        
        return (baseTriangulo + alturaTriangulo + calcularHipotenusa());
    }
}
