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
import negocio.Curriculo;
import negocio.Titulacion;

/**
 *
 * @author USER
 */
public class GestionCurriculo extends AbstractDB
{
    public boolean guardaCurriculo(Curriculo curriculo)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newCurriculo(?,?)");
            
            stmt.setString(1,curriculo.getCedula());
            stmt.setString(2,curriculo.getId());
            
            
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
