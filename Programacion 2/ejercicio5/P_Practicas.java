/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio5;

/**
 *
 * @author gonzalo
 */
public class P_Practicas extends Profesor{
    private String coche;
    private String modalidad;

    public P_Practicas(String coche, String modalidad, int dni, String nombre, String direccion) {
        super(dni, nombre, direccion);
        this.coche = coche;
        this.modalidad = modalidad;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
}
