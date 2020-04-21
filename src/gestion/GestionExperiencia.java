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

/**
 *
 * @author USER
 */
public class GestionExperiencia extends AbstractDB
{
    public boolean guardaExperiencia(Experiencia experiencia)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newExperiencia(?,?,?,?)");
            
            stmt.setString(1,experiencia.getIdExperiencia());
            stmt.setString(2,experiencia.getTiempo());
            stmt.setString(3,experiencia.getEmpresa());
            stmt.setString(4,experiencia.getCargo());
            
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
    
    public ArrayList<Experiencia> getTodos()
    {
        ArrayList<Experiencia> experiencias=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllExperiencia()");
             while(res.next())
             {
                 Experiencia experiencia = new Experiencia();
                 experiencia.setIdExperiencia(res.getString("idExperiencia"));
                 experiencia.setTiempo(res.getString("Tiempo"));
                 experiencia.setEmpresa(res.getString("Empresa"));
                 experiencia.setCargo(res.getString("Cargo"));
                 
                 experiencias.add(experiencia);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return experiencias;
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
