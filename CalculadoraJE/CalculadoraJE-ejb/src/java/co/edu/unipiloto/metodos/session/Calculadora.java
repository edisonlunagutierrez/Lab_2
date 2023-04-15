/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Stateless;

/**
 *
 * @author brayl
 */
@Stateless
public class Calculadora  {

  
	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
        
        public double modulo (double num1, double num2) {
		return num1 % num2;
	}
        

//    @Override
//    public double sumar(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    @Override
//    public double restar(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    @Override
//    public double multiplicar(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    @Override
//    public double dividir(int num1, int num2) {
//        return num1 / num2;
//    }

}
