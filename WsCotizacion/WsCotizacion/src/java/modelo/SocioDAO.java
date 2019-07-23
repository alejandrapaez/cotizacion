/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aapaez
 */
public class SocioDAO {
    conexion conexion;
    
    public  SocioDAO(){
     conexion = new conexion();
    }
    
    public List<socio> listasocio(){
        List lsitasocio= new ArrayList<>();
        socio socio;
        try {
            Connection Access = conexion.getConexion();
            PreparedStatement ps = Access.prepareStatement("select * from cotizacion.socio order by tasa asc");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                socio = new socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setTasa(rs.getDouble(3));
                socio.setMontomaximo(rs.getDouble(4));
                lsitasocio.add(socio);
                
            }
        } catch (Exception e) {
        }
        return lsitasocio;
    }
    
}
