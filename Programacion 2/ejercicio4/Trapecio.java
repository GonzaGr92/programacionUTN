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
public class Trapecio {
    protected double altura;
    private double bMayor;
    private double bMenor;
    protected float espesor;
    public static final float precio = 5.0F;

    public Trapecio(double altura, double bMayor, double bMenor, float espesor) {
        this.altura = altura;
        this.bMayor = bMayor;
        this.bMenor = bMenor;
        this.espesor = espesor;
    }
    
    public double superficie(){
        double resul;
        resul = ((bMenor + bMayor) * altura) /2;
        return resul;
    }
    public float perimetro (){
        float resul;
        double lado1;
        double lado2;
        
        lado1 = altura + altura * 0.25;
        lado2 = lado1;
        resul = (float) (bMenor + bMayor + lado1 + lado2); 
        
        return resul;
    }
    
    public float costo(){
        float resul;
        resul= (float) (superficie()*precio*espesor);
        return resul;
    }
}
