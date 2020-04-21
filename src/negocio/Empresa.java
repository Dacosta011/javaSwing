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
public class Empresa 
{
    private String idEmpresa;
    private String Nombre;

    public Empresa() 
    {
        this.idEmpresa="";
        this.Nombre="";
    }

    public Empresa(String idEmpresa, String Nombre) {
        this.idEmpresa = idEmpresa;
        this.Nombre = Nombre;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", Nombre=" + Nombre + '}';
    }
    
    
}
