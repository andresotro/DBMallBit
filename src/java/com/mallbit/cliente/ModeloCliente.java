package com.mallbit.cliente;

import java.util.*;
import java.util.Date;

import com.mallbit.Conexion.ConexionDB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class ModeloCliente {
		
		public List<Cliente> obtenerClientesDB() throws Exception {

	        List<Cliente> clientes = new ArrayList<>();

	        Connection connection;
	        Statement statement;
	        ResultSet resultSet;

	        //Establecer la conexi�n
	        connection = ConexionDB.conectar();

	        //Crear sentencia SQL y statement
	        String sentenciaSQL = "SELECT * FROM cliente";
	        statement = connection.createStatement();

	        //Ejecutar SQL y guardar valores de consulta en resultSet
	        resultSet = statement.executeQuery(sentenciaSQL);

	        //Recorrer resultador de la sentencia
	        while (resultSet.next()) {
	            int id = resultSet.getInt("IDCliente"); 
	            String nombre = resultSet.getString("Nombre");
	            String apellido = resultSet.getString("Apellido");
	            String correo = resultSet.getString("Correo");
                    int identificacion = resultSet.getInt("identificacion");
                    int telefono = resultSet.getInt("telefono");
	            String usuario = resultSet.getString("Usuario");
	            String contraseña = resultSet.getString("Password");
	            Date fechaNacimiento = resultSet.getDate("FechaNacimiento");
	            int idGenero = resultSet.getInt("IDGenero");

	            clientes.add(new Cliente(id, nombre, apellido, correo, identificacion, telefono, usuario, contraseña, fechaNacimiento, idGenero));

	        }
	        return clientes;
	    }

	    public void agregarClienteDB(Cliente cliente) throws SQLException {
	        
	        Connection connection;
	        PreparedStatement preparedStatement;

	        //Establecer la conexi�n
	        connection = ConexionDB.conectar();

	        //Crear sentencia SQL y statement
	        String sentenciaSQL = "INSERT INTO cliente "
	                + "(Nombre,Apellido,Correo,Identificacion,Telefono,Usuario,Password,FechaNacimiento,IDGenero) VALUES (?,?,?,?,?,?,?,?,?)";
	        preparedStatement = connection.prepareStatement(sentenciaSQL);
	        
	        //Pasar valores del objeto cliente a la sentenciaSQL
	        preparedStatement.setString(1, cliente.getNombre());
	        preparedStatement.setString(2, cliente.getApellido());
	        preparedStatement.setString(3, cliente.getCorreo());
                preparedStatement.setLong(4, cliente.getIdentificacion());
                preparedStatement.setLong(5, cliente.getTelefono());
	        preparedStatement.setString(6, cliente.getUsuario());
	        preparedStatement.setString(7, cliente.getContraseña());
	        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
	        preparedStatement.setString(8, formatDate.format(cliente.getFechaNacimiento()));
	        preparedStatement.setInt(9, cliente.getIdGenero());
	        
	        preparedStatement.execute();
	    }
	    
	  
	
}
