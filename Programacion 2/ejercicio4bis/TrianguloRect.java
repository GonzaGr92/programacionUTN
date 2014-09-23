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
public class TrianguloRect extends Irregulares {

    private double hipotenusa;
    private double base;

    public TrianguloRect(double hipotenusa, double altura, float espesor) {
        this.hipotenusa = hipotenusa; 
        this.altura = altura;
        this.espesor = espesor;
        this.base = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(altura, 2));
    }

    @Override
    public double superficie() {
        double resul;
        resul = base * altura / 2;
        return resul;
    }

    @Override
    public double perimetro() {
        double resul;
        resul = base + altura + hipotenusa;
        return resul;
    }

    @Override
    public float costo() {
        float resul;
        resul = (float) (superficie() * precio * espesor);
        return resul;
    }

}
