/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio11;

/**
 *
 * @author d0ubt
 */

import java.util.Scanner;
public class C4Ejercicio11 {

   
    public static void main(String[] args) {
        
       double num1,num2,num3;
       
        System.out.println("Numero 1: ");
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextDouble();
        
        System.out.println("Numero 2: ");
        Scanner entrada1 = new Scanner(System.in);
        num2 = entrada1.nextDouble();
        
        System.out.println("Numero 3: ");
        Scanner entrada2 = new Scanner(System.in);
        num3 = entrada2.nextDouble();
        
        if ((num1>num2)&&(num1>num3)) {
            
            System.out.println(num1);
            
        }
        else if ((num2>num1)&&(num2>num3)) {
            
            System.out.println(num2);
            
        }
        else{
            System.out.println(num3);
        }
        
        
        
    }
    
}
