/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurarpunto;
import java.awt.Point;


/**
 *
 * @author Julian
 */
public class Configurarpunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // el objeto es localizacion y x e y son las variables
        
        Point Localizacion=new Point (12, 24);
        System.out.println("el punto es :");
        
        // estoy instanciando apuntando a la variable x del objeo localizacion
        System.out.println("x es = "+ Localizacion.x);
        // estoy instanciando apuntando a la variable y del objeo localizacion
        System.out.println("y es = "+ Localizacion.y);
        
        
        System.out.println("asignando nuevos valores de punto a las variables");
        Localizacion.x=20;
        Localizacion.y=50;
        
        System.out.println("los valores nuevos son para x = " + Localizacion.x + " para y = "+Localizacion.y);
        
        
        
        // TODO code application logic here
    }
    
}
