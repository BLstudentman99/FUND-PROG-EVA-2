/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_valor_maximo;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        //llamada a funcion (invocar funcion)
        //utilizar el valor directamente de la funcion  
        System.out.println(buscarMaximo(100, 200));
        //guardar el valor y usarlo después
        int resu = buscarMaximo(100, 200);
        System.out.println(resu);
        //llamar a la funcion e ignorar el resultado
        buscarMaximo(100, 200); 
       
        
    }  
    public static int buscarMaximo(int va1, int va2){
        //if(va1 > va2)
           // return va1;
        //else
            //return va2;
        int resultado;
        if(va1 > va2)
            resultado = va1;
        else
            resultado = va2;
        return resultado;
 
    }
    
}
