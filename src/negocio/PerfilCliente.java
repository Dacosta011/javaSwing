/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author USER
 */
public class PerfilCliente 
{
    private String idPerfil;
    private String idCliente;

    public PerfilCliente() {
        this.idPerfil="";
        this.idCliente="";
    }

    public PerfilCliente(String idPerfil, String idCliente) {
        this.idPerfil = idPerfil;
        this.idCliente = idCliente;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "PerfilCliente{" + "idPerfil=" + idPerfil + ", idCliente=" + idCliente + '}';
    }
    
    
}
