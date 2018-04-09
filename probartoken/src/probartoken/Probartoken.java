/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probartoken;
import java.util.StringTokenizer;


/**
 *
 * @author Julian
 */
public class Probartoken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringTokenizer st1, st2;
        String cita1 = "TEXTO 6 -3/4";
        // Asi se instancian objetos
        st1=new StringTokenizer(cita1);
        System.out.println("token1 : " +st1.nextToken());
        System.out.println("token2 : "+st1.nextToken());
        System.out.println("token3 : "+st1.nextToken());
        
        
        // 
        
        String cita2= "uno$dos$tres$cuatro";
        st2=new StringTokenizer(cita2, "$");
        
        System.out.println("token1 : " +st2.nextToken());
        System.out.println("token2 : "+st2.nextToken());
        System.out.println("token3 : "+st2.nextToken());
        System.out.println("token4 : "+st2.nextToken());
        // TODO code application logic here
    }
    
}
