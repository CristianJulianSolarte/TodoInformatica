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
public class Perros 

{
    Scanner in= new Scanner (System.in);
    public float mordida;
    public float movercola;
    
    
    Perros ()
    {
    mordida=0;
    movercola=0;
    }
     public void perroscal() 
     
     {
       System.out.println ("tamaño dientes:");
       mordida = in.nextFloat();
       mordida=mordida*3;
       System.out.println (mordida);
      } 
}
