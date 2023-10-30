/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti = 1000;
        Scanner input = new Scanner(System.in);
        
        while(canti > 0 ){ //mientras haya saldo, se puede retirar
            System.out.println("¿Cuánto dinero deseas retirar");
            int retiro = input.nextInt();       
            //acumulador
            //canti = canti - retiro;                 
            canti-=retiro;
            System.out.println("te quedan $" + canti + " de saldo");
            
        
        
        }
    }
    
}
