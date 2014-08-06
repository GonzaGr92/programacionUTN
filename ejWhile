package dieguito;
import javax.swing.*;

//SUMAR NOTAS MAYORES A 7 CON BLUCLE WHILE

public class While {
     public static void main(String[] args) {
        
         String centinela= "";
         String cadenanotas="";
         int notas;
         int suma =0;
         
         centinela=JOptionPane.showInputDialog("quiere iniciar el programa?(s o n)");
         while (centinela.equals("s")) {
             
            cadenanotas=JOptionPane.showInputDialog("ingrese la nota");
            notas=Integer.parseInt(cadenanotas);
             if (notas<7) {
                 
                 suma=suma+notas;
             } 
             centinela=JOptionPane.showInputDialog("desea volver a ingresar una nota? (s o n)");
            
         }
         
      JOptionPane.showMessageDialog(null, "la suma total es: "+suma);
  }
 
}
