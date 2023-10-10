/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1; 
        int valor2;
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("introduce valor 1");
        valor1 = input.nextInt();
        System.out.println("introduce valor 2");
        valor2 = input.nextInt();
        
        if(valor1 > valor2) //verdad, siempre es obligatorio
            System.out.println("el valor más grande es " + valor1); //concatenar valores de texto
        else{ //cuando el resultado es falso
            if(valor1 == valor2 )
                System.out.println("ambos valores son iguales ");
            else 
                System.out.println("El valor mas grande es 6"+ valor2);
        }
    
    
}
}
