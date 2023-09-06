/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;

public class Ejercicio21 {

    
    public static void main(String[] args) {
        
        double lado1,lado2,lado3,perimetro,semiperimetro,area,x;
        
        System.out.println("Lado 1: ");
        Scanner entrada = new Scanner(System.in);
        lado1 = entrada.nextDouble();
        
        System.out.println("Lado 2: ");
        Scanner entrada1 = new Scanner(System.in);
        lado2 = entrada1.nextDouble();
        
        System.out.println("Lado 3: ");
        Scanner entrada2 = new Scanner(System.in);
        lado3 = entrada2.nextDouble();
        
        perimetro = lado1+lado2+lado3;
        semiperimetro = perimetro/2;
        x = semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3);
        
        area = Math.sqrt(x);
        
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Semiperimetro: "+semiperimetro);
        System.out.println("Area: "+area);
        
        
    }
    
}
