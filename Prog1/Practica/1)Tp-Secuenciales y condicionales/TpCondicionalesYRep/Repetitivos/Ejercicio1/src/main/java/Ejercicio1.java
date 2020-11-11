
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int S =0, V = 0, mayor = 0, doble = 0;
       
       do{
           System.out.print("Ingrese numero entero para S: ");
           S = sc.nextInt();
           System.out.print("Ingrese numero entero para V: ");
           V = sc.nextInt();
           
           if(S > V){
               mayor = mayor + 1;
           }
           if(S == (V*2) && (S != 0 || V != 0)){
               doble = doble +1;
           }
           
       }while(S != 0 && V != 0);
       
       System.out.println("S fue mayor que V "+mayor+" veces.");
       System.out.println("S fue el doble que V "+doble+" veces.");
       
    }
}
