/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorMotos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Sara Monzo y Elena Martin
 */
public class GestorMotos 
{
    Socio socio;
    Moto moto;
    ArrayList<Moto> listaMotos;
    ArrayList<Socio> listaSocios;
    ArrayList<Cesion> listaCesiones;
    static float costemaximo = 0;

    /******************** main ********************
    * Main del proyecto
    ***********************************************/
    public static void main(String[] args) 
    {
        GestorMotos g = new GestorMotos();
        
        System.out.println("Introduce el coste maximo de todas las motos en propiedad de un cliente");
        Scanner scanner = new Scanner(System.in);
        costemaximo = scanner.nextFloat();
        
        g.menu(); 
    }
    
    /******************** GestorMotos ********************
    * Constructor e inicializador del proyectp
    ******************************************************/
    GestorMotos()
    {
        listaMotos = new ArrayList<Moto>();
        listaSocios = new ArrayList<Socio>();
        listaCesiones = new ArrayList<Cesion>();
        
        Socio socio1 = new Socio ("Elena Martin");
        Socio socio2 = new Socio ("Sara Monzo");
        Socio socio3 = new Socio ("Andros Peñas");
      
        
        Moto moto1 = new Moto ("Vespa Primavera", "125","0000AAA",2500, socio1, 10);
        Moto moto2 = new Moto ("Vespa Primavera", "125","0000BBB",2500, socio1, 30);
        Moto moto3 = new Moto ("Motobenae Poney AG2", "70","0000CCC", 2300, socio2, 15);
        Moto moto4 = new Moto ("Bultaco", "200","0000DDD", 3800, socio2, 0);
        Moto moto5 = new Moto ("Guzzi Cardelino", "75","0000EEE", 1200, socio3, 16);
        Moto moto6 = new Moto ("Ducati mini", "49","0000FFF", 4000, socio3, 87);
        
        listaMotos.add(moto1);
        listaMotos.add(moto2);
        listaMotos.add(moto3);
        listaMotos.add(moto4);
        listaMotos.add(moto5);
        listaMotos.add(moto6);
       
        System.out.println("Muestra el vector de motos");
        listaMotos.toString();
        
        listaSocios.add(socio1);
        listaSocios.add(socio2);
        listaSocios.add(socio3);
        
        socio1.anyadirMoto(moto1);
        socio1.anyadirMoto(moto2);
        socio2.anyadirMoto(moto3);
        socio2.anyadirMoto(moto4);
        socio3.anyadirMoto(moto5);
        socio3.anyadirMoto(moto6);
    }
    
    
    /******************** menu ********************
    * Menu del proyecto
    * @return void
    ***********************************************/
    public void menu()
    {
        
        
        int m;  
        boolean salir = false;
      
        do
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("********************   SOFTWARE ACAMA ******************** \n");
            System.out.println("Bienvenido, seleccione una de las siguientes opciones introduciendo el numero \n");
            System.out.println("1 Registrar un nuevo miembro \n");
            System.out.println("2 Registrar una nueva motocicleta \n");
            System.out.println("3 Registrar una cesion \n");
            System.out.println("4 Listar en pantalla los miembros con moto en posesion \n");
            System.out.println("5 Listar todas las motos \n");
            System.out.println("6 Mostrar las cesiones realizadas \n");
            System.out.println("7 Incrementar los gastos de una moto \n");
            System.out.println("8 Salir del programa");

            m = sc.nextInt();


            switch(m)
            {
                case 1:
                    registrarNuevoMiembro();
                    break;
                case 2:
                    registrarNuevaMoto();
                    break;
                case 3:
                    registrarNuevaCesion();
                    break;
                case 4:
                     mostrarListadoSociosPropietarios();
                    break;
                case 5:
                    mostrarListadoMotos();
                    break;
                case 6:
                    mostrarCesiones();
                    break;
                case 7:
                    incrementarGastosMoto();
                    break;
                case 8:
                    salir();
                    salir = true;
                    break;
                default:
                    System.out.println("Ha introducido un numero inválido, vuelva a introducir un número.");
            }
            System.out.println("\n\n\n\n ************************************************************************** \n\n\n\n");
        }while(!salir);
        
       
    }
    
    
    /******************** registrarNuevoMiembro ********************
    * Funcion que añade un nuevo miembro
    * @return void
    ****************************************************************/
    void registrarNuevoMiembro()
    {
        boolean existe = false;   
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduzca el nombre del nuevo socio ");
            String nombre = sc.nextLine();

            if(existe = existeSocio(nombre))
                System.out.println("El socio ya existe");
            else
            {
             Socio s = new Socio(nombre); 
             listaSocios.add(s);
             System.out.println("El socio ha sido creado y añadido. \n");
            }
        }while(existe);
    }
    
    
    /******************** registrarNuevaMoto ********************
    * Funcion que registra una nueva moto
    * @return void
    **************************************************************/
    void registrarNuevaMoto()
    {
        Socio socioActual;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el nombre de la moto comprobando que el campo no quede en blanco
        String nombre = "";
        do{
            System.out.println("\n Paso 1: Introduzca el nombre de la moto \n");
            nombre = sc.nextLine(); 
            if(nombre.equals(""))
                System.out.println("No puede dejar este campo en blanco.\n");
        }while(nombre.equals(""));
  
       
        //Pedimos los CC de la moto comprobando que el campo no quede en blanco
        String cc = "";
        do{
            System.out.println("\n Paso 2: Introduzca los centimetros cubicos (cc) de la moto \n");
            cc = sc.nextLine();
            if(cc.equals(""))
                System.out.println("No puede dejar este campo en blanco.\n");
        }while(cc.equals(""));
        
        //Pedimos la matricula y comprobamos que tenga la cantidad de numeros y letras correcta y que no exista ya.
        boolean matriculaAceptada = false; //indicara si la matricula es correcta
        String matriculaNueva = ""; //matricula completa introducida
        String letras = "";
        String numeros = "";
        int nums = 0;
        do
        {
            System.out.println("\n Paso 3: Introduzca solo los 4 dígitos de la matricula. \n");
            nums = sc.nextInt();
            numeros = String.valueOf(nums);
            
            System.out.println("\n Paso 4: Introduzca solo las 3 letras de la matricula. \n ");
            letras = sc.nextLine();
            
            //Si el tamaño es adecuado, oomprueba si ya existe la matricula
            if(numeros.length() == 4 && letras.length() == 3)
            {
                matriculaNueva = nums + letras;
                if(existeMoto(matriculaNueva))
                    matriculaAceptada = true;
                else
                    System.out.println("La matricula introducida ya existe, o ha introducido mal los datos. Repita el proceso.\n");
            }
        }while (!matriculaAceptada);

        // Pedimos el precio de la moto que ha de ser superior a 0
        float coste = 0;
        do
        {
            System.out.println("\n Paso 5: Introduzca el coste de la moto \n");
            coste = sc.nextFloat();
            if(coste <= 0)
                System.out.println("No puede dejar este campo en blanco, introducir un cero o un numero negativo.\n");
        }while(coste <= 0);
        
        //Pedimos el concepto de otros gastos de esta moto que han de ser superiores a 0 o campo en blanco, aceptamos que sea 0
        float otrosGastos = -1;
        do
        {
            System.out.println("\n Paso 6: Introduce el total de otros gastos.\n");
            otrosGastos = sc.nextFloat();
            if(otrosGastos < 0)
            {
                System.out.println("No puede dejar este campo en blanco o introducir valores negativos. \n");
            }
        }while(otrosGastos<0);
        
        //ASIGNAMOS LA MOTO A UN SOCIO
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("\n Paso 6: Introduzca el nombre del socio al que desea darle la nueva moto \n");
            String sociomoto = scanner.nextLine();

            socioActual = devuelveSocio(sociomoto);
            
            if(socioActual != null && (socioActual.getEutosMotosPropiedad()+ coste) < costemaximo)
            {
                Moto m = new Moto( nombre,  cc,  matriculaNueva, coste,  socioActual, otrosGastos);
                listaMotos.add(m);
                m.getIDMoto();
                socioActual.anyadirMoto(m);
                System.out.println("La moto ha sido creada y añadida a "+socioActual.getNombreSocio()+" correctamente.\n" );
            }
            else
                System.out.println("El nombre del socio que ha introducido no existe en el sistema. \n");
        }while(socioActual == null);        
    }
   
    
    /*********************** devuelveSocio ***********************
    * Funcion que devuelve el Socio con el nombre nombreSocio    *
    * @param nombreSocio                                         *
    * @return Socio                                              *
    **************************************************************/
    Socio devuelveSocio(String nombreSocio)
    {
        for(Socio s: listaSocios)
        {
            if(nombreSocio.equals(s.getNombreSocio()))
                return s;
        }
        return null;
    }
    
    
    /************************** existeSocio ***************************
    * Funcion que devuelve true si el socio con nombreSocio existe    *
    * @param nombreSocio                                              *
    * @return boolean                                                 *
    *******************************************************************/
    boolean existeSocio (String nombreSocio)
    {  
        for(Socio s: listaSocios)
        {
            if(s.getNombreSocio().equals(nombreSocio))
                return true;
        }
        return false;
    }
    
    
    /************************** existeMoto ***************************
    * Funcion que devuelve true si la moto con matricula existe      *
    * @param matricula                                               *
    * @return boolean                                                *
    ******************************************************************/
    boolean existeMoto (String matricula)
    {
        for(Moto m: listaMotos)
        {
            if(m.getMatricula().equals(matricula))
                return true;
        }
        return false;
    }
    
    
    /**************** mostrarListadoSociosPropietarios **************
    * Muestra el arraylist de socios                                *
    * @return void                                                  *
    *****************************************************************/
    void mostrarListadoSociosPropietarios()
    {
        for (Socio s : listaSocios)
        {
            System.out.println(s.toString());
        }
    }
    
    
    /**************** mostrarListadoMotos **************
    * Muestra el arraylist de motos                    *
    * @return void                                     *
    ****************************************************/
    void mostrarListadoMotos()
    {
       for(Moto m : listaMotos)
       {
           System.out.println(m.mostrarMotoPropietario());
       }
    }
    
    /**************** registrarNuevaCesion **************
    * Realiza una nueva cesion y la registra            *
    * @return void                                      *
    *****************************************************/
    void registrarNuevaCesion()
    {
        boolean operacionRealizada = false;
        do
        {
            Scanner sc = new Scanner(System.in);
        
            String antiguoPropietario = "";
            String nuevoPropietario = "";
            Socio antiguoPropietarioSocio = null;
            Socio nuevoPropietarioSocio = null;
        
            int numeroMoto = 0;
            Moto motoCedida = null;
            
            // Pedimos el nombre del actual propietario hasta que exista y no este en blanco
            do
            {
                System.out.println(" \n Paso 1: Introduzca el nombre del socio que vaya a ceder la moto \n");
                antiguoPropietario = sc.nextLine();
                antiguoPropietarioSocio = devuelveSocio(antiguoPropietario);   
                if(antiguoPropietario.equals("") || antiguoPropietarioSocio == null)
                    System.out.println("El campo introducido está en blanco o el socio no existe \n");
            }while(antiguoPropietario.equals("") || antiguoPropietarioSocio == null);
            
            //Pedimos el nombre del nuevo propietario hasta que exista, no esté en blanco y sea distinto al antiguo propietario
            do
            {
                System.out.println(" \n Paso 2: Introduzca el nombre del socio que recibira la moto \n");
                nuevoPropietario = sc.nextLine();
                nuevoPropietarioSocio = devuelveSocio(nuevoPropietario);
                if(nuevoPropietario.equals("") || nuevoPropietarioSocio == null || nuevoPropietario.equals(antiguoPropietario))
                    System.out.println("El campo introducido está en blanco, el socio no existe o tiene el mismo nombre que el anterior propietario \n");
            }while(nuevoPropietario.equals("") || nuevoPropietarioSocio == null || nuevoPropietario.equals(antiguoPropietario));
                
            ArrayList<Moto> motosAntiguoPropietario = antiguoPropietarioSocio.getArrayMotosPropiedad();
            int posicion = 1;
            System.out.println("\n Estas son las motos que posee el propietario "+ antiguoPropietario+ " \n");
            for(Moto motoAntiguoPropietario: motosAntiguoPropietario)
            {
                System.out.println("Moto numero "+posicion);
                System.out.println(motoAntiguoPropietario.toString());
                System.out.println("\n");
                posicion++;
            }
            if(posicion == 1)
                System.out.println("El socio "+antiguoPropietario+ " no tiene motos en propiedad y no puede realizar ninguna cesion. \n");
            else
            {
                do
                {
                    System.out.println("\n Paso 3:Introduzca el numero de la moto que desea ceder \n");
                    numeroMoto = sc.nextInt();
                    if(numeroMoto<0 && numeroMoto > posicion)
                        System.out.println("El numero introducido no es correcto. \n");
                }while(numeroMoto<0 && numeroMoto > posicion);
                motoCedida = motosAntiguoPropietario.get(numeroMoto-1);
                if((nuevoPropietarioSocio.getEutosMotosPropiedad()+ motoCedida.getCosteMoto()) < costemaximo)
                {
                    antiguoPropietarioSocio.quitarMoto(motoCedida);
                    nuevoPropietarioSocio.anyadirMoto(motoCedida);
                    motoCedida.setSocioMotoPropietario(nuevoPropietarioSocio);
                    Cesion nuevaCesion = new Cesion(antiguoPropietarioSocio, nuevoPropietarioSocio, motoCedida);
                    listaCesiones.add(nuevaCesion);
                    System.out.println("\n La cesión ha sido realizada con éxito. \n");
                    operacionRealizada = true;
                }
                else
                {
                    System.out.println("El socio "+nuevoPropietario+" no puede adquirir esa moto porque es demasiado cara. \n");
                }
            }
        }while(!operacionRealizada);  
    }  
    
    
    
    /**************** mostrarCesiones **************
    * Muestra el arraylist de cesiones             *
    * @return void                                 *
    ************************************************/
    void mostrarCesiones()
    {
        for(Cesion c: listaCesiones)
        {
            System.out.println(c.toString());
        }
    }
    
    
    /******************** salir ******************
    * Crea un fichero y guarda los arraylist     *
    * @return void                               *
    **********************************************/
    void salir()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Introduce el nombre del fichero donde guardar los datos.");
        String fichero = scanner.nextLine();
        String nombreFichero = "src\\"+fichero+".txt";
        
        try
        {
            File file = new File(nombreFichero);
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("****************** LISTA DE SOCIOS ******************\n");
            for(Socio s: listaSocios)
            {
                pw.println(s.toString());
            }
            
            pw.println("\n\n\n****************** LISTA DE MOTOS ******************\n");
            for(Moto m: listaMotos)
            {
                pw.println(m.toString());
            }
            
            pw.println("\n\n\n****************** LISTA DE CESIONES ******************\n");
            for(Cesion c: listaCesiones)
            {
                pw.println(c.toString());
            }
            pw.close();
            System.out.println("Se ha creado el fichero correctamente\n");
        }catch(IOException e)
        {
            System.out.println("Ha ocurrido un error en la creación del fichero y no se han guardado los datos. \n");
        }
    }
    
    
    void incrementarGastosMoto()
    {
        Scanner sc = new Scanner(System.in);
        
        int numeroMoto = 0;
        int posicion = 1;
        float gastoExtra = -1;
        
        Moto motoCambio;
        //Se muestran todas las motos del sistema
        System.out.println("\n Las motos del sistema son las siguientes: \n");
        for(Moto moto: listaMotos)
        {
            System.out.println("Moto numero "+posicion);
            System.out.println(moto.toString());
            System.out.println("\n");
            posicion++;
        }
        //Elije una moto y si es valida pide el importe a añadir, lo añade y lo muestra por pantalla
        if(posicion == 1)
                System.out.println("No hay motos en el sistema \n");
            else
            {
                //Se le pide una moto valida
                do
                {
                    System.out.println("\n Paso 1:Introduzca el numero de la moto que desea ceder \n");
                    numeroMoto = sc.nextInt();
                    if(numeroMoto<0 && numeroMoto > posicion)
                        System.out.println("El numero introducido no es correcto. \n");
                }while(numeroMoto<0 && numeroMoto > posicion);
                motoCambio = listaMotos.get(numeroMoto-1);
                
                //Pide el gasto extra y controla que no sea negativo o en blanco
                do
                {
                    System.out.println("\n Paso 2: Introduce el gasto que hay que añadir. \n");
                    gastoExtra = sc.nextFloat();
                    if(gastoExtra < 0)
                        System.out.println("El campo no puede estar en blanco o ser negativo");
                }while(gastoExtra < 0);
                
                motoCambio.anyadirGastos(gastoExtra);
                System.out.println("Los gastos de la moto "+ motoCambio.getNombreMoto()+" se han cambiado con exito, ahora tiene "
                        + motoCambio.getOtrosGastos()+ "€ como otros gastos.");
            }
    }
}
