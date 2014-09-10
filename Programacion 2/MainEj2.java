/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapracticaprog2;

/**
 *
 * @author gonzalo
 */
public class MainEj2 {
    public static void main (String [] args){
        //Constructor por defecto
        Ejercicio2 ej2a = new Ejercicio2 ();
        System.out.println("------- Atributos de A: ");
        System.out.println(ej2a.cadena);
        System.out.println(ej2a.caracter);
        System.out.println(ej2a.numero);
        
        //Constructor Sobrecargado
        Ejercicio2 ej2b = new Ejercicio2 ("Segundo objeto", 'z', 12);
        System.out.println("------- Atributos de B: ");
        System.out.println(ej2b.cadena);
        System.out.println(ej2b.caracter);
        System.out.println(ej2b.numero);
        
        //Tercer Constructor
        Ejercicio2 ej2c = new Ejercicio2 ("Otro objeto distinto");
        System.out.println("------- Atributos de C: ");
        System.out.println(ej2c.cadena);
        System.out.println(ej2c.caracter);
        System.out.println(ej2c.numero);
        
        Ejercicio2 ej2d = new Ejercicio2 ("Tercer objeto", 'm', 24);
        System.out.println("------- Atributos de D: ");
        System.out.println(ej2d.cadena);
        System.out.println(ej2d.caracter);
        System.out.println(ej2d.numero);
        
        Ejercicio2 ej2e = new Ejercicio2 ("Cuarto objeto", 'b', 156);
        System.out.println("------- Atributos de E: ");
        System.out.println(ej2e.cadena);
        System.out.println(ej2e.caracter);
        System.out.println(ej2e.numero);
        
        //Comparacion de objetos
        if (ej2d.equals(ej2e)) {
            System.out.println("Los objetos D y E son iguales");
        }else{
            System.out.println("Los objetos D y E son distintos");
        }
        
        //Comparacion de atributos de objetos
        if (ej2d.numero == ej2a.numero) {
            System.out.println("El atributo numero del objeto a y d son iguales");
        }else{
            System.out.println("El atributo numero del objeto a y d son distintos");
        }
        
        //Modificacion directa de valores de atributos
        ej2a.cadena = "Primera cadena";
        ej2a.numero = ej2a.numero * ej2a.numero;
        
        System.out.println("------- Atributos de A (modificados): ");
        System.out.println(ej2a.cadena);
        System.out.println(ej2a.caracter);
        System.out.println(ej2a.numero);
        
        //Metodo modificador
        ej2b.cambiaValores("Valor cambiado por metodo");
        //Metodo productor
        ej2b.elevarIntCuadrado();
        
        System.out.println("------- Atributos de B (modificados): ");
        //Metodo Observador
        System.out.println(ej2b.verCadena());
        System.out.println(ej2b.caracter);
        System.out.println(ej2b.numero);
        
        //Metodo Modificador sobrecargado
        ej2c.cambiaValores("Cambio valores por metodo sobrecargado", 15567);
        System.out.println("------- Atributos de C (modificados): ");
        System.out.println(ej2c.cadena);
        System.out.println(ej2c.caracter);
        System.out.println(ej2c.numero);
        
        
        
        
        
    }
}
