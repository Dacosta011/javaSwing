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

/**
 *
 * @author USER
 */
public class GestionPerfil extends AbstractDB
{
    
    public boolean guardaPerfil(Perfil perfil)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newPerfil(?,?)");
            
            stmt.setString(1,perfil.getIdPerfil());
            stmt.setString(2,perfil.getDescripcio());
           
            
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
    
    public ArrayList<Perfil> getTodos()
    {
        ArrayList<Perfil> perfiles=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllPerfiles()");
             while(res.next())
             {
                 Perfil perfil = new Perfil();
                 perfil.setIdPerfil(res.getString("idPerfil"));
                 perfil.setDescripcio(res.getString("Descripcion"));
                 
                 
                 perfiles.add(perfil);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return perfiles;
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
