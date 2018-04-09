/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mascotas;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class Gatos //declaro nombre de la clase

{
    Scanner in= new Scanner (System.in);
    //definicion de variables
   public float tamañoojos;
   public float garras;
   
   // incializacion o construccion de las variables u objeto (mirar que son bien)
   public Gatos()
   {
       tamañoojos=0;
       garras=0;
   }
   
   public void calculos()
   {
       System.out.println ("Por favor introduzca el tamaño de los ojos:");
       tamañoojos = in.nextFloat();
       tamañoojos=tamañoojos*50;
       System.out.println (tamañoojos);
       
       System.out.println ("Por favor introduzca el tamaño de la peligrosas garras de su gato:");
       garras = in.nextFloat();
             
   }
    static void gatosc()
     {
                           System.out.println ("Soy un gato"); 
     } 
    
}
