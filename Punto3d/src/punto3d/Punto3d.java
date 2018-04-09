/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3d;
import java.awt.*;

/**
 *
 * @author Julian
 */

// con esto digo que la clase punto3d es una subclase de Point
public class Punto3d extends Point {
    
    public int z;
    // constructor de la clase y le pasamos los 3 parametros de posicion
    public Punto3d( int x, int y, int z)
    {
        
        // palabras clase super y this se usan constatementeb
        
        // hace referencia a la super clase del objeto actual, usa x e y d la super clase
        // llama al constructor de la super clase Point
    super (x, y);
    // referenciar al actual objeto punto3d desde la clase, nos referimos al objeto
    // en oncreto que usa la clase 
    this.z =z;
    }
    
    public void move (int x, int y, int z)
    {
    this.z=z;
    super.move(x,y);
    }
    
    public void translate (int x, int y, int z)
    {
        this.z=z;
        super.translate(x, y);
    }

    /**
     * @param args the command line arguments
     */
    
    
}
