
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       double fianza, cuota = 0;
       
       System.out.print("Ingrese monto de la fianza: ");
       fianza = sc.nextDouble();
       
       if(fianza < 50000){
           cuota = ((3*fianza)/100);
       }
       else{
           cuota = ((2*fianza)/100);
       }
       
       System.out.print("Cuota: "+cuota);
       
       
    }
}
