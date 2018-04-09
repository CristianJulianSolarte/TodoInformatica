/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisorstring;

/**
 *
 * @author Julian
 */
public class Revisorstring {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String str = "prueba llamar metodos";
        System.out.println("El string es :" + str.length());
        System.out.println("la localizacion del objeto es : " + str.charAt(4));
        System.out.println("el string de 3 a 4 es :" + str.substring(4, 10));
        // TODO code application logic here
    }
    
}
