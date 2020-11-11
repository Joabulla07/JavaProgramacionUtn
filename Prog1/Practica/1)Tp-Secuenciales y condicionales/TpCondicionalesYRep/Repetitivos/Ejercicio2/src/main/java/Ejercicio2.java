
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int i;
       
       for(i=2;i<=300;i++){
           if(i % 2 == 0){
               System.out.println(i);
           }
       }
    }
}
