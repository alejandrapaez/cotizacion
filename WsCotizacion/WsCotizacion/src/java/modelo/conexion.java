/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;

/**
 *
 * @author aapaez
 */
public class conexion {
    
    public conexion(){
    
    }
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql:testdispapeles.ck3glzts7fjz.us-east-1.rds.amazonaws.com:3306/DESARROLLO", "sadispapeles", "Sdf45.rdswK47h5j");
            
        } catch (Exception e) {
        }
        return con;
    }
}
