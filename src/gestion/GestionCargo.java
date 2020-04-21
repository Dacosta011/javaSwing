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
import negocio.Cargo;
import negocio.Empresa;

/**
 *
 * @author USER
 */
public class GestionCargo extends AbstractDB
{
    public boolean guardaCargo(Cargo cargo)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newCargo(?,?)");
            
            stmt.setString(1,cargo.getID());
            stmt.setString(2,cargo.getNombre());
           
            
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
    
    public ArrayList<Cargo> getTodos()
    {
        ArrayList<Cargo> cargos=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllCargo()");
             while(res.next())
             {
                 Cargo cargo = new Cargo();
                 cargo.setID(res.getString("idCargo"));
                 cargo.setNombre(res.getString("nombre_cargo"));
                 
                 
                 cargos.add(cargo);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return cargos;
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
