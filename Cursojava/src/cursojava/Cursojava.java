/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author Julian
 */
public class Cursojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //ARRAYS
        int [] renta =new int [5]; //asi s crea un array, 
        //array pasandole los valores iniciales
        String nombres []= {"luna", "camila", "gatodluffy", "miss"}; 
        // TODO code application logic here
        // Modificar Arrays
        renta [2] =123;
        float [] precio = new float [6];
        // length me dice el tama?o del array
        System.out.println("hay "+nombres.length + " nombres");
        
        String frase = "i dont get people never have never will";
        
       //char convertir [ ] =frase.toCharArray();
       
       /*for (int pos = 0; pos < convertir.length; pos ++ )
       {
           char actual= convertir[pos];
           
           if (actual != ' ')
           { 
               System.out.print(actual);
           }
           else 
           {
               System.out.print('.');
           }
           }*/
           
       
       
       // Arreglos multidimensionales 
       
       float puntoscartesianos[][][]= new float [4][4][4];
       puntoscartesianos [2][3][2] =1;
       puntoscartesianos [3][1][1]= 2;
       System.out.print( puntoscartesianos [3][1][1]);
       
       
       }
        
        
    }
    

