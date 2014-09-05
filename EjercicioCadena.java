/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gonzalo grassi
 */
public class EjercicioCadena {
    
    /*
    # LICENSE
    # Copyright 2010 Google Inc.
    # Except as otherwise noted, the content of this page is licensed under 
    # the Creative Commons Attribution 3.0 License, and code samples are 
    # licensed under the Apache 2.0 License. For details, see our Site Policies.
    # Links: 
    # http://creativecommons.org/licenses/by/3.0/
    # http://www.apache.org/licenses/LICENSE-2.0
    # https://developers.google.com/site-policies
    #
    # Portions of this page are modifications based on work created and
    # shared by Google and used according to terms described in the 
    # Creative Commons 3.0 Attribution License. 
    #
    # Google's Python Class
    # http://code.google.com/edu/languages/google-python-class/
    */
    
    /*
     A. donuts
     dado un contador entero de un número de donas, retornar una cadena (String)
     de la forma "Numero de donas: <contador>", donde <contador> es el
     número pasado. Sin embargo, si el contador es 10 o más, entonces usar
     la palabra "muchas" en vez del contador verdadero.
     Así donuts(5) devuelve "Numero de donas: 5"
     y donuts(23) devuelve "Numero de donas: muchas"
     */

    public static String donuts(int contador) {
        // +++ tu codigo aqui +++
        return "Aqui el resultado";
    }

    /*    
     B. both_ends
     Dada una cadena s, devuelva una cadena hecha de los primeros 2
     y los últimos 2 caracteres de la cadena original,
     así 'spring' devuelve 'spng'. Sin embargo, si la longitud de la cadena
     es menos de 2, returnar una cadena vacía en su lugar.
     */
    public static String both_ends(String s) {
        // +++tu código aquí+++
        return "Aqui el resultado";
    }

    /*    
     C. fix_start
     Dada una cadena s, devuelva una cadena
     donde todas las ocurrencias del primer caracter han
     cambiado a '*', excepto por el primer caracter mismo.
     ej: 'babble' retorna 'ba**le'
     Asuma que la cadena es de 1 o más caracteres.
     Ayuda: s.replace('a', 'z'); retorna una versión de la cadena s
     donde todas las apariciones de a han sido reemplazadas por z.
     */
    public static String fix_start(String s) {
        // +++tu código aquí+++
        return "Aqui el resultado";
    }

    /*    
     D. MixUp
     Dadas las cadenas a y b, retornar una cadena simple con a y b separados
     pon un espacio '<a> <b>', excepto que hay que intercambiar los 
     2 primeros caracteres de cada cadena.
     ej.
     'mix', pod' -> 'pox mid'
     'dog', 'dinner' -> 'dig donner'
     Asumir a y b tienen una longitud de 2 o más.
     */
    public static String mix_up(String a, String b) {
        // +++tu código aquí+++
        return "Aqui el resultado";
    }

    /*
    Función main()
    Llama a las funciones de arribacon entradas interesantes,
    utilizando test() para verificar si cada resultado es correcto o no.
    */
    public static void main(String[] args) {
        
        System.out.println("donuts");
        //Each line calls donuts, compares its result to the expected for that call.
        test(donuts(4), "Numero de donas: 4");
        test(donuts(9), "Numero de donas: 9");
        test(donuts(10), "Numero de donas: muchas");
        test(donuts(99), "Numero de donas: muchas");

        
        System.out.println("both_ends");
        test(both_ends("spring"), "spng");
        test(both_ends("Hello"), "Helo");
        test(both_ends("a"), "");
        test(both_ends("xyz"), "xyyz");

        
        System.out.println("fix_start");
        test(fix_start("babble"), "ba**le");
        test(fix_start("aardvark"), "a*rdv*rk");
        test(fix_start("google"), "goo*le");
        test(fix_start("donut"), "donut");

        System.out.println("mix_up");
        test(mix_up("mix", "pod"), "pox mid");
        test(mix_up("dog", "dinner"), "dig donner");
        test(mix_up("gnash", "sport"), "spash gnort");
        test(mix_up("pezzy", "firm"), "fizzy perm");

    }
    
    /*
    Función simple test() utilizada en main() para mostrar
    lo que retorna cada función vs lo que debería retornar.
    */
    public static void test(String got, String expected) {
        String prefix;
        if (got.equals(expected)) {
            prefix = "    OK ";
        } else {
            prefix = "    X ";
        }
        System.out.println(prefix + " obtuvo: " + got + " se esperaba: " + expected);
    }

}
