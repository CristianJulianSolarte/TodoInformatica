/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarreferencias;

/**
 *
 * @author Julian
 */
import java.awt.Point;
public class Probarreferencias {

    /**
     
     
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        float fuente=34.879f;
        int destino=(int)fuente;
        Point pt1, pt2;
        pt1=new Point(100, 300);
        // LO REFERENCIO...
        pt2=pt1;
        pt1.x=400;
        pt1.y=800;
        System.out.println("pt1 es : " + pt1.x + " " + pt1.y);
        System.out.println("pt2 es : " + pt2.x + " " + pt2.y);
               
        
        // CASTING DE VARIABLES.
        double x=0.34;
        float v=(float) (2*x);
        System.out.println("pt2 es : " + v);
        
        float q=87.45f;
        byte w=(byte)q;
        
        System.out.println("pt2 es : " + w);
       
        
        
        
        
        // TODO code application logic here
    }
    
}
