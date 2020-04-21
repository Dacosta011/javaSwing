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

/**
 *
 * @author USER
 */
public class GestionDemandante extends AbstractDB
{
    public GestionDemandante() 
    {
        super();
    }
    public Demandante buscarDemandante(String id) 
    {
        Demandante demandante=null;
        try 
        {
             ResultSet res;
             PreparedStatement stmt = this.conn.prepareStatement("call getDemandante(?)");
             stmt.setString(1, id);
             res = stmt.executeQuery();
             
             while(res.next())
             {
                 demandante = new Demandante();
                 //Demandante demandante = new Demandante();
                 demandante.setCedula(res.getString("Cedula"));
                 demandante.setNombre(res.getString("nombre"));
                 demandante.setDireccion(res.getString("direccion"));
                 demandante.setTelefono(res.getString("telefono"));
                 demandante.setTipoLicencia(res.getString("tipo_licencia"));
                 demandante.setPerfil(res.getString("perfil"));
                 demandante.setNombreFoto(res.getString("NombreFoto"));
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return demandante;
    }
    public boolean guardaDemandante(Demandante demandante)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newDemandante(?,?,?,?,?,?,?)");
            
            stmt.setString(1,demandante.getCedula());
            stmt.setString(2,demandante.getNombre());
            stmt.setString(3,demandante.getDireccion());
            stmt.setString(4,demandante.getTelefono());
            stmt.setString(5,demandante.getTipoLicencia());
            stmt.setString(6,demandante.getPerfil());
            stmt.setString(7,demandante.getNombreFoto());
            
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
    public boolean eliminarDemandante(String id)
    {
        boolean todoBien=false;
        try 
        {
            PreparedStatement stmt = this.conn.prepareStatement("call deleteDemandante(?)");
            stmt.setString(1, id);
            stmt.execute();
            todoBien=true;
        }
        catch (SQLException ex) 
        {
            System.err.println(ex);
        }
        
        return todoBien;
    }
    public boolean modificarDemandante(Demandante demandante,String oldId)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call modifyDemandante(?,?,?,?,?,?,?,?)");
            
            stmt.setString(1,demandante.getCedula());
            stmt.setString(2,demandante.getNombre());
            stmt.setString(3,demandante.getDireccion());
            stmt.setString(4,demandante.getTelefono());
            stmt.setString(5,demandante.getTipoLicencia());
            stmt.setString(6,demandante.getPerfil());
            stmt.setString(7,demandante.getNombreFoto());
            stmt.setString(8, oldId);
            
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
    public ArrayList<Demandante> getTodos()
    {
        ArrayList<Demandante> demandantes=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllDemandantes()");
             while(res.next())
             {
                 Demandante demandante = new Demandante();
                 demandante.setCedula(res.getString("Cedula"));
                 demandante.setNombre(res.getString("nombre"));
                 demandante.setDireccion(res.getString("direccion"));
                 demandante.setTelefono(res.getString("telefono"));
                 demandante.setTipoLicencia(res.getString("tipo_licencia"));
                 demandante.setPerfil(res.getString("perfil"));
                 demandante.setNombreFoto(res.getString("NombreFoto"));
                 
                 demandantes.add(demandante);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return demandantes;
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
