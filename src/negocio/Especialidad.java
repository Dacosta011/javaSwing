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
public class Especialidad {
    
    private String idEspecialidad;
    private String Nombre;
    private String Organizacion;

    public Especialidad() {
    }

    public Especialidad(String idEspecialidad, String Nombre, String Organizacion) {
        this.idEspecialidad = idEspecialidad;
        this.Nombre = Nombre;
        this.Organizacion = Organizacion;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String Organizacion) {
        this.Organizacion = Organizacion;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", Nombre=" + Nombre + ", Organizacion=" + Organizacion + '}';
    }  
}
