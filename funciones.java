// Crear una funcion que sume dos numeros, mostrar el resultado

import javax.swing.JOptionPane;


public class Funciones {
    
    public static void main (String [] args){
        int numeroA;
        int numeroB;
        int resultado;
        
        numeroA = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el primer numero a sumar"));
        numeroB = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el segundo numero a sumar"));
        
        resultado = sumar(numeroA, numeroB);
        
        JOptionPane.showMessageDialog(null, "El resultado de " + numeroA + " + " + numeroB + "= " + resultado);
        
    }

    static int sumar(int numeroA, int numeroB) {
        int auxSuma;
        auxSuma = numeroA + numeroB;
        return auxSuma;
    }
}
