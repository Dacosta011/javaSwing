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
public class Cargo 
{
    private String ID;
    private String Nombre;

    public Cargo() 
    {
        this.ID="";
        this.Nombre="";
    }

    public Cargo(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Cargo{" + "ID=" + ID + ", Nombre=" + Nombre + '}';
    }
    
    
}
