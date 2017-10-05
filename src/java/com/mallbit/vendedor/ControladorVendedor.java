/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallbit.vendedor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andres Ramos
 */
@WebServlet(name = "ControladorVendedor", urlPatterns = {"/ControladorVendedor"})
public class ControladorVendedor extends HttpServlet {

    private ModeloVendedor modeloVendedor = new ModeloVendedor();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Leer parametro (value) del input hidden del formulario
        String parametro = request.getParameter("instruccion");

        //Ejecutar método segun valor del parametro
        switch (parametro) {
            case "listarVendedores":
                
                break;
            case "insertarVendedor":
                insertarVendedorDB(request, response);
                break;
            case "validarVendedor":
                
                break;
            case "actualizarVendedor":
                
                break;
            case "borrarVendedor":
                
                break;
            default:
                break;
        }
    }
    
    private void insertarVendedorDB(HttpServletRequest request, HttpServletResponse response) {

        try {

            //Crear objeto Vendedor con los datos recibidos del formulario
            //<editor-fold defaultstate="collapsed" desc="Pasos para cambiar al formato fecha de MySQL">
            //Formato de fecha que aparece en la pagina
            //Definiendo el idioma de la fecha
            Locale idioma = new Locale("en");
            SimpleDateFormat formatPage = new SimpleDateFormat("dd MMM, yyyy", idioma);

            //Formato de fecha que acepta MySQL
            SimpleDateFormat formatSQL = new SimpleDateFormat("yyyy-MM-dd", idioma);

            Date fechaNacimiento = null;

            //Se pasa la fecha de la pagina a un objeto Date
            Date date = formatPage.parse(request.getParameter("fechaNacimiento"));
            //Se pasa el objeto Date al formato que admite MySQL
            fechaNacimiento = formatSQL.parse(formatSQL.format(date));
            System.out.println(fechaNacimiento);

            // </editor-fold>      
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String usuario = request.getParameter("usuario");
            String correo = request.getParameter("correo");
            long identificacion = Long.parseLong(request.getParameter("identificacion"));
            long telefono = Long.parseLong(request.getParameter("telefono"));
            String contraseña = request.getParameter("password");
            int idGenero = Integer.parseInt(request.getParameter("genero"));

            String existe = "";

            //Se verifica si existe otro cliente con ese Usuario
            List<Vendedor> vendedores = modeloVendedor.obtenerVendedoresDB();
            for (Vendedor vendedor : vendedores) {
                if (vendedor.getUsuario().equals(usuario)) {
                    existe = "existe";
                    break;
                }
            }

            Vendedor vendedor = new Vendedor(nombre, apellido, correo, identificacion, telefono, usuario, contraseña, fechaNacimiento, idGenero);

            //Enviar objeto al modelo para guardar en la Base de Datos
            modeloVendedor.agregarVendedorDB(vendedor);
            HttpSession session = request.getSession();
            session.setAttribute("CLIENTE_SESSION", vendedor);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
            /*}*/

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
