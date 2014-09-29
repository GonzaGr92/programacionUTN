/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public abstract class Profesor {
    protected int dni;
    protected String nombre;
    protected String direccion;

    public Profesor(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean presente(){
       boolean resul;
       String respuesta;
        do {            
            respuesta = JOptionPane.showInputDialog("El profesor esta en el establecimiento? (S/N)");
            respuesta = respuesta.toUpperCase();
            
        } while (!(respuesta.equals("S"))&&!(respuesta.equals("N")));
        if (respuesta.equals("S")) {
                resul = true;
            }else{
            resul = false;
        }
        return resul;
    }
    
    
}
