/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio9;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class C4Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double A,B,C,Y,X;
        System.out.println("A: ");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextDouble();
        
        System.out.println("B: ");
        Scanner entrada1 = new Scanner(System.in);
        B = entrada.nextDouble();
        
        System.out.println("C: ");
        Scanner entrada2 = new Scanner(System.in);
        C = entrada.nextDouble();
        
        System.out.println("Y: ");
        Scanner entrada3 = new Scanner(System.in);
        Y = entrada.nextDouble();
        
        
        
        
        if ((Y<A) &&((A<B)&&(B<C)) ) {
            X=0;
            System.out.println(X);
            
        }
        
        else if ((A<=Y)&&(Y<B)) {
            X=1;
            System.out.println(X);
            
        }
        else if ((B<=Y)&&(Y<C)){
            X=2;
            System.out.println(X);
            
        }
        else if (C<=Y){
            X=3;
            System.out.println(X);
        
        }
        else{
            X=4;
            System.out.println(X);
        }
    }
    
}
