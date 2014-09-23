/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;

/**
 *
 * @author gonzalo
 */
public class Ejercicio2 {
    
    //Declaracion de atributos
    public String cadena = "Esto es un ejemplo";
    public int numero = 150;
    public char caracter = 'c';
    
    //Constructor por defecto
    public Ejercicio2 (){
        
    }
    
    //Constructor sobrecargado con todos lo atributos
    public Ejercicio2 (String cadena, char caracter, int numero){
        this.cadena = cadena;
        this.caracter = caracter;
        this.numero = numero;
    }
    
    //Constructor sobrecargado con cadena
    public Ejercicio2 (String cadena){
        this.cadena = cadena;
    }
    
    //Metodo modificador
    public void cambiaValores (String cadena){
        this.cadena = cadena;
    }
    //Metodo modificador Sobrecargado
    public void cambiaValores (String cadena, int numero){
        this.cadena = cadena;
        this.numero = numero;
    }
    //Metodo productor
    public int elevarIntCuadrado () {
        this.numero = this.numero * this.numero;
        return numero;
    }
    //Metodo Observador
    public String verCadena(){
        return cadena;
    }
   
}
