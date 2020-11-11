
import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num;
       
       System.out.print("Ingrese un numero entero distinto de '0': ");
       num = sc.nextInt();
       
       if(num % 2 == 0){
           System.out.print("El numero es par");
       }
       else{
           System.out.print("El numero es impar");
       }
       
    }
    
}
