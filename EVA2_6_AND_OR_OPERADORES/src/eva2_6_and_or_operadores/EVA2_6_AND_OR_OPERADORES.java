/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;
import java.util.Scanner;
/**
 *
 * @author g61
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        // Captura de la calificación
        int califa;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Cual es tu calificación? ");
        califa = scanner.nextInt();
        
        // Evaluar calificación:
        if ((califa >= 0) && (califa <= 100)){
            System.out.println("Tu calificación " + califa + " es válida!");
            if(califa >= 70)
                System.out.println("Acreditas!");
            else 
                System.out.println("No acreditas!");
        
        }else 
            System.out.println("tu calificación " + califa + " no es válida!");
        
        
        
        
        
    }
    
}
