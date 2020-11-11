
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num1, num2, sol;
       
       System.out.print("Ingrese el primer numero: ");
       num1 = sc.nextInt();
       System.out.print("Ingrese el primer numero: ");
       num2 = sc.nextInt();
       
       if(num1 == num2){
           sol = num1*num2;
       }
       else if(num1 > num2){
           sol = num1 - num2;
       }
       else{
           sol = num1 + num2;
       }
       
       System.out.print("La solucion es: "+sol);
       
    }
}
