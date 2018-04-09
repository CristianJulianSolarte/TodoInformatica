package punto3d;
import java.awt.*;


class Comprobarpunto
{
public static void main(String[] args)
        
{
    //creo los dos objetos de cada clase con parametros iniciales
    Point objeto1=new Point(11, 22);
    Punto3d objeto2=new Punto3d (3, 23, 54);
    
    System.out.println("El punto 2d esta localizado en (" + objeto1.x + "," + objeto1.y +")" );
    System.out.println("El punto 2d esta siendo movido a (4, 13)");
    //llamo el metodo move sobre el objeto1
    objeto1.move(4, 13);
    System.out.println("El punto 2d hora esta en: (" + objeto1.x + "," + objeto1.y + ")");
    System.out.println("El punto 3d esta localizado en ("+objeto2.x+ ","+objeto2.y+","+objeto2.z+")");
    System.out.println("El punto 2d esta siendo movido a (5, 116, 45)");
    objeto2.translate(+5, +116, +45);
    System.out.println("El punto 3d hora esta en: (" + objeto2.x + "," + objeto2.y + ","+objeto2.z+")");
}
}