/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconstructor;


public class ClaseHijo extends ClasePadre {
        public ClaseHijo(){
            this("");
            System.out.println("C");
        }
        public ClaseHijo(String Nombre){        
           super();/*LLama  al constructor del padre que no tiene parametros*/
           System.out.println("D");
        }
        
}
