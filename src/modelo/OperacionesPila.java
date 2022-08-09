/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_s.rodriguez_s
 */
public class OperacionesPila {
    public <T extends Base > Pila<T> pilaDuplicada(Pila<T> pilaOriginal){
        
        Pila<T> pila2 = new Pila<>();
        Pila<T> pilaaux = new Pila<>();
        
        while(!pilaOriginal.estaVacia()){
           T elemento=pilaOriginal.desapilar();
           pilaaux.apilar(elemento);
            
        }
        
         while(!pilaaux.estaVacia()){
           T elemento = pilaaux.desapilar();
          T copiaelemento = (T) elemento.copy();
          
          pilaOriginal.apilar(elemento);
          pila2.apilar(copiaelemento);
            

        
        
    }
         return pila2;
    }
    
}