//Acontinuacion se definen metodos que permiten hacer tratamientos a las cadenas y sus resultados.
public class Cadenas {

    public static void main(String[] args) {

        //DEFINICION: trim, trim permite eliminar los espacios antes y despues de un caracter en una cadena.
        
        System.out.println("********** Trim");
        String cadenaTrim = "         Hola ";
        System.out.println(cadenaTrim);
        cadenaTrim = cadenaTrim.trim();
        System.out.println(cadenaTrim);

        //DEFINICION: toUpperCase permite llevar una cadena a mayusculas.
        
        System.out.println("********** ToUpperCase");
        String cadenaUpper = "mayusculas";
        System.out.println(cadenaUpper);
        cadenaUpper = cadenaUpper.toUpperCase();
        System.out.println(cadenaUpper);

        //DEFINICION: toLowerCase permite llevar cadena a minusculas.
        
        System.out.println("********** ToLowerCase");
        String cadenaLower = "MINUSCULAS";
        System.out.println(cadenaLower);
        cadenaLower = cadenaLower.toLowerCase();
        System.out.println(cadenaLower);

        //DEFINICION: lenght permite obtener la cantidad de caracteres o el largo de una cadena.
        
        System.out.println("********** Length");
        String cadenaLen = "Cinco";
        int largo;
        System.out.println(cadenaLen);
        largo = cadenaLen.length();
        System.out.println("La cantidad de caracteres de 'Cinco' es: " + largo);

        //DEFINICION: charAt permite obtener el caracter que contiene una determinada posicion (el conteo empieza en 0).
        
        System.out.println("********** CharAt");
        String cadenaChar = "abcde";
        char caracter;
        System.out.println(cadenaChar);
        caracter = cadenaChar.charAt(2);        //Sustraeremos el 3er caracter (c)
        System.out.println("El caracter ubicado en la 3ra posicion (con indice 2) es: " + caracter);

        //DEFINICION: equals permite comparar 2 cadenas y nos devuelve un true o false.
        
        System.out.println("********** Equals");
        String cadenaE1 = "Negro";
        String cadenaE2 = "Blanco";

        System.out.println(cadenaE1);
        System.out.println(cadenaE2);

        if (cadenaE1.equals(cadenaE2)) {
            System.out.println("La cadena: " + cadenaE1 + " es igual a: " + cadenaE2);
        } else {
            System.out.println("La cadena: " + cadenaE1 + " es distinta a: " + cadenaE2);
        }

        //DEFINICION: indexOf permite buscar en una cadena otra cadena, ya sea caracteres, palabras , numeros
        // y nos devuelve el indice de la primera vez que aparece.
        
        System.out.println("********** IndexOf");
        String textoAux = "Los nombres de variables deben ser elegidos de tal manera que "
                + "el solo nombre describa el uso que se dará dentro del programa";
        String cadenaBusqueda = "que";
        int indiceBusqueda;

        System.out.println(textoAux);
        System.out.println("Buscaremos: " + cadenaBusqueda);

        indiceBusqueda = textoAux.indexOf(cadenaBusqueda);
        System.out.println("La primera vez que aparece 'que' es en el indice: " + indiceBusqueda);

        //DEFINICION: lastIndexOf al igual que index of nos permite buscar una cadena dentro de otra cadena
        // pero en vez de devolvernos el indice de la primera ves que aparece nos devolvera
        // la ultima vez que aparece.
        System.out.println("********** LastIndexOf");
        textoAux = "Los nombres de variables deben ser elegidos de tal manera que "
                + "el solo nombre describa el uso que se dará dentro del programa.";
        cadenaBusqueda = "que";
        int indiceBusquedaLast;
            //Usaremos el mismo ejemplo anterior esta vez nos deberia mostrar un indice distinto
            // correspondiente al ultimo que.
        System.out.println(textoAux);
        System.out.println("Buscaremos la ultima vez que aparece: " + cadenaBusqueda);

        indiceBusquedaLast = textoAux.lastIndexOf(cadenaBusqueda);
        System.out.println("La ultima vez que aparece 'que' es en el indice: " + indiceBusquedaLast);

        //DEFINICION: subString nos permite obtener un pedazo de una cadena original indicando el indice de 
        //comienzo hasta el indice final.
        
        System.out.println("********** SubString");
        String textoAux2 = "Ya estamos en la linea 105!";
        String subString;
            //DESDE y HASTA se muestran en mayusculas porque deberian ser constantes
            // en este caso no lo son porque las reutilizaremos mas abajo. Pero es una
            // buena practica definir los numeros que necesitamos en una variable y no 
            // dejar que anden sueltos por todo el codigo.

        int DESDE = 3;
        int HASTA = 10;

        System.out.println(textoAux2);
        subString = textoAux2.substring(DESDE, HASTA);
            // bien podria ser subString = textoAux2.substring(3, 9) pero rompe con lo que deciamos antes
        System.out.println("Sub String: " + subString);

        //DEFINICION: getChars es similar a substring PERO nos permite obtener TODOS los caracters de la subcadena
        // en un arreglo.
        
        System.out.println("********** GetChars");
        String textoAux3 = "Un programa";
        String caracteresCortados = "";
            //reutilizaremos desde y hasta del ejemplo anterior pero le cambiaremos los valores
        DESDE = 3;
        HASTA = textoAux3.length();     //(Ultimo)

        char[] caractDelTexto = new char[(HASTA - DESDE)];
            //Declaramos un arreglo con las cantidad de posisciones que necesitamos

        System.out.println(textoAux3);

        textoAux3.getChars(DESDE, HASTA, caractDelTexto, 0);
            //Pasamos los parametros necesarios DESDE donde queremos obtener los caracteres y HASTA donde
            //el arreglo donde nos guardara cada caracter obtenido y por ultimo desde que indice
            //queremos que empieze a guardar en el arreglo, por defecto 0

        System.out.println("En el arreglo obtenido: ");

        for (int i = 0; i < caractDelTexto.length; i++) {
            System.out.println(caractDelTexto[i]);
            //Una vez obtenido el arreglo imprimimos uno a uno los carecteres obtenidos
            caracteresCortados = caracteresCortados + caractDelTexto[i];
            //Esta operacion concatena los caracteres en un String (basicamente los une denuevo en una cadena)
        }

        System.out.println("Convertido a una cadena: " + caracteresCortados);

        //DEFINICION: replace permite remplazar un caracter por otro
        
        System.out.println("********** Replace");
        String cadenaRemp  = "BEIOU BEIOU BEIOU";
        char caracterViejo = 'B';
        char caracterNuevo = 'A';
        
        System.out.println(cadenaRemp);
        cadenaRemp = cadenaRemp.replace(caracterViejo, caracterNuevo);
        
        System.out.println(cadenaRemp);

    }

}
