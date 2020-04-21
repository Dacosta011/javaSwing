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
public class ExperienciaDemandante 
{
    private String cedula;
    private String idExperiencia;

    public ExperienciaDemandante() {
        this.cedula="";
        this.idExperiencia="";
    }

    public ExperienciaDemandante(String cedula, String idExperiencia) {
        this.cedula = cedula;
        this.idExperiencia = idExperiencia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(String idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    @Override
    public String toString() {
        return "ExperienciaDemandante{" + "cedula=" + cedula + ", idExperiencia=" + idExperiencia + '}';
    }
  
}
