/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

/**
 *
 * @author gonzalo
 */
public class Ejercicio3 {
    private int alfa;
    public String beta;

    public Ejercicio3() {
    }

    public Ejercicio3(int alfa) {
        this.alfa = alfa;
    }

    public Ejercicio3(int alfa, String beta) {
        this.alfa = alfa;
        this.beta = beta;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    
    public String mayusBeta (String beta){
        beta = beta.toUpperCase();
        this.beta = beta;
        return beta;
    }
    
    public void mostrarAtributos (){
        System.out.println("Alfa es un entero, su valor es: "+this.alfa);
        System.out.println("Beta es una cadena, su valor es: "+this.beta);
    }
}
