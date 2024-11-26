/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.figuras;

import com.mycompany.figuras.Cuadrados.Cuadrado;
import com.mycompany.figuras.Triandulos.Tipos.Tipostriangulo;
import com.mycompany.figuras.Triangulos.Triangulo;

/**
 *
 * @author El Cangri
 */
public class Figuras {

    public static void main(String[] args) {

        //Cuadrado
        Cuadrado objCuadrado = new Cuadrado();
        
        objCuadrado.logintudCuadrado = 20;
        objCuadrado.imprimir();
        double PerimetroCuadrado = objCuadrado.calcularLongitudc();
        System.out.println("El perimeto del cuadrado es: " + PerimetroCuadrado);
        double areaCuadrado = objCuadrado.calcularAreac();
        System.out.println("El Area del cuadrado es: " + areaCuadrado);

        //Triangulo
        Triangulo objTriangulo = new Triangulo();
        
        objTriangulo.alturaTriangulo = 10.5;
        objTriangulo.baseTriangulo = 20.3;
        objTriangulo.tipostriangulo = Tipostriangulo.ESCALENO; 
                
        objTriangulo.imprimir();
        
        double Hipotenusa = objTriangulo.calcularHipotenusa();
        System.out.println("La hipotenusa del triangunlo es: " + Hipotenusa);
        double perimetroTriangulo = objTriangulo.perimetroTriangulo();
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
        double areaTriangulo = objTriangulo.areaTriangulo();
        System.out.println("El area del triangulo es: " + areaTriangulo);
        

    }

}
