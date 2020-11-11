
import java.util.Scanner;


public class Ejercicio15 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       
       int n1, n2, p1, p2, total;
       String masVenta;
       
       System.out.print("Ingrese cantidad de conejos blancos: ");
       n1 = sc.nextInt();
       System.out.print("Ingrese precio de conejos blancos: ");
       p1 = sc.nextInt();
       System.out.print("Ingrese cantidad de conejos negros: ");
       n2 = sc.nextInt();
       System.out.print("Ingrese precio de conejos negros: ");
       p2 = sc.nextInt();
       
       
       total = (n1*p1) + (n2*p2);
       
       if(n1 > n2){
           masVenta = "Conejo blanco";
       }
       else{
           masVenta = "Conejo negro";
       }
       
       System.out.println("Total de la venta: "+total);
       System.out.print("El mas vendido: "+masVenta);
       
    }
}
