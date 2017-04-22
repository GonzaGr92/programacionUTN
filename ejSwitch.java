/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author gonza
 */
 
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
       
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("Selecciono una suma");
                break;
            case 2:
                System.out.println("Selecciono una resta");
                break;
            case 3:
                System.out.println("Selecciono una multiplicacion");
                break;
            case 4:
                System.out.println("Selecciono una division");                
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta");
        }
    }
}
