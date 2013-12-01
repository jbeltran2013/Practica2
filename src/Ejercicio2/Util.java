/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Util {
    
   
    static public void estaEnRango(int valor) {
    int desde=0;
    int hasta=10;
    String Mensaje="";
        try {
                if (valor >= desde &&
                    valor <= hasta){
                    Mensaje="Esta en Rango"; 
                }else
                {
                    throw new FueraDeRangoExeption();
                }
                        
        } catch (Exception e) {
                e.printStackTrace();
                FueraDeRangoExeption ee =new FueraDeRangoExeption();
                ee.mensaje();
        }
      System.out.println(Mensaje);      
    }
}
