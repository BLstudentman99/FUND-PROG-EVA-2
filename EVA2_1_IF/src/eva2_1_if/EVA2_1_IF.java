/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("introduce la calificacion: ");
        califa = input.nextInt();
        
        if(califa >= 70) {//if(expresion a evaluar)
            
        
            // las llaves se usan cuando son mas de una instruccion
            //dentro del if si es una sola, no se usan
            System.out.println("Aprobado: viaje a cancún!"); //pertenece al if
            System.out.println("Felicidades"); //no pertenece al if 
       }  else // else --> si no
            //este bloque es siempre es para falso
            System.out.println("no acreditado: a picar piedra"); 
            
            System.out.println("fin del programa");
               
}
}
