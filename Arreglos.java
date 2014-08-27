public class Arreglos {

     public static void main(String[] args) {
     	//Declaracion de arreglo de enteros de 10 posiciones
     	int [] arre1 = new int [10];

     	//Se llena el arreglo con numeros random del 0 al 99
     	for (int i = 0 ; i< arre1.length ; i++ ) {
     		arre1 [i] = (int) (Math.random() * 100);
     	}

     	//Mostrar el arreglo
     	System.out.println("Arreglo: ");
     	for (int i = 0 ; i< arre1.length ; i++) {
     		System.out.print(arre1 [i] + " , ");
     	}

     	//Otra forma de declarar un arreglo (inicializando los valores)

     	int [] arre2 = {100,2,21,13};
		
          //Mostrar el arreglo
     	System.out.println("Arreglo: ");
     	for (int i = 0 ; i< arre2.length ; i++) {
     		System.out.print(arre2 [i] + " , ");
     	}     	

     }
 }