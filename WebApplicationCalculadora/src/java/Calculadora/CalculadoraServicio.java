/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Julian
 */
@WebService(serviceName = "CalculadoraServicio")
public class CalculadoraServicio {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public int Calculadora(@WebParam(name = "Num1") int Num1, @WebParam(name = "Num2") int Num2) {
        //TODO write your implementation code here:
        return Num1+Num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "Num3") int Num3, @WebParam(name = "Num4") int Num4) {
        //TODO write your implementation code here:
        return Num3+Num4;
    }
}
