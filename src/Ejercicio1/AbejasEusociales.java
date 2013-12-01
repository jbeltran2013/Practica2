/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author alumno
 */
public class AbejasEusociales extends Hymenoptera {
    int gradoDeAvance;
    String TipoAbejaEusocial;
    String [] funciones;
    String tipoComida;
    int cicloDesarrollo;
    byte sexoAbeja;

  /*  public AbejasEusociales(int gradoDeAvance, String TipoAbejaEusocial, String[] funciones, String tipoComida, int cicloDesarrollo, byte sexoAbeja) {
        this.gradoDeAvance = gradoDeAvance;
        this.TipoAbejaEusocial = TipoAbejaEusocial;
        this.funciones = funciones;
        this.tipoComida = tipoComida;
        this.cicloDesarrollo = cicloDesarrollo;
        this.sexoAbeja = sexoAbeja;
    }
   */ 
    
    public byte getSexoAbeja() {
        return sexoAbeja;
    }

    public void setSexoAbeja(byte sexoAbeja) {
        this.sexoAbeja = sexoAbeja;
    }

    public String[] getFunciones() {
        return funciones;
    }

    public void setFunciones(String[] funciones) {
        this.funciones = funciones;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getCicloDesarrollo() {
        return cicloDesarrollo;
    }

    public void setCicloDesarrollo(int cicloDesarrollo) {
        this.cicloDesarrollo = cicloDesarrollo;
    }

    public int getGradoDeAvance() {
        return gradoDeAvance;
    }

    public void setGradoDeAvance(int gradoDeAvance) {
        this.gradoDeAvance = gradoDeAvance;
    }

    public String getTipoAbejaEusocial() {
        return TipoAbejaEusocial;
    }

    public void setTipoAbejaEusocial(String TipoAbejaEusocial) {
        this.TipoAbejaEusocial = TipoAbejaEusocial;
    }
    
    
}
