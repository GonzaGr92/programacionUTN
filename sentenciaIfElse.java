package clase1;

public class Ej3 {

     public static void main(String[] args) {
         
         int a;
         a=10;  //Pueden cambiar el valor de a para probar los distintos casos
         
         //If expresa una condicion que debe cumplirse (por verdadero);
         if(a==10){
          //Si a es igual la ejecucion del programa entrara aqui, imprimiremos entonces que a vale 10
          System.out.println("a es igual a 10");
         }
         
         if(a>0){
          //Si a es mayor o igual a 0 a es un numero positivo
          System.out.println("a es un numero positivo");
        }else{
	  if(a==0){
	 	System.out.println(a es cero);
	  }else{
          //Else es todos aquellos casos que no satisfacen a que a se mayor o igual que cero, en este caso sera menor
          //que cero (negativo)
          System.out.println("a es un numero negativo");
        }

     }
}
}
