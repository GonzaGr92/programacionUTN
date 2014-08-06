package dieguito;
import javax.swing.*;

//SUMAR LAS NOTAS MAYORES A 7

public class Dowhile {
    public static void main(String[] args) {
    String centinela= "";
         String cadenanotas="";
         int notas;
         int suma =0;
        
        do {
           cadenanotas= JOptionPane.showInputDialog("Ingrese la nota");
           notas=Integer.parseInt(cadenanotas);
           
            if (notas<7) {
                
                suma=suma+notas;
            } 
            
            centinela=JOptionPane.showInputDialog("desea ingresar otra nota? (s o n)");
        } while (centinela.equals("s"));
        
        JOptionPane.showMessageDialog(null, "la suma es: "+suma);
        
     }
    
}
