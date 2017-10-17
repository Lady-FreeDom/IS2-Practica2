/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorMotos;

import java.util.Date;

/**
 *
 * @author Sara Monzo y Elena Martin
 */
public class Cesion 
{
    private Socio antiguoPropietario;
    private Socio nuevoPropietario;
    private Moto motoCedida;
    private Date fechaCesion;
    
    Cesion(Socio antiguoPropietario, Socio nuevoPropietario, Moto motoCedida)
    {
        this.antiguoPropietario = antiguoPropietario;
        this.nuevoPropietario = nuevoPropietario;
        this.motoCedida = motoCedida;
        this.fechaCesion = new Date();//<-- Pone la fecha automaticamente
    }
    
    Socio getAntiguoPropietario()
    {
        return this.antiguoPropietario;
    }
    
    void setAntiguoPropietario(Socio antiguoPropietario)
    {
        this.antiguoPropietario = antiguoPropietario;
    }
    
    Socio getNuevoPropietario()
    {
        return this.nuevoPropietario;
    }
    
    void setNuevoPropietario (Socio nuevoPropietario)
    {
        this.nuevoPropietario = nuevoPropietario;
    }
    
    Moto getMotoCedida()
    {
        return this.motoCedida;
    }
    
    void setMotoCedida (Moto motoCedida)
    {
        this.motoCedida = motoCedida;
    }
    
    Date getFechaCesion()
    {
        return this.fechaCesion;
    }
    
    void setFechaCesion (Date fechaCesion)
    {
        this.fechaCesion = fechaCesion;
    }
    
     public String toString()
    {
        return "\n Antiguo propietario:  " + antiguoPropietario.getNombreSocio() + "\n Nuevo Propietario: " + nuevoPropietario.getNombreSocio() + "\n MotoCedida: " +  motoCedida.getNombreMoto() + "\n Fecha de la cesion: " +fechaCesion.getDay()+ "/" +fechaCesion.getMonth() + "/" +fechaCesion.getYear()+"\n ********************* \n";     
    }
    
}
