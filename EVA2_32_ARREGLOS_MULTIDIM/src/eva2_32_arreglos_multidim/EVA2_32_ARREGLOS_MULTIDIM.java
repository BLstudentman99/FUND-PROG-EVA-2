/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_arreglos_multidim;

/**
 *
 * @author g61
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [3][4];
        
        matriz[1][3] = 100;
        System.out.println("matriz[1][3] = " + matriz[1][3]);
        
        //------------------------------------------------------
        
        System.out.println(matriz.length);
        
        
        for(int i = 0; i < matriz.length; i++){
           
        
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = (int)(Math.random()* 100);
                
                
            }
        
        }
        
        
         
        for(int i = 0; i < matriz.length; i++){
           
        
            for (int j = 0; j < matriz[i].length; j++) {
                
  
                
                System.out.println("[" + matriz[i] [j] + "]");
            }
            System.out.println("");
        }
    }
    
}
    
    

