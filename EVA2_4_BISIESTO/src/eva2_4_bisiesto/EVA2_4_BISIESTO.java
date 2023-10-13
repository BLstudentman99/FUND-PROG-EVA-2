/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author g61
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el año a verificar");
        year=input.nextInt();
        
        residuo = year % 4; 
        //si es mas de una instruccion debe llevar llaves
        if(residuo == 0){
            residuo = year % 100;
            if(residuo == 0){ 
                residuo = year % 400;
                if(residuo == 0)
                    System.out.println("es año bisiesto");
                    else
                        System.out.println("no es año bisiesto");
            
            }
        
        }
    }
    
}
