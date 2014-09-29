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
public class Main {

    public static void main(String[] args) {
        P_Teoria pt;
        P_Practicas pp;
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Registro de profesores. Elija una opcion"
                    + "\n1. Registrar un profesor de teoria"
                    + "\n2. Registrar un profesor de practicas"
                    + "\n3. Salir"));
            if (menu == 1) {
                String nombre = JOptionPane.showInputDialog("Nombre: ");
                String apellido = JOptionPane.showInputDialog("Apellido: ");
                int nroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Nro de Documento: "));
                String clase = JOptionPane.showInputDialog("Clase: ");
                String turno = JOptionPane.showInputDialog("Turno: ");
                int nroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de alumnos: "));

                pt = new P_Teoria(clase, turno, nroAlumnos, nroDocumento, nombre, apellido);
                if (pt.presente()) {
                    JOptionPane.showMessageDialog(null, "El profesor esta presente");
                } else {
                    JOptionPane.showMessageDialog(null, "El profesor esta ausente");
                }

            }
            if (menu == 2) {
                String nombre = JOptionPane.showInputDialog("Nombre: ");
                String apellido = JOptionPane.showInputDialog("Apellido: ");
                int nroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Nro de Documento: "));
                String coche = JOptionPane.showInputDialog("Coche: ");
                String modalidad = JOptionPane.showInputDialog("Modalidad: ");

                pp = new P_Practicas(coche, modalidad, nroDocumento, nombre, apellido);
                
                if (pp.presente()) {
                    JOptionPane.showMessageDialog(null, "El profesor esta presente");
                } else {
                    JOptionPane.showMessageDialog(null, "El profesor esta ausente");
                }
            }
            if (menu == 3) {
                JOptionPane.showMessageDialog(null, "El programa terminara");
            }
            if (menu != 1 && menu != 2 && menu != 3) {
                JOptionPane.showMessageDialog(null, "La opcion ingresada es incorrecta");

            }

        } while (!(menu == 3));

    }
}
