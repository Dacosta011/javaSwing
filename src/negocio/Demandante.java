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
public class Demandante 
{
    private String Cedula;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String TipoLicencia;
    private String Perfil;
    private String NombreFoto;    

    public Demandante() 
    {
        this.Cedula="";
        this.Nombre="";
        this.Direccion="";
        this.Telefono="";
        this.TipoLicencia="";
        this.Perfil="";
        this.NombreFoto="";
    }

    public Demandante(String Cedula, String Nombre, String Direccion, String Telefono, String TipoLicencia, String Perfil, String NombreFoto) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.TipoLicencia = TipoLicencia;
        this.Perfil = Perfil;
        this.NombreFoto = NombreFoto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTipoLicencia() {
        return TipoLicencia;
    }

    public void setTipoLicencia(String TipoLicencia) {
        this.TipoLicencia = TipoLicencia;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getNombreFoto() {
        return NombreFoto;
    }

    public void setNombreFoto(String NombreFoto) {
        this.NombreFoto = NombreFoto;
    }

    @Override
    public String toString() {
        return "Demandante{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", TipoLicencia=" + TipoLicencia + ", Perfil=" + Perfil + ", NombreFoto=" + NombreFoto + '}';
    }
}
