/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaorientadoobjetos;

/**
 *
 * @author Julian
 */
public class Cursojavaorientadoobjetos {

    //variables instancia
    String estado;
    int velocidad;
    float temperatura;
    
    //metodo instancia
    void ComprobarTemperatura()
    {
        if(temperatura < 30)
        {
            estado="volviendo";
            velocidad= 50;
        }
    }
        void mostraratributos()
                {
                    System.out.println(temperatura);
                    System.out.println (estado);
                    System.out.println(velocidad);
                }
        
    }
    /**
     * @param args the command line arguments
     */
        

