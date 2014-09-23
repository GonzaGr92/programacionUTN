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
public class Trapecio extends Irregulares{
    private double bMayor;
    private double bMenor;

    public Trapecio(double bMayor, double bMenor, double altura, float espesor) {
        this.altura = altura;
        this.bMayor = bMayor;
        this.bMenor = bMenor;
        this.espesor = espesor;
    }
    
    @Override
    public double superficie(){
        double resul;
        resul = ((bMenor + bMayor) * altura) /2;
        return resul;
    }
    @Override
    public double perimetro (){
        double resul;
        double lado1;
        double lado2;
        
        lado1 = altura + altura * 0.25;
        lado2 = lado1;
        resul = bMenor + bMayor + lado1 + lado2; 
        
        return resul;
    }
    
    @Override
    public float costo(){
        float resul;
        resul= (float) (superficie()*precio*espesor);
        return resul;
    }
}
