/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author alumno
 */
public class FueraDeRangoExeption extends Exception {
     
    public FueraDeRangoExeption(){
        
        System.out.println("Fuera de Rango....");
    }
    
    public void mensaje() {
        System.out.println("otra tipo de excepcion....");
    }
}
