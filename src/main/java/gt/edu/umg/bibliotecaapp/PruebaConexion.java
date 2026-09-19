/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.bibliotecaapp;

import gt.edu.umg.biblioteca.conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author emanu
 */
public class PruebaConexion {
        public static void main(String[] args) {

        try {

            Connection cn = Conexion.Conectar();

            System.out.println(
                    "CONEXION EXITOSA"
            );

            System.out.println(
                    "Java esta conectado a SQL Server"
            );

            cn.close();

        } catch (SQLException e) {

            System.out.println(
                    "ERROR DE CONEXION"
            );

            System.out.println(
                    e.getMessage()
            ); 
           }
        }
}
