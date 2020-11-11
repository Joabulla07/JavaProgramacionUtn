
import java.util.Scanner;


public class Ejercicio10 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, i=0, suma = 0, cont=0;
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        while(cont != num && i <=10000){
            
            if(i % 2 != 0){
                suma = suma + i;
                cont = cont + 1;
                System.out.println(i);
            }
         i++;   
        }
        
        System.out.println("La suma es: "+suma);
        
     }
}
