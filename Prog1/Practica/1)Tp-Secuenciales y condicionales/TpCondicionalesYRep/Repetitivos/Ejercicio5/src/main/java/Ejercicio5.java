
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num, num1, resto, suma = 0;
       
       System.out.println("Ingrese un numero positivo entero: ");
       num = sc.nextInt();

       
       while(num>=10){
           num1 = num/10;
           resto = num % 10;
           suma = suma + resto;
           num = num1;
       }
       if(num<10){
           suma = suma + num;
           }
       
       System.out.print("La suma es: "+suma);
    }
}
