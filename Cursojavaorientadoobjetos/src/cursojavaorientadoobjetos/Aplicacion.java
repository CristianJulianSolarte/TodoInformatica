/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaorientadoobjetos;

/**
 *
 * @author Julian
 */
public class Aplicacion {
  public static void main (String[] arguments)
  {
      Cursojavaorientadoobjetos robot =new Cursojavaorientadoobjetos();
      System.out.println("cambiando atribuos");
      robot.estado="afuera";
      robot.temperatura=123;
      robot.velocidad=34;
      robot.mostraratributos();
      System.out.println("cambiando velocidad");
      robot.velocidad=3;
      robot.mostraratributos();
      robot.temperatura=3;
      robot.mostraratributos();
      System.out.println("mostrando metodo comprobar temperatura");
      robot.ComprobarTemperatura();
      robot.mostraratributos();
  }
    
}
