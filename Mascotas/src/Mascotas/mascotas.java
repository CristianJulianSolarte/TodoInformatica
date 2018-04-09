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
public class mascotas

{
    
    public String nombre; 
    public float Peso;
    
    public boolean Adoptado;
            
    public static void main (String[ ] arg) 
     
     {   
         
                  System.out.println ("Soy LA CLASE PRINCIPAL"); 
                  Perros sofia = new Perros();
                  sofia.perroscal();
                  Gatos gatodluffy = new Gatos();
                  gatodluffy.calculos();
                  
                  
      } 
    
}
