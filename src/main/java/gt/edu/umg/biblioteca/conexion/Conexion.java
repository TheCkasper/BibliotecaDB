/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.biblioteca.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    public static Connection Conectar(){
        Connection conexion = null;
        try{
            String url = "jdbc:sqlserver://localhost;"
                    +"instanceName=MSSQLSERVER01;"
                    +"databaseName=BibliotecaDB;"
                    +"encrypt=true;"
                    +"trustServerCertificate=true;";
            String usuario = "sa";
            String password = "java2026";
            
            conexion = DriverManager.getConnection(url,usuario,password);
            
            System.out.println("Conexion Exitosa a SQL SERVER xD");
        }catch (SQLException e){
            System.out.println("Error de Conexion: "+e.getMessage());
            
        }
        return conexion;
    
    }
}
