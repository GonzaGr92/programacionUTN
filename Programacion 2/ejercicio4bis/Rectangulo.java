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
public class Rectangulo extends Figura{

    protected double alto;
    protected double ancho;

    public Rectangulo(double alto, double ancho, float espesor) {
        this.alto = alto;
        this.ancho = ancho;
        this.espesor = espesor;
    }
    
    @Override
    public double superficie() {
        double resul;
        resul = ancho * alto;
        return resul;
    }

    @Override
    public double perimetro() {
        double resul; 
        resul = ancho * 2 + alto * 2;
        return resul;
    }

    @Override
    public float costo() {
        float resul;
        resul = (float) (superficie()* espesor * precio);
        return resul;
    }
    
}
