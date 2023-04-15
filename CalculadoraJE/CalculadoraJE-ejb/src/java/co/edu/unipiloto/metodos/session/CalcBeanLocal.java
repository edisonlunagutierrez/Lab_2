/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Local;

/**
 *
 * @author brayl
 */
@Local
public interface CalcBeanLocal {

     double  sumar(int num1, int num2);
     double restar(int num1, int num2);
     double multiplicar(int num1, int num2);
     double dividir(int num1, int num2);
       
}
