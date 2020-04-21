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
import negocio.Empresa;
import negocio.Perfil;

/**
 *
 * @author USER
 */
public class GestionEmpresa extends AbstractDB
{
    public boolean guardaEmpresa(Empresa empresa)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newEmpresa(?,?)");
            
            stmt.setString(1,empresa.getIdEmpresa());
            stmt.setString(2,empresa.getNombre());
           
            
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
    
    public ArrayList<Empresa> getTodos()
    {
        ArrayList<Empresa> empresas=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllEmpresa()");
             while(res.next())
             {
                 Empresa empresa = new Empresa();
                 empresa.setIdEmpresa(res.getString("idEmpresa"));
                 empresa.setNombre(res.getString("Nombre"));
                 
                 
                 empresas.add(empresa);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return empresas;
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
