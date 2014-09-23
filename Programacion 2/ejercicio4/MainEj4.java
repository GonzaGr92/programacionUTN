/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public class MainEj4 {
    public static void main(String[] args) {
        double radio;
        float espesorCir;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        espesorCir = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del circulo"));
        
        Circulo c1 = new Circulo(radio, espesorCir);
        
        System.out.println("----------- CIRCULO");
        System.out.println("Perimetro: "+c1.perimetro());
        System.out.println("Superficie: "+c1.superficie());
        System.out.println("Costo: $"+c1.costo());
        
        double altura;
        double bMayor;
        double bMenor;
        float espesorTra;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del trapecio"));
        bMayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor del trapecio"));
        bMenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor del trapecio"));
        espesorTra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del trapecio"));
        
        Trapecio t1 = new Trapecio(altura, bMayor, bMenor, espesorTra);
        
        System.out.println("----------- TRAPECIO");
        System.out.println("Perimetro: "+t1.perimetro());
        System.out.println("Superficie: "+t1.superficie());
        System.out.println("Costo: $"+t1.costo());
        
    }
}
