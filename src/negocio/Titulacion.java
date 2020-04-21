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
public class Titulacion 
{
    private String idTitulacion;
    private String Titulo;
    private String Universidad;
    private String Especialidad;

    public Titulacion() {
        this.idTitulacion="";
        this.Titulo="";
        this.Universidad="";
        this.Especialidad="";
    }

    public Titulacion(String idTitulacion, String Titulo, String Universidad, String Especialidad) {
        this.idTitulacion = idTitulacion;
        this.Titulo = Titulo;
        this.Universidad = Universidad;
        this.Especialidad = Especialidad;
    }

    public String getIdTitulacion() {
        return idTitulacion;
    }

    public void setIdTitulacion(String idTitulacion) {
        this.idTitulacion = idTitulacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return "Titulacion{" + "idTitulacion=" + idTitulacion + ", Titulo=" + Titulo + ", Universidad=" + Universidad + ", Especialidad=" + Especialidad + '}';
    }
    
    
}
