
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       float altura;
       
       System.out.print("Ingrese altura en cm: ");
       altura = sc.nextFloat();
       
       if(altura <= 150){
           System.out.print("Persona de altura baja");
       }
       else if(altura > 150 && altura <= 170){
           System.out.print("Persona de altura media");
       }
       else{
           System.out.print("Persona de altura alta");
       }
       
    }
}
