
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int num=0, suma=0, tot=0, prom;
       
        do{
           System.out.print("Ingrese un numero entre 0 y 100: ");
           num = sc.nextInt();
           
           if(num>=0 && num<=100){
           suma = suma + num;
           tot = tot + 1;
           }
           else{
           System.out.println("El numero se encuentra fuera de rango");
           }
       }while(num>=0 && num<=100);
        
       prom = suma/tot;
       System.out.println("La suma total es: "+suma);
       System.out.println("El promedio es: "+prom);
    }
}
