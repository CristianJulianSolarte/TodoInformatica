/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabasedatos;

import java.sql.*; // importamos java.sql para poder trabajar con SQL :P
/**
 *
 * @author Julian
 */
public class Pruebabasedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Variable para almacenar la URL de conexión a nuestra Base de Datos,
 si esta estuviera en otra máquina, necesitariamos estar registrados
 en ella y contar con su IP*/
String direccion = "jdbc:postgresql://192.168.189.129:5432/pruebadb";
try{
    //Acceso al Driver
Class.forName("org.postgresql.Driver");
//La conexión con los parámetros necesarios
Connection con = DriverManager.getConnection( direccion,"usu_prueba","123456");
//Abrimos la conexión y la iniciamos
Statement stmt = con.createStatement();
/*Un ResultSet es como en .NET un DataSet, un arreglo temporal donde se
 almacenará el resultado de la consulta SQL*/
ResultSet rs;
//Una variable String para almacenar la sentencia SQL
String requerir = "select * from juegos";
//En el ResultSet guardamos el resultado de ejecutar la consulta
rs = stmt.executeQuery(requerir);
//En un ciclo while recorremos cada fila del resultado de nuestro Select
while ( rs.next()){
    /*Aqui practicamente podemos hacer lo que deseemos con el resultado,
     en mi caso solo lo mande a imprimir*/
    System.out.println(rs.getString("nombre") + " " + rs.getString("genero")); //+ " " +
//rs.getString("fecha") + " " + rs.getString("carrera"));
    }
//Cerramos la conexión
stmt.execute("END");
stmt.close();
con.close();
}
catch( Exception e ){
    //Por si ocurre un error
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}
