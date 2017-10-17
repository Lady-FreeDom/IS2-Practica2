/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorMotos;

/**
 *
 * @author Sara Monzo y Elena Martin
 */
public class Moto 
{
    private static int ID_SMoto = 0;
    private int ID_moto ;
    private String cadena_IDMoto;
    private String cc;
    private String nombreMoto;
    private float costeMoto;
    private String matricula;
    private Socio socioMotoPropietario;
    private float otrosGastos;
   
    /******************** Moto ******************
    * Constructor de la clase                   *
    * @param nombreMoto                         *
    * @param cc                                 *
    * @param matricula                          *
    * @param costeMoto                          *
    * @param socioMotoPropietario               *
    *********************************************/
    Moto(String nombreMoto, String cc, String matricula,float costeMoto, Socio socioMotoPropietario, float otrosGastos)
    {
        this.cc = cc;
        this.nombreMoto = nombreMoto;
        this.matricula = matricula;  
        this.costeMoto = costeMoto;
        this.ID_moto =  ID_SMoto;
        ID_SMoto++;
        cadena_IDMoto = String.format("%05d", ID_SMoto);
        this.socioMotoPropietario = socioMotoPropietario;
        this.otrosGastos = otrosGastos;
    }

    
    /******************** setSocioMotoPropietario ******************
    * Asigna el parametro socioMotoPropietario a la moto           *
    * @param socioMotoPropietario                                  *
    * @return void                                                 *
    ****************************************************************/
    void setSocioMotoPropietario(Socio socioMotoPropietario)
    {
        this.socioMotoPropietario = socioMotoPropietario;
    }
    
    /******************** setCC ******************
    * Asigna el parametro centrimetros cubicos   *
    * @return void                               *
    **********************************************/
    void setCC (String cc)
    {
        this.cc = cc;
    }
    
    
    
    /********************** getCC ******************
    * Devuelve el parametro centrimetros cubicos   *
    * @return String                               *
    ************************************************/
    String getCC ()
    {
        return this.cc;
    }
    
    
    /******************** setMatricula ******************
    * Asigna el parametro matricula                     *
    * @param matricula                                  *
    * @return void                                      *
    *****************************************************/
    void setMatricula (String matricula)
    {
        this.matricula = matricula;
    }
    
    
    /******************** getMatricula ******************
    * Devuelve el parametro matricula                   *
    * @return String                                    *
    *****************************************************/
    String getMatricula ()
    {
        return this.matricula;
    }
    
    
    /******************** setNombreMoto ******************
    * Asigna el parametro nombreMoto                     *
    * @param nombreMoto                                  *
    * @return void                                       *
    ******************************************************/
    void setNombreMoto(String nombreMoto)
    {
        this.nombreMoto = nombreMoto;
    }
    
    
    /******************** getNombreMoto ******************
    * Devuelve el parametro nombreMoto                   *
    * @return String                                     *
    ******************************************************/
    String getNombreMoto()
    {
        return this.nombreMoto;
    }
    
    
    /******************** setCosteMoto ******************
    * Asigna el parametro costeMoto                     *
    * @param costeMoto                                  *
    * @return void                                      *
    *****************************************************/
    void setCosteMoto(float costeMoto)
    {
        this.costeMoto = costeMoto;
    }
    
    
    /******************** getCosteMoto ******************
    * Devuelve el parametro costeMoto                   *
    * @return float                                     *
    *****************************************************/
    float getCosteMoto()
    {
        return this.costeMoto;
    }
    
    
    /******************** getIDMoto ******************
    * Devuelve el parametro IDMoto                   *
    * @return String                                 *
    **************************************************/
    String getIDMoto()
    {
        return cadena_IDMoto;
    }
    
    
    
    /******************** toString ******************
    * Sobreescritura del metodo toString            *
    * @return String                                *
    *************************************************/
    @Override
    public String toString()
    {
        return "Moto tipo: "+ nombreMoto +" con ID: "+ cadena_IDMoto + " Matricula: " + matricula + "\n Coste: "+ Float.toString(costeMoto) + "€ \n ********************* \n";     
    }
    
  
    /*************** mostrarMotoPropietario *************
    * Muestra una moto con su propietario               *
    * @return String                                    *
    *****************************************************/
    public String mostrarMotoPropietario()
    {
        return "Moto tipo: "+ nombreMoto +" con ID: "+ cadena_IDMoto + " Matricula: " + matricula + "\n Coste: "+ Float.toString(costeMoto) + "€ Propietario " + socioMotoPropietario.getNombreSocio() + " \n ********************* \n";     
    }
    
    
    /*********************** anyadirGastos *********************
    * Suma los gastosAñadidos a los otrosGastos que ya tiene   *
    * @param gastosAñadidos                                    *
    * @return void                                             *
    ************************************************************/
    void anyadirGastos(float gastosAñadido)
    {
        this.otrosGastos =+ gastosAñadido;
    }
    
    
    /************* getOtrosGastos ***********
    * Devuelve el parametro de otrosGastos  *
    * @return float                         *
    *****************************************/
    float getOtrosGastos()
    {
        return this.otrosGastos;
    }
}
