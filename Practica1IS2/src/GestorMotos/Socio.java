/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorMotos;

import java.util.ArrayList;

/**
 *
 * @author Sara Monzo y Elena Martin
 */
public class Socio 
{
    private static int ID_static=0;
    private int ID_socio;
    private String cadena_IDSocio;
    private String nombreSocio;
    private int numMotosPropiedad;
    private float eurosMotosPropiedad;
    private ArrayList <Moto> motosPropiedad;
    private  int contadorCesiones = 0;
    
    
    /******************** Socio ******************
    * Constructor de la clase                    *
    * @param nombreSocio                         *
    **********************************************/
    Socio(String nombreSocio)
    {
        this.nombreSocio = nombreSocio;
        this.numMotosPropiedad = 0;
        this.ID_socio = ID_static;
        ID_static ++;
        this.cadena_IDSocio = String.format("%03d", ID_static);
        motosPropiedad = new ArrayList<Moto>();
        this.contadorCesiones = contadorCesiones;
    }
  
    
    /******************** setNombreSocio ******************
    * Asigna el parametro nombreSocio                     *
    * @param nombreSocio                                  *
    * @return void                                        *
    *******************************************************/
    void setNombreSocio(String nombreSocio)
    {
        this.nombreSocio = nombreSocio;
    }
    
    
    /******************** getNombreSocio ******************
    * Devuelve el parametro nombreSocio                   *
    * @return String                                      *
    *******************************************************/
    String getNombreSocio()
    {
        return this.nombreSocio;
    }
    
    
    /******************** setNumMotosPropiedad ******************
    * Asigna el parametro numMotosPropiedad                     *
    * @param numMotosPropiedad                                  *
    * @return void                                              *
    *************************************************************/
    void setNumMotosPropiedad(int numMotosPropiedad)
    {
        this.numMotosPropiedad = numMotosPropiedad;
    }
    
    
    /******************** getNumMotosPropiedad ******************
    * Devuelve el parametro numMotosPropiedad                   *
    * @return int                                               *
    *************************************************************/
    int getNumMotosPropiedad()
    {
        return this.numMotosPropiedad;
    }
    
    
    /******************** setEurosMotoPropiedad ******************
    * Devuelve el parametro eurosMotoPropiedad                   *
    * @return float                                              *
    **************************************************************/
    float getEutosMotosPropiedad()
    {
        return this.eurosMotosPropiedad;
    }
    
    /******************** getContadorCesiones ******************
    * Devuelve el parametro contadorCesiones                   *
    * @return int                                              *
    ************************************************************/
    int getContadorCesiones()
    {
        return this.contadorCesiones;
    }
    
    /******************** setContadorCesiones ******************
    * Asigna el parametro contadorCesiones                     *
    * @param contadorCesiones                                  *
    * @return void                                             *
    ***********************************************************/
    void setContadorCesiones( int contadorCesiones)
    {
        this.contadorCesiones = contadorCesiones;
    }
    
    /******************** aumentarContadorCesiones ******************
    * Aumenta el valor del contador en 1                       *
    * @param contadorCesiones                                  *
    * @return int                                              *
    *************************************************************/
    int aumentarContadorCesiones (int contadorCesiones)
    {
        return this.contadorCesiones ++;
    }
    
    /******************** getArrayListMotosPropiedad ******************
    * Devuelve el arraylist de motosPropiedad                         *
    * @return ArrayList                                               *
    *******************************************************************/
    ArrayList <Moto> getArrayMotosPropiedad()
    {
        return motosPropiedad;
    }


    
    /******************** mostrarMotosPropiedad ******************
    * Devuelve un string del array de las motos en propiedad     *
    * @return String                                             *
    **************************************************************/
    String mostrarMotosPropiedad()
    {
        return motosPropiedad.toString();
    }
    
    
    /******************** anyadirMoto ******************
    * Añade una moto al arraylist de motosPropeidad    *
    * @param moto                                      *
    * @return void                                     *
    ****************************************************/
    void anyadirMoto(Moto moto)
    {
        motosPropiedad.add(moto);
        numMotosPropiedad =+1;
        eurosMotosPropiedad =+ moto.getCosteMoto();
    }
    
    
    /******************** quitarMoto ******************
    * Quita una moto del arraylist de moosPropiedad   *
    * @param moto                                     *
    * @return void                                    *
    ***************************************************/
    void quitarMoto (Moto moto)
    {
        motosPropiedad.remove(moto);
        eurosMotosPropiedad =- moto.getCosteMoto();
        numMotosPropiedad =-1;
    }
    
    
    /******************** toString ******************
    * Sobreescritura del metodo toString            *
    * @return String                                *
    *************************************************/
    @Override
    public String toString()
    {
        return "ID SOCIO " + ID_socio + " Nombre " + nombreSocio + " Motos en propiedad \n" + mostrarMotosPropiedad()+ "\n ********************* \n";     
    }
    
}
