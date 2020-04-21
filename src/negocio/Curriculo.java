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
public class Curriculo 
{
    private String cedula;
    private String id;

    public Curriculo() {
    }

    public Curriculo(String cedula, String id) {
        this.cedula = cedula;
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Curriculo{" + "cedula=" + cedula + ", id=" + id + '}';
    }
}
