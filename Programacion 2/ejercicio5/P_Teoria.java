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
public class P_Teoria extends Profesor{
    private String clase;
    private String turno;
    private int num_alumnos;

    public P_Teoria(String clase, String turno, int num_alumnos, int dni, String nombre, String direccion) {
        super(dni, nombre, direccion);
        this.clase = clase;
        this.turno = turno;
        this.num_alumnos = num_alumnos;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setNum_alumnos(int num_alumnos) {
        this.num_alumnos = num_alumnos;
    }
    
    
}
