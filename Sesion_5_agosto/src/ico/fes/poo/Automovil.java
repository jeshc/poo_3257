/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ico.fes.poo;

/**
 * Fecha de creación: 05-ago-2020
 * @author jesushc
 */
public class Automovil {
    public String marca;
    public String subMarca;
    public int modelo;
    public String color;
    
    public void encender(){
        System.out.println("Encendiendo el auto");
    }
    
    public  void acelerar(){
        System.out.println("Ecelerando...");
    }
    
    public float avanzar( int metros ){
        float reales=0.0f;
        reales = (float) Math.random()*100.0f;
        System.out.println("Avanzando el auto "+ this.marca);
        return reales;    
    }
    
}
