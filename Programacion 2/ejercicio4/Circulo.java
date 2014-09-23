/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4;

/**
 *
 * @author gonzalo
 */
public class Circulo {
    private final double pi = 3.14;
    protected double radio;
    protected double espesor;
    public static final float precio = 4.0F;

    public Circulo(double radio, double espesor) {
        this.radio = radio;
        this.espesor = espesor;
    }
    
    public double superficie(){
        double resul;
        resul = pi*radio*radio;
        return resul;
    }
    
    public float perimetro (){
        float resul;
        resul = (float) (pi*radio*2);
        return resul;
    }
    
    public float costo(){
        float resul;
        resul= (float) (superficie()*precio*espesor);
        return resul;
    }
}
