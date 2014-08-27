package clase1;
import javax.swing.*; //Deben importar la libreria de java que contiene los paneles necesarios para leer y 
											//escribir datos en una ventana.

public class Ej4{

	//En este programa pediremos que se ingrese un numero y luego se muestre el mismo por una ventana
	
	String auxNumeroEntero;		//Declaramos una variable de tipo cadena que recibira en una primera instancia el numero
														//que ingrese el usuario. 
	int numeroEntero;					//En esta variable guardaremos el numero entero para luego mostrarlo.
	
	auxNumeroEntero = JOptionPane.showInputDialog("Ingrese un numero entero"); 
	//Esta ventana (JOptionPane.showInputDialog) nos permite que el usuario ingrese una cadena de caracteres
	// en los que puede o no contener un numero, en este caso si no es un entero el programa dejara de funcionar.
	
	numeroEntero = Integer.parseInt(auxNumeroEntero);
	//Integer.parseInt permite converir la cadena a un numero entero para luego poder ser sometido a alguna operacion
	//Ej, suma, resta, comparacion, etc.
	
	JOptionPane.showMessageDialog(null,"El numero que ingreso es: "+numeroEntero);
	//Finalmente mostramos el numero ingresado, para ello con + concatenamos al mensaje (que va siempre entre comillas) 
	// el valor del numero ingresado

}
