/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raiznuevo2;
import java.io.*;
/**
 *
 * @author Julian
 */
public class Raiznuevo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
        // TODO code application logic here
        System.out.println("Escribe un numero");
        String str = buff.readLine();
        int conversion =Integer.parseInt(str);
        System.out.println("La Raiz Cuadrada de "
                + conversion +
                "es "
                + Math.sqrt(conversion));
    }
    
}
