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
import negocio.Demandante;
import negocio.Experiencia;
import negocio.Titulacion;

/**
 *
 * @author USER
 */
public class GestionTitulacion extends AbstractDB
{
     public boolean guardaTitulacion(Titulacion titulacion)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newTitulacion(?,?,?,?)");
            
            stmt.setString(1,titulacion.getIdTitulacion());
            stmt.setString(2,titulacion.getTitulo());
            stmt.setString(3,titulacion.getUniversidad());
            stmt.setString(4,titulacion.getEspecialidad());
            
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
     
     public ArrayList<Titulacion> getTodos()
    {
        ArrayList<Titulacion> titulaciones=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllTitulaciones()");
             while(res.next())
             {
                 Titulacion titulacion = new Titulacion();
                 titulacion.setIdTitulacion(res.getString("idTitulacion"));
                 titulacion.setTitulo(res.getString("Titulo"));
                 titulacion.setUniversidad(res.getString("Universidad"));
                 titulacion.setEspecialidad(res.getString("Especializacion"));
                
                 titulaciones.add(titulacion);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return titulaciones;
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
