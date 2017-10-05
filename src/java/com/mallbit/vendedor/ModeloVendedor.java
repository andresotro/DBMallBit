/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallbit.vendedor;

import com.mallbit.Conexion.ConexionDB;
import com.mallbit.cliente.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andres Ramos
 */
public class ModeloVendedor {
    
    public List<Vendedor> obtenerVendedoresDB() throws Exception {

        List<Vendedor> vendedores = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM vendedor";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);

        //Recorrer resultador de la sentencia
        while (resultSet.next()) {
            int id = resultSet.getInt("IDVendedor");
            String nombre = resultSet.getString("Nombre");
            String apellido = resultSet.getString("Apellido");
            String correo = resultSet.getString("Correo");
            long identificacion = resultSet.getLong("Identificacion");
            long telefono = resultSet.getLong("Telefono");
            String usuario = resultSet.getString("Usuario");
            String contraseña = resultSet.getString("Password");
            Date fechaNacimiento = resultSet.getDate("FechaNacimiento");
            int idGenero = resultSet.getInt("IDGenero");

            vendedores.add(new Vendedor(id, nombre, apellido, correo, identificacion, telefono, usuario, contraseña, fechaNacimiento, idGenero));

        }
        return vendedores;
    }

    public void agregarVendedorDB(Vendedor vendedor) throws SQLException {

        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "INSERT INTO vendedor "
                + "(Nombre,Apellido,Correo,Identificacion,Telefono,Usuario,Password,FechaNacimiento,IDGenero) VALUES (?,?,?,?,?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);

        //Pasar valores del objeto cliente a la sentenciaSQL
        preparedStatement.setString(1, vendedor.getNombre());
        preparedStatement.setString(2, vendedor.getApellido());
        preparedStatement.setString(3, vendedor.getCorreo());
        preparedStatement.setLong(4, vendedor.getIdentificacion());
        preparedStatement.setLong(5, vendedor.getTelefono());
        preparedStatement.setString(6, vendedor.getUsuario());
        preparedStatement.setString(7, vendedor.getContraseña());
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        preparedStatement.setString(8, formatDate.format(vendedor.getFechaNacimiento()));
        preparedStatement.setInt(9, vendedor.getIdGenero());

        preparedStatement.execute();
    }
}
