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
public class Experiencia 
{
    private String idExperiencia;
    private String Tiempo;
    private String Empresa;
    private String Cargo;

    public Experiencia() 
    {
        this.idExperiencia="";
        this.Tiempo="";
        this.Empresa="";
        this.Cargo="";
    }

    public Experiencia(String idExperiencia, String Tiempo, String Empresa, String Cargo) {
        this.idExperiencia = idExperiencia;
        this.Tiempo = Tiempo;
        this.Empresa = Empresa;
        this.Cargo = Cargo;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(String idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "idExperiencia=" + idExperiencia + ", Tiempo=" + Tiempo + ", Empresa=" + Empresa + ", Cargo=" + Cargo + '}';
    }
    
    
}
