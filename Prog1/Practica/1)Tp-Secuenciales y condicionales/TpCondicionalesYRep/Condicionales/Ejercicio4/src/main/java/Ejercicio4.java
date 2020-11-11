
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num1, num2, num3;
       
       System.out.print("Ingrese el primer numero entero: ");
       num1 = sc.nextInt();
       System.out.print("Ingrese el segundo numero entero: ");
       num2 = sc.nextInt();
       System.out.print("Ingrese el tercero numero entero: ");
       num3 = sc.nextInt();
       
       
       if(num1 > num2 && num1 > num3 ){
           System.out.print("El mayor es el numero 1: "+num1);
       }
       else if(num2 > num1 && num2 > num3){
           System.out.print("El mayor es el numero 2: "+num2);
       }
       else{
           System.out.print("El mayor es el numero 3: "+num3);
       }
    }
}
