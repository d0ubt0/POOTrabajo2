/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio8;

/**
 *
 * @author d0ubt
 */

public class C4Ejercicio8 {

   
    public static void main(String[] args) {
        boolean A=true,B=true,C=true,D=true,E=true;
        
        if (A) {
            if (B) {
                System.out.println("Secuencia 1");
                
            }
            else if (C) {
                System.out.println("Secuencia 2");
                
            }
            else{
                System.out.println("Secuencia 3");
            }
            
        }
        
        else {
            System.out.println("Secuencia 4");
            
            if (D) {
                if (E) {
                    System.out.println("Secuencia 5");
                    
                }
                else{
                    System.out.println("Secuencia 6");
                }
                
            }
            
            else{
                System.out.println("Secuencia 7");
            }
            
        }
        
       
        
    }
    
}
