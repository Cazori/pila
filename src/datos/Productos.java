/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author juan_s.rodriguez_s
 */
public class Productos extends Base {

    private String nombreProducto;
       private int cantidadProducto;
       
    private double PrecioProducto;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProducto, double PrecioProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.PrecioProducto = PrecioProducto;
    }
    

    /**
     * Get the value of PrecioProducto
     *
     * @return the value of PrecioProducto
     */
    public double getPrecioProducto() {
        return PrecioProducto;
    }

    /**
     * Set the value of PrecioProducto
     *
     * @param PrecioProducto new value of PrecioProducto
     */
    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }
 

    /**
     * Get the value of cantidadProducto
     *
     * @return the value of cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Set the value of cantidadProducto
     *
     * @param cantidadProducto new value of cantidadProducto
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public Base copy() {
        
        return new Productos (nombreProducto, cantidadProducto, PrecioProducto);
       
        
        
        
      
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", cantidadProducto=" + cantidadProducto + ", PrecioProducto=" + PrecioProducto + '}';
    }
    
    
    
    
}
