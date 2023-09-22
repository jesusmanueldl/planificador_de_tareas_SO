/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 *
 * @author manuel
 */
public class Proceso {
    
    private String nombre;
    private int t_llegada;
    private int t_CPU;
    private int prioridad;
    private int t_espera;
    private int t_entrega;
    
    public Proceso(String nombre, int t_llegada, int t_CPU, int prioridad)
    {
        this.nombre = nombre;
        this.t_llegada = t_llegada;
        this.t_CPU = t_CPU;
        this.prioridad = prioridad;
        this.t_espera = 0;
        this.t_entrega = 0;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setT_llegada(int t_llegada)
    {
        this.t_llegada = t_llegada;
    }
    
    public void setT_CPU(int t_CPU)
    {
        this.t_CPU = t_CPU;
    }
    
    public void setPrioridad(int prioridad)
    {
        this.prioridad = prioridad;
    }
    
    public void setT_espera(int t)
    {
        this.t_espera = t;
    }
    
    public void setT_entrega(int entrega)
    {
        this.t_entrega = entrega;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getT_llegada()
    {
        return this.t_llegada;
    }
    
    public int getT_CPU()
    {
        return this.t_CPU;
    }
    
    public int getPrioridad()
    {
        return this.prioridad;
    }
    
    public int getT_espera()
    {
        return this.t_espera;
    }
    
    public int getT_entrega()
    {
        return this.t_entrega;
    }
    
    
}
