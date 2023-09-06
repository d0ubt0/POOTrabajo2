/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio10;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class C4Ejercicio10 {

    public static void main(String[] args) {
        
        String numIns,nombres;
        int estrato;
        double patrimonio,pagoMat=50000;
        
        
        System.out.println("Numero de inscripcion: ");
        Scanner entrada = new Scanner(System.in);
        numIns = entrada.nextLine();
        
        System.out.println("Nombres: ");
        Scanner entrada1 = new Scanner(System.in);
        nombres = entrada1.nextLine();
        
        System.out.println("Patrimonio: ");
        Scanner entrada2 = new Scanner(System.in);
        patrimonio = entrada2.nextDouble();
        
        System.out.println("Estrato: ");
        Scanner entrada3 = new Scanner(System.in);
        estrato = entrada3.nextInt();
        
        if ((patrimonio>2000000)&&(estrato>3)){
        
            pagoMat = pagoMat+ patrimonio*0.03;
     
        }
        
        System.out.println("El estudiante con numero de inscripcion "+numIns+" y nombre "+nombres+" debe pagar "+ pagoMat);
        
        
        
        
        
    }
    
}
