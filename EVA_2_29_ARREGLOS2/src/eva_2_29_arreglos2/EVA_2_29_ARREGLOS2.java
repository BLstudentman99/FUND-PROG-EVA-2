/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_29_arreglos2;

/**
 *
 * @author invitado
 */
public class EVA_2_29_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[50];
        //vamos a llenar elarreglo de vlalores entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
                          //casting: convierte un double a un entero
            arreglo[i] = (int)(Math.random()* 100);
            
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
                
    }
    
}
