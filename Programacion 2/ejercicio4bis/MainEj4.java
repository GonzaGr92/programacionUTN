/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4bis;

import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public class MainEj4 {

    public static void main(String[] args) {
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Calculo de Superficies y Perimetros"
                    + "\n1. Circulo"
                    + "\n2. Trapecio"
                    + "\n3. Triangulo Rectangulo"
                    + "\n4. Rectangulo"
                    + "\n5. Salir"));
            
            if (menu == 1) {

                double radio;
                float espesorCir;

                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                espesorCir = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del circulo"));

                Circulo c1 = new Circulo(radio, espesorCir);

                System.out.println("----------- CIRCULO");
                System.out.println("Perimetro: " + c1.perimetro());
                System.out.println("Superficie: " + c1.superficie());
                System.out.println("Costo: $" + c1.costo());
            }
            
            if (menu == 2) {

                double alturaTra;
                double bMayor;
                double bMenor;
                float espesorTra;

                alturaTra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del trapecio"));
                bMayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor del trapecio"));
                bMenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor del trapecio"));
                espesorTra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del trapecio"));

                Trapecio t1 = new Trapecio(alturaTra, bMayor, bMenor, espesorTra);

                System.out.println("----------- TRAPECIO");
                System.out.println("Perimetro: " + t1.perimetro());
                System.out.println("Superficie: " + t1.superficie());
                System.out.println("Costo: $" + t1.costo());
            }
            
            if (menu == 3) {

                double hipotenusa;
                double alturaTriRec;
                float espesorTriRec;

                hipotenusa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la hipotenusa del triangulo rectangulo"));
                alturaTriRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo rectangulo"));
                espesorTriRec = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del triangulo rectangulo"));

                TrianguloRect tr1 = new TrianguloRect(hipotenusa, alturaTriRec, espesorTriRec);

                System.out.println("----------- TRIANGULO RECTANGULO");
                System.out.println("Perimetro: " + tr1.perimetro());
                System.out.println("Superficie: " + tr1.superficie());
                System.out.println("Costo: $" + tr1.costo());
            }
            
            if (menu == 4) {

                double alto;
                double ancho;
                float espesorRec;

                alto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto del rectangulo"));
                ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ancho del rectangulo"));
                espesorRec = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el espesor del rectangulo"));

                Rectangulo r1 = new Rectangulo(alto, ancho, espesorRec);

                System.out.println("----------- RECTANGULO");
                System.out.println("Perimetro: " + r1.perimetro());
                System.out.println("Superficie: " + r1.superficie());
                System.out.println("Costo: $" + r1.costo());
            }
            
        } while (!(menu==5));

    }
}
