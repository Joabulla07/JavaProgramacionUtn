
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String args[]){
    
       int prom, total = 0;
        
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese la nota total \n");
       
       total = sc.nextInt();
        
       prom = total/3;
        
        if (prom < 60){
            System.out.print("Desaprobado");
        }
        else{
            System.out.print("Aprobado");
        }
    
    }
}
