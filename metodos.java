// Pedir 2 numeros, realizar una suma, pasar los valores de las variables a un metodo que los muestre por pantalla

import javax.swing.JOptionPane;


public class Metodos {
    public static void main (String [] args){
        int numeroA;
        int numeroB;
        int resultado;
        
        numeroA = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el primer numero a sumar"));
        numeroB = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el segundo numero a sumar"));
        resultado = numeroA + numeroB;
        
        mostrarPorPantalla (numeroA, numeroB, resultado);
    }

    static void mostrarPorPantalla(int numeroA, int numeroB, int resultado) {
        JOptionPane.showMessageDialog(null, "Numero A: " + numeroA
                + "\nNumero B: "+ numeroB
                + "\nOperacion: Suma"
                + "\nResultado: "+ resultado);
    }
}
