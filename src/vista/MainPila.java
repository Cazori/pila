/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import java.util.LinkedList;
import modelo.Pila;
import modelo.OperacionesPila;

/**
 *
 * @author juan_s.rodriguez_s
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
          Pila<Productos> pila1 = new Pila<>();
    
    pila1.apilar(new Productos("atun", 1,4000) );
    pila1.apilar(new Productos("banana", 8,5700) );
    pila1.apilar(new Productos("azucar", 7,5200) );
    pila1.apilar(new Productos("cafe", 3,8000) );
    pila1.apilar(new Productos("burritos", 2,8200) );
    pila1.apilar(new Productos("Milanesa", 1,9000) );

    
        System.out.println("pila \n"+ pila1.toString());
      
        
        
        Pila<Productos> pilaC;
        OperacionesPila operacion = new OperacionesPila();
        pilaC= operacion.pilaDuplicada(pila1);
        System.out.println(""+ pilaC.toString());
        
        
        
        
        
        
    
        
        
        
        System.out.println("");
        
        




    
        
        // TODO code application logic here
    }
    
  
    
}
