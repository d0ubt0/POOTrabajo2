

/**
 *
 * @author d0ubt
 */
 import java.util.Scanner;
public class Ejercicio18 {
    

    
    public static void main(String[] args) {
        
        String codigo,nombre;
   
        double salariobru,salarioneto,horas,valor,porcentaje;
        
        System.out.println("Codigo: ");
        Scanner entrada = new Scanner(System.in);
        codigo = entrada.nextLine();
        
        System.out.println("Nombres: ");
        Scanner entrada1 = new Scanner(System.in);
        nombre = entrada1.nextLine();
        
        System.out.println("Numero horas/mes: ");
        Scanner entrada2 = new Scanner(System.in);
        horas = entrada2.nextDouble();
        
        System.out.println("Valor por hora: ");
        Scanner entrada3 = new Scanner(System.in);
        valor = entrada3.nextDouble();
        
        System.out.println("Porcentaje %: ");
        Scanner entrada4 = new Scanner(System.in);
        porcentaje = entrada4.nextDouble();
        
        salariobru = horas * valor;
        salarioneto = salariobru * ((100-porcentaje)/100);
        
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombres: "+nombre);
        System.out.println("Salario Bruto: "+salariobru);
        System.out.println("Salario Neto: "+salarioneto);
        
        
        
        
        
        
        
        
        
        
    }
    
}
