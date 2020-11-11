
import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num1;
       
       System.out.print("Ingrese un numero del 1 al 10: ");
       num1 = sc.nextInt();
       
       switch(num1){
           case 1: System.out.print("I");
                   break;
           case 2: System.out.print("II");
                   break;
           case 3: System.out.print("III");
                   break;
           case 4: System.out.print("IV");
                   break;
           case 5: System.out.print("V");
                   break;
           case 6: System.out.print("VI");
                   break;
           case 7: System.out.print("VII");
                   break;
           case 8: System.out.print("VIII");
                   break;
           case 9: System.out.print("IX");
                   break;
           case 10: System.out.print("X");
                   break;
           default: System.out.print("El numero no corresponde al intervano 1-10");
       }
       
       
    }
}
