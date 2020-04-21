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
public class Perfil 
{
    private String IdPerfil;
    private String Descripcio;

    public Perfil() 
    {
        this.IdPerfil="";
        this.Descripcio="";
    }

    public Perfil(String IdPerfil, String Descripcio) {
        this.IdPerfil = IdPerfil;
        this.Descripcio = Descripcio;
    }

    public String getIdPerfil() {
        return IdPerfil;
    }

    public void setIdPerfil(String IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    public String getDescripcio() {
        return Descripcio;
    }

    public void setDescripcio(String Descripcio) {
        this.Descripcio = Descripcio;
    }

    @Override
    public String toString() {
        return "Perfil{" + "IdPerfil=" + IdPerfil + ", Descripcio=" + Descripcio + '}';
    } 
}
