/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4bis;

/**
 *
 * @author gonzalo
 */
public class Circulo extends Figura{
    private final double pi = 3.14;
    protected double radio;

    public Circulo(double radio, float espesor) {
        this.radio = radio;
        this.espesor = espesor;
    }
    
    @Override
    public double superficie(){
        double resul;
        resul = pi*radio*radio;
        return resul;
    }
    
    @Override
    public double perimetro (){
        double resul;
        resul = pi*radio*2;
        return resul;
    }
    
    @Override
    public float costo(){
        float resul;
        resul= (float) (superficie()*precio*espesor);
        return resul;
    }
}
