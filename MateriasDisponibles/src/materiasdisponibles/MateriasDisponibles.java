/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiasdisponibles;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author presario
 */
public class MateriasDisponibles extends JFrame{

    /**
     * @param args the command line arguments
     */
   
    static final String BD = "oferta_academica";
    static final String usuario= "root";
    
    public static void main(String[] args) {
        // TODO code application logic here
        String materia;
        String clave;
        String carrera;
        boolean matDisponibles;
        
        OfertaAcademica ventana = new OfertaAcademica();
        ventana.setVisible(true);
        
        
        //Conexion a base de datos MySQL
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+BD,usuario,"");
// Otros y operaciones sobre la base de datos..
        } catch (SQLException ex) {
// Mantener el control sobre el tipo de error
            System.out.println("SQLException: " + ex.getMessage());
        }
        
        
        
    }
    
}
