package clase2;
import javax.swing.*;

//USO DEL BUCLE FOR Y CONVERSION NUMEROS NEGATIVOS A POSITIVOS

public class Ej2 {

     public static void main(String[] args) {
         int numero, positivo, contador=0;

         for (int i = 0; i < 10; i++) {
             String a = JOptionPane.showInputDialog("Ingrese un numero");
             numero= Integer.parseInt (a);

             if (numero<0) {
                 positivo= numero*(-1);
                 JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" se convirtio a "+positivo);
                 contador++;
             }
         }

         JOptionPane.showMessageDialog(null, "La cantidad de numero negativos ingresados fue: "+contador);         
     }
}
