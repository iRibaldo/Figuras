/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.figuras;

import com.mycompany.figuras.Circulos.Circulo;
import com.mycompany.figuras.Cuadrados.Cuadrado;
import com.mycompany.figuras.Rectangulos.Rectangulo;
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
        
        double hipotenusa = objTriangulo.calcularHipotenusa();
        if(hipotenusa==0){
            System.out.println("Es imnposible calcular la hipotenusa debido a que sus lados son iguales");
        }else{
        System.out.println("La hipotenusa del triangunlo es: " + hipotenusa);
        }
        
        double perimetroTriangulo = objTriangulo.perimetroTriangulo();
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
        double areaTriangulo = objTriangulo.areaTriangulo();
        System.out.println("El area del triangulo es: " + areaTriangulo); 
        
         //rectangulo
        
        Rectangulo objRectangulo = new Rectangulo();
        
        objRectangulo.alturaRectangulo=5;    
        objRectangulo.baseRectangulo=10;
        
        objRectangulo.imprimir();
        double calcularPerimetro = objRectangulo.calcularPerimetro();
        System.out.println("El perimeto del rectangulo es: " + calcularPerimetro);
        
        double calcularArea = objRectangulo.calcularArea();
        System.out.println("El Area del rectangulo es: " + calcularArea);
        
        
         //Circulo
         
         
        Circulo objCirculo = new Circulo();
        objCirculo.radio=8;
        
        objCirculo.imprimir();
        System.out.println("area: " + objCirculo.calcularArea());
        System.out.println("Perimetro: " + objCirculo.calcularPerimetro());
       
    }
}
    
  
    
     
