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
import negocio.Perfil;
import negocio.Universidad;

/**
 *
 * @author USER
 */
public class GestionUniversidad extends AbstractDB
{
    public boolean guardaUniversidad(Universidad universidad)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newUniversidad(?,?)");
            
            stmt.setString(1,universidad.getIdUniversidad());
            stmt.setString(2,universidad.getNombre());
           
            
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
    
    public ArrayList<Universidad> getTodos()
    {
        ArrayList<Universidad> universidades=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllUniversidad()");
             while(res.next())
             {
                 Universidad universidad = new Universidad();
                 universidad.setIdUniversidad(res.getString("idUniversidad"));
                 universidad.setNombre(res.getString("Nombre"));
                 
                 
                 universidades.add(universidad);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return universidades;
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
