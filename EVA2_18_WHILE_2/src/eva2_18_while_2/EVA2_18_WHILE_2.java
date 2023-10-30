/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_while_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_WHILE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner(System.in);
        
        
        while(captu != nume){
            System.out.println("introduce el número");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("Adivinaste");
            
        
        
        
        }
    }
    
}
