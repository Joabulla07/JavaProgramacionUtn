
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int edad1, edad2, dife, herMayor;
       
       
       System.out.print("Ingrese la edad del primer hermano: \n");
       edad1 = sc.nextInt();
       System.out.print("Ingrese la edad del segundo hermano: \n");
       edad2 = sc.nextInt();
       
      if(edad1 >= edad2){
           herMayor = edad1;
           dife = edad1 - edad2;
       }
       else{
           herMayor = edad2;
           dife = edad2 - edad1;
       }
       System.out.print("El hermano mayor es el hermano de : "+herMayor+" y la diferencia de edad es: "+dife);
       
    }
}
