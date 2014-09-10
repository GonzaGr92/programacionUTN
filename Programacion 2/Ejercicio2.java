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
public class Ejercicio2 {
    public String cadena = "Esto es un ejemplo";
    public int numero = 150;
    public char caracter = 'c';
    
    public Ejercicio2 (){
        
    }
    public Ejercicio2 (String cadena, char caracter, int numero){
        this.cadena = cadena;
        this.caracter = caracter;
        this.numero = numero;
    }
    
    public Ejercicio2 (String cadena){
        this.cadena = cadena;
    }
    
    public void cambiaValores (String cadena){
        this.cadena = cadena;
    }
    
    public void cambiaValores (String cadena, int numero){
        this.cadena = cadena;
        this.numero = numero;
    }
    
    public int elevarIntCuadrado () {
        this.numero = this.numero * this.numero;
        return numero;
    }
    
    public String verCadena(){
        return cadena;
    }
   
}
