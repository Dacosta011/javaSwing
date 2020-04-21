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
import negocio.Cliente;

/**
 *
 * @author USER
 */
public class GestionCliente extends AbstractDB
{
    public GestionCliente()
    {
        super();
    }
    
    public Cliente buscarCliente(String id) 
    {
        Cliente cliente=null;
        try 
        {
             ResultSet res;
             PreparedStatement stmt = this.conn.prepareStatement("call getCliente(?)");
             stmt.setString(1, id);
             res = stmt.executeQuery();
             
             while(res.next())
             {
                 cliente = new Cliente();
                 //Cliente cliente = new Cliente();
                 cliente.setIdCliente(res.getString("idCliente"));
                 cliente.setNombre(res.getString("Nombre"));
                 cliente.setDireccion(res.getString("Direccion"));
                 cliente.setTelefono(res.getString("Telefono"));
                 cliente.setEmail(res.getString("Email"));
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return cliente;
    }
    
    public boolean guardaCliente(Cliente cliente)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call newCliente(?,?,?,?,?)");
            
            stmt.setString(1,cliente.getIdCliente());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3,cliente.getDireccion());
            stmt.setString(4,cliente.getTelefono());
            stmt.setString(5,cliente.getEmail());
            
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
    
    public boolean eliminarCliente(String id)
    {
        boolean todoBien=false;
        try 
        {
            PreparedStatement stmt = this.conn.prepareStatement("call deleteCliente(?)");
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
    public boolean modificarCliente(Cliente cliente,String oldId)
    {
        boolean todoBien=false;
        try 
        {
            ResultSet res;
            PreparedStatement stmt = this.conn.prepareStatement("call modifyCliente(?,?,?,?,?,?)");
            
            stmt.setString(1,cliente.getIdCliente());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3,cliente.getDireccion());
            stmt.setString(4,cliente.getTelefono());
            stmt.setString(5,cliente.getEmail());
            stmt.setString(6, oldId);
            
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
    public ArrayList<Cliente> getTodos()
    {
        ArrayList<Cliente> clientes=new ArrayList();
        
        try 
        {
             Statement stmt = this.conn.createStatement();
             ResultSet res = stmt.executeQuery("call getAllClientes()");
             while(res.next())
             {
                 Cliente cliente = new Cliente();
                 cliente.setIdCliente(res.getString("idCliente"));
                 cliente.setNombre(res.getString("Nombre"));
                 cliente.setDireccion(res.getString("Direccion"));
                 cliente.setTelefono(res.getString("Telefono"));
                 cliente.setEmail(res.getString("Email"));   
                 clientes.add(cliente);
             }
             res.close();   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return clientes;
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
