/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallbit.local;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres Ramos
 */
@WebServlet(name = "ControladorLocal", urlPatterns = {"/ControladorLocal"})
public class ControladorLocal extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Leer parametro (value) del input hidden del formulario
        String parametro = request.getParameter("instruccion");

        //Ejecutar método según valor del parametro
        switch (parametro) {
            case "listarLocales":
                
                break;
            case "insertarLocal":
                
                break;
            case "validarLocal":
                
                break;
            case "actualizarLocal":
                
                break;
            case "borrarLocal":
                
                break;
            default:
                break;
        }
    }
    
    

}
