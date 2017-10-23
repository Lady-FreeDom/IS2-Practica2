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
    
    /******************** Cesion ******************
    * Constructor de la clase                     *
    * @param antiguoPropietario                   *
    * @param nuevoPropietario                     *
    * @param motoCedida                           *
    **********************************************/
    Cesion(Socio antiguoPropietario, Socio nuevoPropietario, Moto motoCedida)
    {
        this.antiguoPropietario = antiguoPropietario;
        this.nuevoPropietario = nuevoPropietario;
        this.motoCedida = motoCedida;
        this.fechaCesion = new Date();//<-- Pone la fecha automaticamente
    }
    
    
    /*************** getAntiguoPropietario ***************
    * Devuelve el parametro antiguoPropietario           *
    * @return Socio                                      *
    *****************************************************/
    Socio getAntiguoPropietario()
    {
        return this.antiguoPropietario;
    }
    
    /****************** setAntiguoPropietario *****************
    * Asigna el parametro setAntiguoPropietario               *
    * @param setAntiguoPropietario                            *
    * @return void                                            *
    **********************************************************/
    void setAntiguoPropietario(Socio antiguoPropietario)
    {
        this.antiguoPropietario = antiguoPropietario;
    }
    
    /*************** getNuevoPropietario ***************
    * Devuelve el parametro nuevoPropietario           *
    * @return Socio                                    *
    ***************************************************/
    Socio getNuevoPropietario()
    {
        return this.nuevoPropietario;
    }
    
    /****************** setNuevoPropietario *****************
    * Asigna el parametro setNuevoPropietario               *
    * @param setNuevoPropietario                            *
    * @return void                                          *
    ********************************************************/
    void setNuevoPropietario (Socio nuevoPropietario)
    {
        this.nuevoPropietario = nuevoPropietario;
    }
    
    /*************** getMotoCedida ***************
    * Devuelve el parametro motoCedida           *
    * @return Moto                               *
    *********************************************/
    Moto getMotoCedida()
    {
        return this.motoCedida;
    }
    
    /****************** setMotoCedida ***********************
    * Asigna el parametro setMotoCedida                     *
    * @param setMotoCedida                                  *
    * @return void                                          *
    ********************************************************/
    void setMotoCedida (Moto motoCedida)
    {
        this.motoCedida = motoCedida;
    }
    
    /*************** getFechaCesion ***************
    * Devuelve el parametro fechaCesion           *
    * @return Date                                *
    **********************************************/
    Date getFechaCesion()
    {
        return this.fechaCesion;
    }
    
    /****************** setFechaCesion ***********************
    * Asigna el parametro setFechaCesion                     *
    * @param setFechaCesion                                  *
    * @return void                                           *
    *********************************************************/
    void setFechaCesion (Date fechaCesion)
    {
        this.fechaCesion = fechaCesion;
    }
    
    /******************** toString ******************
    * Sobreescritura del metodo toString            *
    * @return String                                *
    *************************************************/
    public String toString()
    {
        return "\n Antiguo propietario:  " + antiguoPropietario.getNombreSocio() 
                + "\n Nuevo Propietario: " + nuevoPropietario.getNombreSocio() 
                + "\n MotoCedida: " +  motoCedida.getNombreMoto() + "\n Fecha de la cesion: " 
                +fechaCesion.toString()
                +"\n ********************* \n";     
    }
    
}
