/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_2_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        try{
            //seccion de codigo que potencialmente genera una excepcion
        int resu = x / y;
        System.out.println("Resultado = " + resu);
        }catch(ArithmeticException valioTodo){//se genera un objeto excepcion llamado "e"
            System.out.println("valio todo: " + valioTodo.getMessage());
        }
        System.out.println("Programa terminado");
    }
        
    
}
