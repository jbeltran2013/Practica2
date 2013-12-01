/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Insectos {
    String especieInsecto;
    String [] observaciones;

    public String getEspecieInsecto() {
        return especieInsecto;
    }

    public void setEspecieInsecto(String especieInsecto) {
        this.especieInsecto = especieInsecto;
    }

    public String[] getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String[] observaciones) {
        this.observaciones = observaciones;
    }
    
}
