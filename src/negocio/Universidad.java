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
public class Universidad 
{
    private String idUniversidad;
    private String Nombre;

    public Universidad() {
    }

    public Universidad(String idUniversidad, String Nombre) {
        this.idUniversidad = idUniversidad;
        this.Nombre = Nombre;
    }

    public String getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(String idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Universidad{" + "idUniversidad=" + idUniversidad + ", Nombre=" + Nombre + '}';
    }
    
    
}
