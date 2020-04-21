/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import conexiones.AbstractDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import negocio.Especialidad;
import negocio.Universidad;

/**
 *
 * @author USER
 */
public class GestionEspecialidad extends AbstractDB
{
    public boolean guardaEspecialidad(Especialidad especialidad)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newEspecialidad(?,?,?)");
            
            stmt.setString(1,especialidad.getIdEspecialidad());
            stmt.setString(2,especialidad.getNombre());
            stmt.setString(3,especialidad.getOrganizacion());
            
            res = stmt.executeQuery();
            res.close();
            todoBien=true;
            
        }
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        
        return todoBien;
    }
    
    public ArrayList<Especialidad> getTodos()
    {
        ArrayList<Especialidad> especialidades=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllEspecialidad()");
             while(res.next())
             {
                 Especialidad especialidad = new Especialidad();
                 especialidad.setIdEspecialidad(res.getString("idEspecialidad"));
                 especialidad.setNombre(res.getString("Nombre"));
                 especialidad.setOrganizacion(res.getString("Organizacion"));
                 
                 especialidades.add(especialidad);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return especialidades;
    }
    
   public void cierraConexion()
    {        
        try 
        {
            this.conn.close();
        } 
        catch (SQLException ex) 
        {
           // Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
