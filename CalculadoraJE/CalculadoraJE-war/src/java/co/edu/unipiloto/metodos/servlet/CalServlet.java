/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.servlet;

import co.edu.unipiloto.metodos.session.Calculadora;
import co.edu.unipiloto.metodos.session.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brayl
 */
@WebServlet("/calcular")
public class CalServlet extends HttpServlet {

    @EJB
    private Calculadora calculadora;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operacion = request.getParameter("operacion");
        Calculadora calc = new Calculadora();
        double resultado = 0;

        switch (operacion) {
            case "sumar":
                resultado = calc.sumar(num1, num2);
                break;
            case "restar":
                resultado = calc.restar(num1, num2);
                break;
            case "multiplicar":
                resultado = calc.multiplicar(num1, num2);
                break;
            case "dividir":
                resultado = calc.dividir(num1, num2);
                break;
            case "modulo":
                resultado = calc.modulo(num1, num2);
                break;
        }

        // almacenamos el resultado como atributo de solicitud
        request.setAttribute("resultado", resultado);

        // obtenemos el objeto RequestDispatcher y enviamos la solicitud al JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("calculadora.jsp");
        dispatcher.forward(request, response);
    }
}

