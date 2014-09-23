/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public class MainEj3 {
    public static void main(String[] args) {
        String cadena;
        int numero;
                
        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        
        Ejercicio3 ej3 = new Ejercicio3(numero , cadena);
        
        ej3.mostrarAtributos();
        System.out.println("Get Alfa: " + ej3.getAlfa());
        System.out.println("Mayus Beta: " + ej3.mayusBeta(cadena));
        ej3.setAlfa(1992039940);
        System.out.println("Set Alfa (nuevo alfa): "+ ej3.getAlfa());
         
    }
}
