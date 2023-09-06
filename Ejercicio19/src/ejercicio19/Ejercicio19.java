/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class Ejercicio19 {

    
    public static void main(String[] args) {
        
       double lado,perimetro,altura,area;
       
        System.out.println("Lado: ");
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextDouble();
        
        perimetro = 3*lado;
        
        altura = (Math.sqrt(3)*lado)/2;
        
        area = altura * lado /2;
        
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Altura: "+altura);
        System.out.println("Area: " +area);
    }
    
}
