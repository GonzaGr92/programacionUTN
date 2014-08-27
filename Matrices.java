public class Matrices {
	public static void main (String [] args){
		//Declaracion de matriz cuadrada de numeros enteros (5*5)
		int tamañoDeMatriz = 5;
		int [][] matriz = new int [tamañoDeMatriz][tamañoDeMatriz];

		//Llenamos matriz con enteros generados al azar del 0 al 9
		for (int i = 0 ; i< tamañoDeMatriz; i++) {
			for (int j = 0; j< tamañoDeMatriz; j++) {
				matriz [i][j] = (int)(Math.random() * 10);
			}
		}

		//Mostrar matriz
		System.out.println("Primera matriz");
		for (int i = 0 ; i<tamañoDeMatriz; i++) { //Recorre filas
			for (int j = 0; j<tamañoDeMatriz; j++) { //Recorre columnas
				System.out.print(matriz [i][j]+"  "); 
				//Imprime por pantalla cada valor de la fila a medida que cambia el indice de la columna
				// (x x x x x)
			}
			System.out.println(); //Imprime un salto cuando cambia de fila
			// (x x x x x)
			// (_ )
		}

		//Llenaremos un matriz n x m donde la cantidad de filas son distintas de la cantidad de columnas (5F x 7C)
		int tamañoDeFilas = 5;
		int tamañoDeColumnas = 7;
		int [][] segundaMatriz = new int [tamañoDeFilas][tamañoDeColumnas]; 

		for (int i = 0; i < tamañoDeFilas ; i++ ) {
		  	for (int j = 0; j < tamañoDeColumnas ; j++ ) {
		  		segundaMatriz [i][j] = (int) (Math.random()*10);
		  	}
		}

		//Mostrar matriz  
		System.out.println("Segunda matriz");
		for (int i = 0 ; i < tamañoDeFilas; i++) { 
			for (int j = 0; j < tamañoDeColumnas; j++) { 
				System.out.print(segundaMatriz [i][j]+"  "); 
			}
			System.out.println(); 
		}
	}

}