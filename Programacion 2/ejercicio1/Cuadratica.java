/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public class Cuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        int continuar = 0;
        double a;
        double b;
        double c;
        double discriminante;
        double x1;
        double x2;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion"
                    + "\n1.  Calcular las raices de una ecuacion cuadratica"
                    + "\n2.  Salir del programa"));

            if (menu == 1) {
                do {
                    a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a (distinto de 0)"));
                } while (!(a != 0));
                b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
                c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));

                discriminante = ((b * b) - (4 * a * c));

                if (discriminante > 0) {
                    x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                    JOptionPane.showMessageDialog(null, "La ecuacion posee 2 raices reales"
                            + "\nx1= " + x1
                            + "\nx2= " + x2);
                } else {
                    if (discriminante == 0) {
                        x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                        JOptionPane.showMessageDialog(null, "La ecuacion posee una raiz real"
                                + "\nx1= " + x1);
                    } else {
                        JOptionPane.showMessageDialog(null, "La ecuacion no posee raices reales");
                    }
                }

                continuar = Integer.parseInt(JOptionPane.showInputDialog("Desea volver a calcular una raiz? "
                        + "\n1.  Si"
                        + "\n2.  No"));
            }
        } while ((continuar != 2) && (menu != 2));
    }

}
