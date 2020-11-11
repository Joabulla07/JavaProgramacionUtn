
import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       
       int num, num1, num2, suma;
       
       System.out.println("Ingrese un numero de 2 cifras: ");
       num = sc.nextInt();
       
       
       num1 = num/10;
       num2 = num % 10;
       
       System.out.println("numero 1: "+num1+"; numero 2:"+num2);
       
       suma = num1 + num2;
       
       if(suma % 3 == 0){
           System.out.print("Es multiplo de 3.");
       }
       else{
           System.out.print("No es multiplo de 3.");
       }
       
    }
}
