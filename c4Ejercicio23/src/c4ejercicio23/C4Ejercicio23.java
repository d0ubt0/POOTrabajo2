/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio23;

/**
 *
 * @author d0ubt
 */

import java.util.Scanner;
public class C4Ejercicio23 {

    
    public static void main(String[] args) {
        
        double A,B,C,x1,x2;
        
        System.out.println("A: ");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextDouble();
        
        System.out.println("B: ");
        Scanner entrada1 = new Scanner(System.in);
        B = entrada1.nextDouble();
        
        System.out.println("C: ");
        Scanner entrada2 = new Scanner(System.in);
        C = entrada2.nextDouble();
        
        x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
        x2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
        System.out.println("Posible Solucion 1: "+x1);
        System.out.println("Posible Solucion 2: "+x2);
    }
    
}
