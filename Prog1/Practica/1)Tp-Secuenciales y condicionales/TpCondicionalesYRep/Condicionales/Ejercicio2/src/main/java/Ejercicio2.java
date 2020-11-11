
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       float total, pagar = 0;
       
       System.out.print("Ingrese total a pagar");
       total = sc.nextFloat();
       
       if(total > 1000){
           pagar = total - ((20*total)/100);
       }
      
           System.out.print("Total a pagar: "+pagar);
    }  
}
